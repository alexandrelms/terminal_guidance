classdef spacecraft
    %VEHICULE Summary of this class goes here
    %   Detailed explanation goes here
    
    properties
        SemiMajorAxis
        ArgOfPeriapsis
        Eccentricity
        Inclination
        RAAN
        TrueAnomaly
    end
    
    methods
        function obj = spacecraft(SemiMajorAxis_val,ArgOfPeriapsis_val,Eccentricity_val,Inclination_val,RAAN_val,TrueAnomaly_val)
            %VEHICULE Construct an instance of this class
            %   Detailed explanation goes here
            obj.SemiMajorAxis = SemiMajorAxis_val;
            obj.ArgOfPeriapsis = ArgOfPeriapsis_val;
            obj.Eccentricity = Eccentricity_val;
            obj.Inclination = Inclination_val;
            obj.RAAN = RAAN_val;
            obj.TrueAnomaly = TrueAnomaly_val;
        end
%         
%         function outputArg = method1(obj,inputArg)
%             %METHOD1 Summary of this method goes here
%             %   Detailed explanation goes here
%             outputArg = obj.Property1 + inputArg;
%         end
    end
end

