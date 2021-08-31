function [delta_V,distance_target_end,distance_target_begin] = STK_simulation(target_obj,chaser_obj,time)
%STK_SIMULATION Summary of this function goes here
%   Detailed explanation goes here

    global STK_version;
    % Get reference to running STK instance
    uiApplication = actxGetRunningServer(STK_version); %change with your STK version
    
%   STKXApplication = actxserver('STKX12.application');
%   uiApplication.NoGraphics = true;
%   root = actxserver('AgStkObjects12.AgStkObjectRoot');

    % Get our IAgStkObjectRoot interface
    root = uiApplication.Personality2;


% Inputs are target and chaser vectors

    %% TARGET IMPLEMENT
    if root.ObjectExists(strcat('Satellite/','target_oneweb'))
        satellite_target = root.GetObjectFromPath(strcat('Satellite/','target_oneweb'));
        
    else
        satellite_target = root.CurrentScenario.Children.New('eSatellite', 'target_oneweb');
    
    end
    
    satellite_target.SetPropagatorType('ePropagatorAstrogator')
    
    satellite_target.Propagator.MainSequence.RemoveAll();
    initState  = satellite_target.Propagator.MainSequence.Insert('eVASegmentTypeInitialState', 'Initial state', '-');
    
    initState.InitialState.Epoch = root.CurrentScenario.StartTime; %scenario.StartTime;
    initState.SetElementType('eVAElementTypeKeplerian');
    
    kep = initState.Element;
    kep.SemiMajorAxis = target_obj.SemiMajorAxis;
    kep.ArgOfPeriapsis = target_obj.ArgOfPeriapsis;
    kep.Eccentricity = target_obj.Eccentricity;
    kep.Inclination = target_obj.Inclination;
    kep.RAAN = target_obj.RAAN;
    kep.TrueAnomaly = target_obj.TrueAnomaly;
    
    propagate_targ = satellite_target.Propagator.MainSequence.Insert('eVASegmentTypePropagate', 'Propagate_targ', '-');
    propagate_targ.StoppingConditions.Item('Duration').Properties.Trip = time;
    propagate_targ.Properties.Color = 16776960;  % Blue
    
    resolution = satellite_target.Graphics.Resolution;
    resolution.Orbit = 2000;
    
    
    %% Adding the CHASER satellite
    if root.ObjectExists(strcat('Satellite/','satellite_chaser'))
        satellite_chaser = root.GetObjectFromPath(strcat('Satellite/','satellite_chaser'));
        
    else
        satellite_chaser = root.CurrentScenario.Children.New('eSatellite', 'satellite_chaser');
    
    end
    
    satellite_chaser.Propagator.MainSequence.RemoveAll();
    initState  = satellite_chaser.Propagator.MainSequence.Insert('eVASegmentTypeInitialState', 'Initial state', '-');
    
    initState.InitialState.Epoch = root.CurrentScenario.StartTime; %scenario.StartTime;
    initState.SetElementType('eVAElementTypeKeplerian');
    
    kep = initState.Element;
    kep.SemiMajorAxis = chaser_obj.SemiMajorAxis;
    kep.ArgOfPeriapsis = chaser_obj.ArgOfPeriapsis;
    kep.Eccentricity = chaser_obj.Eccentricity;
    kep.Inclination = chaser_obj.Inclination;
    kep.RAAN = chaser_obj.RAAN;
    kep.TrueAnomaly = chaser_obj.TrueAnomaly;
    
    propagate_chas = satellite_chaser.Propagator.MainSequence.Insert('eVASegmentTypePropagate', 'Propagate_targ', '-');
    propagate_chas.StoppingConditions.Item('Duration').Properties.Trip = time;
    %propagate_chas.Properties.Color = 60179113;  % green
    
    resolution = satellite_chaser.Graphics.Resolution;
    resolution.Orbit = 2000;
    
    
    %Update graphics and show orbits
    satellite_target.Propagator.RunMCS;
    satellite_chaser.Propagator.RunMCS;

    %% Need chaser in sat target LVLH frame
    
    root.UnitPreferences.Item('DateFormat').SetCurrentUnit('EpSec');
    
    data_chaser_in_LVLH_target = satellite_target.DataProviders.GetDataPrvTimeVarFromPath('Vectors(LVLH)/satellite_chaser').Exec(root.CurrentScenario.StartTime, root.CurrentScenario.StopTime, 1);
    
    data_chaser_X = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('x').GetValues);
    data_chaser_Y = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('y').GetValues);
    data_chaser_Z = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('z').GetValues);
    
    data_chaser_Vx = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('Derivative x').GetValues);
    data_chaser_Vy = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('Derivative y').GetValues);
    data_chaser_Vz = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('Derivative z').GetValues);
    
    
    data_target_inertial = satellite_chaser.DataProviders.Item('Astrogator Values').Group.Item('Cartesian Elems').Exec(root.CurrentScenario.StartTime,root.CurrentScenario.StopTime,1);
    
    dataXc = cell2mat(data_target_inertial.DataSets.GetDataSetByName('X').GetValues);
    dataYc = cell2mat(data_target_inertial.DataSets.GetDataSetByName('Y').GetValues);
    dataZc = cell2mat(data_target_inertial.DataSets.GetDataSetByName('Z').GetValues);
    
    dataVXc = cell2mat(data_target_inertial.DataSets.GetDataSetByName('Vx').GetValues);
    dataVYc = cell2mat(data_target_inertial.DataSets.GetDataSetByName('Vy').GetValues);
    dataVZc = cell2mat(data_target_inertial.DataSets.GetDataSetByName('Vz').GetValues);
    

    %% Calculation of the BOOST to proceed rendez-vous
    dR0 = [data_chaser_X(1,1) data_chaser_Y(1,1) data_chaser_Z(1,1)];
    dV0 = [data_chaser_Vx(1,1) data_chaser_Vy(1,1) data_chaser_Vz(1,1)];
    
    vA0targ = [dataVXc(1,1) dataVYc(1,1) dataVZc(1,1)];
    rA0targ = [dataXc(1,1) dataYc(1,1) dataZc(1,1)];
    
    %calculation of the CW matrix
    t = time; %pour x heures
    n = norm(vA0targ)/norm(rA0targ);  %rad/s
    
    Irr = [4-3*cos(n*t) 0 0 ; 6*(sin(n*t)-n*t) 1 0 ; 0 0 cos(n*t)];
    Irv = [(1/n)*sin(n*t) (2/n)*(1-cos(n*t)) 0 ; (2/n)*(cos(n*t)-1) (1/n)*(4*sin(n*t)-3*n*t) 0 ; 0 0 (1/n)*sin(n*t)];
    Ivr = [3*n*sin(n*t) 0 0 ; 6*n*(cos(n*t)-1) 0 0 ; 0 0 -n*sin(n*t)];
    Ivv = [cos(n*t) 2*sin(n*t) 0 ; -2*sin(n*t) 4*cos(n*t)-3 0 ; 0 0 cos(n*t)];
    
    dV0_plus = -inv(Irv)*Irr*dR0';
    
    dV0_min = dV0';
    
    %dVf_min = Ivr*dR0 + Ivv*dV0_plus;  
    %Delta_V_final = -dVf_min;
    
    Delta_V_initial = dV0_plus - dV0_min;
    
    %Boost_dV = norm(Delta_V_initial)*1000; %m/s
    
    

    %% Implement BOOST in STK
    %Update Chaser initial speed
    initState.SetElementType('eVAElementTypeCartesian'); %in km/s
    initState.CoordSystemName = "Satellite/target_oneweb LVLH";
    % 
    %initState.Element.X = dR0(1,1)
    %initState.Element.Y = dR0(2,1)
    %initState.Element.Z = dR0(3,1)
    initState.Element.Vx= dV0_plus(1,1);
    initState.Element.Vy = dV0_plus(2,1);
    initState.Element.Vz = dV0_plus(3,1);
    
    %Update graphics and show orbits
    satellite_target.Propagator.RunMCS;
    satellite_chaser.Propagator.RunMCS;
    
    %retrieve data from new simulation
    data_chaser_in_LVLH_target = satellite_target.DataProviders.GetDataPrvTimeVarFromPath('Vectors(LVLH)/satellite_chaser').Exec(root.CurrentScenario.StartTime, root.CurrentScenario.StopTime, 1);
    
    data_chaser_X = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('x').GetValues);
    data_chaser_Y = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('y').GetValues);
    data_chaser_Z = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('z').GetValues);
    
    data_chaser_Vx = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('Derivative x').GetValues);
    data_chaser_Vy = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('Derivative y').GetValues);
    data_chaser_Vz = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('Derivative z').GetValues);
    
    dV0_plus = [data_chaser_Vx(1,1) data_chaser_Vy(1,1) data_chaser_Vz(1,1)];

    distance_STK_arrival = [data_chaser_X(time,:) data_chaser_Y(time,:) data_chaser_Z(time,:)];
    distance_arrival_STK = round(norm(distance_STK_arrival)*1000); %metre
    
    Delta_V = dV0_plus' - dV0_min;
    Boost = norm(Delta_V)*1000;
    
    %figure plot to visualise data
    figure()
    plot3(data_chaser_X,data_chaser_Y,data_chaser_Z)
    axis equal
    grid on
    text (data_chaser_X(1), data_chaser_Y(1), data_chaser_Z(1), "Boost 1")
    text (data_chaser_X(time), data_chaser_Y(time), data_chaser_Z(time), "Boost 2")
    

delta_V = dV0_plus;
distance_target_end = distance_arrival_STK;
distance_target_begin = norm(dR0)*1000;
end

