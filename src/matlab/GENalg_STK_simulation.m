function [delta_V,distance_target_end] = GENalg_STK_simulation(deltaV_input,target_obj,chaser_obj,time)
%STK_SIMULATION Summary of this function goes here
%   Detailed explanation goes here


    % Get reference to running STK instance
    uiApplication = actxGetRunningServer('STK12.Application'); %change with your STK version
    
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
        

    %% Implement BOOST in STK
    %Update Chaser initial speed
    initState.SetElementType('eVAElementTypeCartesian'); %in km/s
    initState.CoordSystemName = "Satellite/target_oneweb LVLH";
    % 
    %initState.Element.X = dR0(1,1)
    %initState.Element.Y = dR0(2,1)
    %initState.Element.Z = dR0(3,1)
    initState.Element.Vx= deltaV_input(1,1);
    initState.Element.Vy = deltaV_input(1,2);
    initState.Element.Vz = deltaV_input(1,3);
    
    %Update graphics and show orbits
    satellite_target.Propagator.RunMCS;
    satellite_chaser.Propagator.RunMCS;
    
    %retrieve data from new simulation
    data_chaser_in_LVLH_target = satellite_target.DataProviders.GetDataPrvTimeVarFromPath('Vectors(LVLH)/satellite_chaser').Exec(root.CurrentScenario.StartTime, root.CurrentScenario.StopTime, 1);
    
    data_chaser_X = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('x').GetValues);
    data_chaser_Y = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('y').GetValues);
    data_chaser_Z = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('z').GetValues);
    
    %data_chaser_Vx = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('Derivative x').GetValues);
    %data_chaser_Vy = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('Derivative y').GetValues);
    %data_chaser_Vz = cell2mat(data_chaser_in_LVLH_target.DataSets.GetDataSetByName('Derivative z').GetValues);
    
    distance_STK_arrival = [data_chaser_X(time,:) data_chaser_Y(time,:) data_chaser_Z(time,:)];
    distance_arrival_STK = round(norm(distance_STK_arrival)*1000); %metre
    

delta_V = deltaV_input;
distance_target_end = distance_arrival_STK;
end

