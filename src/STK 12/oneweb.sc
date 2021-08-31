stk.v.12.0
WrittenBy    STK_v12.2.0
BEGIN Scenario
    Name		 oneweb

    BEGIN Epoch

        Epoch		 25 Aug 2021 00:00:00.000000000
        SmartEpoch		
        BEGIN EVENT
            Epoch		 25 Aug 2021 00:00:00.000000000
            EventEpoch		
            BEGIN EVENT
                Type		 EVENT_LINKTO
                Name		 AnalysisStartTime
            END EVENT
            EpochState		 Implicit
        END EVENT


    END Epoch

    BEGIN Interval

        StartStr		 Today
        StopStr		 Tomorrow
        SmartInterval		
        BEGIN EVENTINTERVAL
            StartEvent		
            BEGIN EVENT
                Epoch		 Today
                EventEpoch		
                BEGIN EVENT
                    Type		 EVENT_LINKTO
                    Name		 Today
                END EVENT
                EpochState		 Implicit
            END EVENT
            StopEvent		
            BEGIN EVENT
                Epoch		 Tomorrow
                EventEpoch		
                BEGIN EVENT
                    Type		 EVENT_LINKTO
                    Name		 Tomorrow
                END EVENT
                EpochState		 Implicit
            END EVENT
            IntervalState		 StartStop
        END EVENTINTERVAL

        EpochUsesAnalStart		 No
        AnimStartUsesAnalStart		 Yes
        AnimStopUsesAnalStop		 Yes

    END Interval

    BEGIN EOPFile

        InheritEOPSource		 No
        EOPFilename		 EOP-v1.1.txt

    END EOPFile

    BEGIN GlobalPrefs
        SatelliteNoOrbWarning		 No
        MissilePerigeeWarning		 No
        MissileStopTimeWarning		 No
        AircraftWGS84Warning		 Always
    END GlobalPrefs

    BEGIN CentralBody

        PrimaryBody		 Earth

    END CentralBody

    BEGIN CentralBodyTerrain

        BEGIN CentralBody
            Name		 Earth
            UseTerrainCache		 Yes
            TotalCacheSize		 402653184

            BEGIN StreamingTerrain
                UseCurrentStreamingTerrainServer		 Yes
                CurrentStreamingTerrainServerName		 http://twsusecovacc01.agi.com/stk-terrain/
                StreamingTerrainTilesetName		 world
                StreamingTerrainServerName		 assets.agi.com/stk-terrain/
                StreamingTerrainAzimuthElevationMaskEnabled		 No
                StreamingTerrainObscurationEnabled		 No
                StreamingTerrainCoverageGridObscurationEnabled		 No
            END StreamingTerrain
        END CentralBody

    END CentralBodyTerrain

    BEGIN StarCollection

        Name		 Hipparcos 2 Mag 8

    END StarCollection

    BEGIN ScenarioLicenses
        Module		 AMMv12.2
        Module		 ASTGv12.2
        Module		 AnalysisWBv12.2
        Module		 CATv12.2
        Module		 COVv12.2
        Module		 Commv12.2
        Module		 Radarv12.2
        Module		 SEETv12.2
        Module		 STKIntegrationv12.2
        Module		 STKProfessionalv12.2
        Module		 STKv12.2
        Module		 SatProv12.2
    END ScenarioLicenses

    BEGIN Extensions

        BEGIN ClsApp
            RangeConstraint		 5000
            ApoPeriPad		 30000
            OrbitPathPad		 100000
            TimeDistPad		 30000
            OutOfDate		 2592000
            MaxApoPeriStep		 900
            ApoPeriAngle		 0.7853981633974483
            UseApogeePerigeeFilter		 Yes
            UsePathFilter		 No
            UseTimeFilter		 No
            UseOutOfDate		 Yes
            CreateSats		 No
            MaxSatsToCreate		 500
            UseModelScale		 No
            ModelScale		 0
            UseCrossRefDb		 Yes
            CollisionDB		 stkAllTLE.tce
            CollisionCrossRefDB		 stkAllTLE.sd
            ShowLine		 Yes
            AnimHighlight		 Yes
            StaticHighlight		 Yes
            UseLaunchWindow		 No
            LaunchWindowUseEntireTraj		 Yes
            LaunchWindowTrajMETStart		 0
            LaunchWindowTrajMETStop		 900
            LaunchWindowStart		 0
            LaunchWindowStop		 0
            LaunchMETOffset		 0
            LaunchWindowUseSecEphem		 No 
            LaunchWindowUseScenFolderForSecEphem		 Yes
            LaunchWindowUsePrimEphem		 No 
            LaunchWindowUseScenFolderForPrimEphem		 Yes
            LaunchWindowIntervalPtr		
            BEGIN EVENTINTERVAL
                BEGIN Interval
                    Start		 25 Aug 2021 10:00:00.000000000
                    Stop		 26 Aug 2021 10:00:00.000000000
                END Interval
                IntervalState		 Explicit
            END EVENTINTERVAL

            LaunchWindowUsePrimMTO		 No 
            GroupLaunches		 No 
            LWTimeConvergence		 0.001
            LWRelValueConvergence		 1e-08
            LWTSRTimeConvergence		 0.0001
            LWTSRRelValueConvergence		 1e-10
            LaunchWindowStep		 300
            MaxTSRStep		  1.8000000000000000e+02
            MaxTSRRelMotion		  2.0000000000000000e+01
            UseLaunchArea		 No 
            LaunchAreaOrientation		 North
            LaunchAreaAzimuth		 0
            LaunchAreaXLimits		 -10000 10000
            LaunchAreaYLimits		 -10000 10000
            LaunchAreaNumXIntrPnts		 1
            LaunchAreaNumYIntrPnts		 1
            LaunchAreaAltReference		 Ellipsoid
            TargetSameStop		 No 
            SkipSurfaceMetric		 No 
            LWAreaTSRRelValueConvergence		 1e-10
            AreaLaunchWindowStep		 300
            AreaMaxTSRStep		  3.0000000000000000e+01
            AreaMaxTSRRelMotion		 1
            ShowLaunchArea		 No 
            ShowBlackoutTracks		 No 
            ShowClearedTracks		 No 
            UseObjectForClearedColor		 No 
            BlackoutColor		 #ff0000
            ClearedColor		 #ffffff
            ShowTracksSegments		 No 
            ShowMinRangeTracks		 No 
            MinRangeTrackTimeStep		 0.5
            UsePrimStepForTracks		 Yes
            GfxTracksTimeStep		 30
            GfxAreaNumXIntrPnts		 1
            GfxAreaNumYIntrPnts		 1
            CreateLaunchMTO		 No 
            CovarianceSigmaScale		 3
            CovarianceMode		 None 
        END ClsApp

        BEGIN Units
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            AviatorDistanceUnit		 NauticalMiles
            AviatorTimeUnit		 Hours
            AviatorAltitudeUnit		 Feet
            AviatorFuelQuantityUnit		 Pounds
            AviatorRunwayLengthUnit		 Kilofeet
            AviatorBearingAngleUnit		 Degrees
            AviatorAngleOfAttackUnit		 Degrees
            AviatorAttitudeAngleUnit		 Degrees
            AviatorGUnit		 StandardSeaLevelG
            SolidAngle		 Steradians
            AviatorTSFCUnit		 TSFCLbmHrLbf
            AviatorPSFCUnit		 PSFCLbmHrHp
            AviatorForceUnit		 Pounds
            AviatorPowerUnit		 Horsepower
            SpectralBandwidthUnit		 Hertz
            AviatorAltTimeUnit		 Minutes
            AviatorSmallTimeUnit		 Seconds
            AviatorEnergyUnit		 kilowatt-hours
            BitsUnit		 MegaBits
            RadiationDose		 Rads
            MagneticFieldUnit		 nanoTesla
            VoltageUnit		 Volts
            RadiationShieldThickness		 Mils
            ParticleEnergy		 MeV
        END Units

        BEGIN ReportUnits
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            AviatorDistanceUnit		 NauticalMiles
            AviatorTimeUnit		 Hours
            AviatorAltitudeUnit		 Feet
            AviatorFuelQuantityUnit		 Pounds
            AviatorRunwayLengthUnit		 Kilofeet
            AviatorBearingAngleUnit		 Degrees
            AviatorAngleOfAttackUnit		 Degrees
            AviatorAttitudeAngleUnit		 Degrees
            AviatorGUnit		 StandardSeaLevelG
            SolidAngle		 Steradians
            AviatorTSFCUnit		 TSFCLbmHrLbf
            AviatorPSFCUnit		 PSFCLbmHrHp
            AviatorForceUnit		 Pounds
            AviatorPowerUnit		 Horsepower
            SpectralBandwidthUnit		 Hertz
            AviatorAltTimeUnit		 Minutes
            AviatorSmallTimeUnit		 Seconds
            AviatorEnergyUnit		 kilowatt-hours
            BitsUnit		 MegaBits
            RadiationDose		 Rads
            MagneticFieldUnit		 nanoTesla
            VoltageUnit		 Volts
            RadiationShieldThickness		 Mils
            ParticleEnergy		 MeV
        END ReportUnits

        BEGIN ConnectReportUnits
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            AviatorDistanceUnit		 NauticalMiles
            AviatorTimeUnit		 Hours
            AviatorAltitudeUnit		 Feet
            AviatorFuelQuantityUnit		 Pounds
            AviatorRunwayLengthUnit		 Kilofeet
            AviatorBearingAngleUnit		 Degrees
            AviatorAngleOfAttackUnit		 Degrees
            AviatorAttitudeAngleUnit		 Degrees
            AviatorGUnit		 StandardSeaLevelG
            SolidAngle		 Steradians
            AviatorTSFCUnit		 TSFCLbmHrLbf
            AviatorPSFCUnit		 PSFCLbmHrHp
            AviatorForceUnit		 Pounds
            AviatorPowerUnit		 Horsepower
            SpectralBandwidthUnit		 Hertz
            AviatorAltTimeUnit		 Minutes
            AviatorSmallTimeUnit		 Seconds
            AviatorEnergyUnit		 kilowatt-hours
            BitsUnit		 MegaBits
            RadiationDose		 Rads
            MagneticFieldUnit		 nanoTesla
            VoltageUnit		 Volts
            RadiationShieldThickness		 Mils
            ParticleEnergy		 MeV
        END ConnectReportUnits

        BEGIN ReportFavorites
        END ReportFavorites

        BEGIN ADFFileData
        END ADFFileData

        BEGIN GenDb

            BEGIN Database
                DbType		 Satellite
                DefDb		 stkAllTLE.sd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "SSC Number"
                        Default		 "*"
                    END Field

                    BEGIN Field
                        Name		 "Common Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 City
                DefDb		 stkCityDb.cd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "City Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 Facility
                DefDb		 stkFacility.fd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                END FieldDefaults

            END Database
        END GenDb

        BEGIN SOCDb
            BEGIN Defaults
                BEGIN Catalog Spacecraft
                    BEGIN Criteria Name or ID
                        Type		 Value
                        Value		 oneweb
                    END Criteria
                END Catalog
            END Defaults
        END SOCDb

        BEGIN Msgp4Ext
        END Msgp4Ext

        BEGIN FileLocations
        END FileLocations

        BEGIN Author
            Optimize		 No
            UseBasicGlobe		 No
            SaveEphemeris		 Yes
            SaveScenFolder		 No
            BEGIN ExternalFileTypes
                BEGIN Type
                    FileType		 Calculation Scalar
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Celestial Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Cloud
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 EOP
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 External Vector Data
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Globe
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Globe Data
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Marker/Label
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Model
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Object Break-up File
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Planetary Ephemeris
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Report Style Script
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Report/Graph Style
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Scalar Calculation File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Terrain
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Volume Grid Intervals File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Volumetric File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 WTM
                    Include		 Yes
                END Type
            END ExternalFileTypes
            ReadOnly		 No
            ViewerPassword		 No
            STKPassword		 No
            ExcludeInstallFiles		 No
            BEGIN ExternalFileList
            END ExternalFileList
        END Author

        BEGIN ExportDataFile
            FileType		 Ephemeris
            IntervalType		 Ephemeris
            TimePeriodStart		 0
            TimePeriodStop		 0
            StepType		 Ephemeris
            StepSize		 60
            EphemType		 STK
            UseVehicleCentralBody		 Yes
            CentralBody		 Earth
            SatelliteID		 -200000
            CoordSys		 ICRF
            NonSatCoordSys		 Fixed
            InterpolateBoundaries		 Yes
            EphemFormat		 Current
            InterpType		 9
            InterpOrder		 5
            AttCoordSys		 Fixed
            Quaternions		 0
            ExportCovar		 Position
            AttitudeFormat		 Current
            TimePrecision		 6
            CCSDSDateFormat		 YMD
            CCSDSEphFormat		 SciNotation
            CCSDSTimeSystem		 UTC
            CCSDSRefFrame		 ICRF
            UseSatCenterAndFrame		 No
            IncludeCovariance		 No
            IncludeAcceleration		 No
            CCSDSFileFormat		 KVN
        END ExportDataFile

        BEGIN Desc
            BEGIN ShortText

            END ShortText
            BEGIN LongText

            END LongText
        END Desc

        BEGIN RfEnv
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "PropagationChannel">
        <SCOPE>
            <VAR name = "UseITU618Section2p5">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UseCloudFogModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "CloudFogModel">
                <SCOPE Class = "LinkEmbedControl">
                    <VAR name = "ReferenceType">
                        <STRING>&quot;Unlinked&quot;</STRING>
                    </VAR>
                    <VAR name = "Component">
                        <VAR name = "ITU-R_P840-7">
                            <SCOPE Class = "CloudFogLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "IdentifierInformation">
                                    <SCOPE>
                                        <VAR name = "Identifier">
                                            <STRING>&quot;{42BA6729-C583-4772-BFC8-B018F3033BC4}&quot;</STRING>
                                        </VAR>
                                        <VAR name = "Version">
                                            <STRING>&quot;1&quot;</STRING>
                                        </VAR>
                                        <VAR name = "SourceIdentifierInformation">
                                            <SCOPE>
                                                <VAR name = "Identifier">
                                                    <STRING>&quot;{E7BA4392-37BE-4446-A5C7-6068165B166A}&quot;</STRING>
                                                </VAR>
                                                <VAR name = "Version">
                                                    <STRING>&quot;1&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P840-7&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P840-7&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P840-7&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P840-7&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;@Top&quot;</STRING>
                                </VAR>
                                <VAR name = "LiquidWaterDensityValueChoice">
                                    <STRING>&quot;Liquid Water Content Density Value&quot;</STRING>
                                </VAR>
                                <VAR name = "CloudCeiling">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>3000</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLayerThickness">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>500</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudTemp">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLiqWaterDensity">
                                    <QUANTITY Dimension = "SmallDensity" Unit = "kg*m^-3">
                                        <REAL>0.0001</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "AnnualAveragePercentValue">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.01</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "MonthlyAveragePercentValue">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.01</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "LiqWaterAverageDataMonth">
                                    <INT>1</INT>
                                </VAR>
                                <VAR name = "UseRainHeightAsCloudThickness">
                                    <BOOL>false</BOOL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                </SCOPE>
            </VAR>
            <VAR name = "UseTropoScintModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "TropoScintModel">
                <SCOPE Class = "LinkEmbedControl">
                    <VAR name = "ReferenceType">
                        <STRING>&quot;Unlinked&quot;</STRING>
                    </VAR>
                    <VAR name = "Component">
                        <VAR name = "ITU-R_P618-12">
                            <SCOPE Class = "TropoScintLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "IdentifierInformation">
                                    <SCOPE>
                                        <VAR name = "Identifier">
                                            <STRING>&quot;{D2F60A63-3EAA-40DB-B34C-688DABF47F43}&quot;</STRING>
                                        </VAR>
                                        <VAR name = "Version">
                                            <STRING>&quot;1&quot;</STRING>
                                        </VAR>
                                        <VAR name = "SourceIdentifierInformation">
                                            <SCOPE>
                                                <VAR name = "Identifier">
                                                    <STRING>&quot;{BC27045B-5A54-458E-BF17-702BCFE40CA8}&quot;</STRING>
                                                </VAR>
                                                <VAR name = "Version">
                                                    <STRING>&quot;1&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;@Top&quot;</STRING>
                                </VAR>
                                <VAR name = "FadeDepthAverageTimeChoice">
                                    <STRING>&quot;Fade depth for the average year&quot;</STRING>
                                </VAR>
                                <VAR name = "ComputeDeepFade">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "FadeOutage">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.001</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "PercentTimeRefracGrad">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.1</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                </SCOPE>
            </VAR>
            <VAR name = "UseIonoFadingModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "IonoFadingModel">
                <SCOPE Class = "LinkEmbedControl">
                    <VAR name = "ReferenceType">
                        <STRING>&quot;Unlinked&quot;</STRING>
                    </VAR>
                    <VAR name = "Component">
                        <VAR name = "ITU-R_P531-13">
                            <SCOPE Class = "IonoFadingLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "IdentifierInformation">
                                    <SCOPE>
                                        <VAR name = "Identifier">
                                            <STRING>&quot;{DD38144E-6A57-4E6D-B87E-70FF1B52D22F}&quot;</STRING>
                                        </VAR>
                                        <VAR name = "Version">
                                            <STRING>&quot;1&quot;</STRING>
                                        </VAR>
                                        <VAR name = "SourceIdentifierInformation">
                                            <SCOPE>
                                                <VAR name = "Identifier">
                                                    <STRING>&quot;{1699891E-9828-41C7-ADD4-4BE20EFC34A8}&quot;</STRING>
                                                </VAR>
                                                <VAR name = "Version">
                                                    <STRING>&quot;1&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;@Top&quot;</STRING>
                                </VAR>
                                <VAR name = "UseAlternateAPFile">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "AlternateAPDataFile">
                                    <STRING>
                                        <PROP name = "FullName">
                                            <STRING>&quot;&quot;</STRING>
                                        </PROP>&quot;&quot;</STRING>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                </SCOPE>
            </VAR>
            <VAR name = "UseRainModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "RainModel">
                <SCOPE Class = "LinkEmbedControl">
                    <VAR name = "ReferenceType">
                        <STRING>&quot;Unlinked&quot;</STRING>
                    </VAR>
                    <VAR name = "Component">
                        <VAR name = "ITU-R_P618-12">
                            <SCOPE Class = "RainLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "IdentifierInformation">
                                    <SCOPE>
                                        <VAR name = "Identifier">
                                            <STRING>&quot;{CCE23DCE-0494-43F0-B315-CF5B62E33928}&quot;</STRING>
                                        </VAR>
                                        <VAR name = "Version">
                                            <STRING>&quot;1&quot;</STRING>
                                        </VAR>
                                        <VAR name = "SourceIdentifierInformation">
                                            <SCOPE>
                                                <VAR name = "Identifier">
                                                    <STRING>&quot;{1113D770-D1E5-4DEF-99A3-6B3F4D5CE16A}&quot;</STRING>
                                                </VAR>
                                                <VAR name = "Version">
                                                    <STRING>&quot;1&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-12 rain model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-12 rain model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;@Top&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "EnableDepolarizationLoss">
                                    <BOOL>false</BOOL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                </SCOPE>
            </VAR>
            <VAR name = "UseAtmosAbsorptionModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "AtmosAbsorptionModel">
                <SCOPE Class = "LinkEmbedControl">
                    <VAR name = "ReferenceType">
                        <STRING>&quot;Unlinked&quot;</STRING>
                    </VAR>
                    <VAR name = "Component">
                        <VAR name = "ITU-R_P676-9">
                            <SCOPE Class = "AtmosphericAbsorptionModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.1 a&quot;</STRING>
                                </VAR>
                                <VAR name = "IdentifierInformation">
                                    <SCOPE>
                                        <VAR name = "Identifier">
                                            <STRING>&quot;{BD487644-04C1-43EE-9A35-1396C1C90688}&quot;</STRING>
                                        </VAR>
                                        <VAR name = "Version">
                                            <STRING>&quot;1&quot;</STRING>
                                        </VAR>
                                        <VAR name = "SourceIdentifierInformation">
                                            <SCOPE>
                                                <VAR name = "Identifier">
                                                    <STRING>&quot;{5DBDF434-D4CA-44F6-8097-A6EBF681200D}&quot;</STRING>
                                                </VAR>
                                                <VAR name = "Version">
                                                    <STRING>&quot;1&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P676-9&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P676-9 gaseous absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P676-9&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P676-9 gaseous absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;@Top&quot;</STRING>
                                </VAR>
                                <VAR name = "UseApproxMethod">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "UseSeasonalRegional">
                                    <BOOL>true</BOOL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                </SCOPE>
            </VAR>
            <VAR name = "UseUrbanTerresPropLossModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UrbanTerresPropLossModel">
                <SCOPE Class = "LinkEmbedControl">
                    <VAR name = "ReferenceType">
                        <STRING>&quot;Unlinked&quot;</STRING>
                    </VAR>
                    <VAR name = "Component">
                        <VAR name = "Two_Ray">
                            <SCOPE Class = "UrbanTerrestrialPropagationLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "IdentifierInformation">
                                    <SCOPE>
                                        <VAR name = "Identifier">
                                            <STRING>&quot;{0B8D2C01-87A6-4400-8F21-173139E73AEE}&quot;</STRING>
                                        </VAR>
                                        <VAR name = "Version">
                                            <STRING>&quot;1&quot;</STRING>
                                        </VAR>
                                        <VAR name = "SourceIdentifierInformation">
                                            <SCOPE>
                                                <VAR name = "Identifier">
                                                    <STRING>&quot;{60FA4C9B-5D74-4743-A449-66CEB6DFC97B}&quot;</STRING>
                                                </VAR>
                                                <VAR name = "Version">
                                                    <STRING>&quot;1&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Two_Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Two Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;@Top&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "LossFactor">
                                    <REAL>1</REAL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                </SCOPE>
            </VAR>
            <VAR name = "UseCustomA">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UseCustomB">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UseCustomC">
                <BOOL>false</BOOL>
            </VAR>
        </SCOPE>
    </VAR>
    <VAR name = "EarthTemperature">
        <QUANTITY Dimension = "Temperature" Unit = "K">
            <REAL>290</REAL>
        </QUANTITY>
    </VAR>
    <VAR name = "RainOutagePercent">
        <REAL>0.1</REAL>
    </VAR>
    <VAR name = "ActiveCommSystem">
        <LINKTOOBJ>
            <STRING>&quot;None&quot;</STRING>
        </LINKTOOBJ>
    </VAR>
    <VAR name = "MagneticNorthPoleLatitude">
        <QUANTITY Dimension = "AngleUnit" Unit = "rad">
            <REAL>1.387536755335492</REAL>
        </QUANTITY>
    </VAR>
    <VAR name = "MagneticNorthPoleLongitude">
        <QUANTITY Dimension = "AngleUnit" Unit = "rad">
            <REAL>-1.204277183876087</REAL>
        </QUANTITY>
    </VAR>
</SCOPE>        END RfEnv

        BEGIN LaserEnv
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "PropagationChannel">
        <SCOPE>
            <VAR name = "EnableAtmosphericLossModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "AtmosphericLossModel">
                <SCOPE Class = "LinkEmbedControl">
                    <VAR name = "ReferenceType">
                        <STRING>&quot;Unlinked&quot;</STRING>
                    </VAR>
                    <VAR name = "Component">
                        <VAR name = "Beer-Bouguer-Lambert_Law">
                            <SCOPE Class = "LaserAtmosphericAbsorptionLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "IdentifierInformation">
                                    <SCOPE>
                                        <VAR name = "Identifier">
                                            <STRING>&quot;{08F26A90-4C31-406B-B0ED-6759D5313E40}&quot;</STRING>
                                        </VAR>
                                        <VAR name = "Version">
                                            <STRING>&quot;1&quot;</STRING>
                                        </VAR>
                                        <VAR name = "SourceIdentifierInformation">
                                            <SCOPE>
                                                <VAR name = "Identifier">
                                                    <STRING>&quot;{6896684B-630D-472D-8027-385684842E74}&quot;</STRING>
                                                </VAR>
                                                <VAR name = "Version">
                                                    <STRING>&quot;1&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Beer-Bouguer-Lambert_Law&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Model atmospheric loss for laser receivers using the Beer-Bouguer-Lambert Law&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Beer-Bouguer-Lambert Law&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Model atmospheric loss for laser receivers using the Beer-Bouguer-Lambert Law&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;@Top&quot;</STRING>
                                </VAR>
                                <VAR name = "LayerList">
                                    <LIST>
                                        <SCOPE>
                                            <VAR name = "LayerNum">
                                                <INT>1</INT>
                                            </VAR>
                                            <VAR name = "LayerTop">
                                                <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                                    <REAL>100000</REAL>
                                                </QUANTITY>
                                            </VAR>
                                            <VAR name = "ExtinctionCoefficient">
                                                <QUANTITY Dimension = "UnitlessPerSmallDistance" Unit = "m^-1">
                                                    <REAL>0</REAL>
                                                </QUANTITY>
                                            </VAR>
                                        </SCOPE>
                                    </LIST>
                                </VAR>
                                <VAR name = "EnableEvenlySpacedHeights">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "MaxLayerHeight">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>100000</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                </SCOPE>
            </VAR>
            <VAR name = "EnableTropoScintLossModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "TropoScintLossModel">
                <SCOPE Class = "LinkEmbedControl">
                    <VAR name = "ReferenceType">
                        <STRING>&quot;Unlinked&quot;</STRING>
                    </VAR>
                    <VAR name = "Component">
                        <VAR name = "ITU-R_P1814">
                            <SCOPE Class = "LaserTropoScintLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "IdentifierInformation">
                                    <SCOPE>
                                        <VAR name = "Identifier">
                                            <STRING>&quot;{995AF1E5-C853-468C-A823-14337087C2DE}&quot;</STRING>
                                        </VAR>
                                        <VAR name = "Version">
                                            <STRING>&quot;1&quot;</STRING>
                                        </VAR>
                                        <VAR name = "SourceIdentifierInformation">
                                            <SCOPE>
                                                <VAR name = "Identifier">
                                                    <STRING>&quot;{651AF2C8-7D6D-457E-8F99-1FB796A460BF}&quot;</STRING>
                                                </VAR>
                                                <VAR name = "Version">
                                                    <STRING>&quot;1&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P1814&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P1814&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P1814&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P1814&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;@Top&quot;</STRING>
                                </VAR>
                                <VAR name = "AtmosphericTurbulenceModel">
                                    <VAR name = "Constant">
                                        <SCOPE Class = "AtmosphericTurbulenceModel">
                                            <VAR name = "ConstantRefractiveIndexStructureParameter">
                                                <REAL>1.7e-14</REAL>
                                            </VAR>
                                            <VAR name = "Type">
                                                <STRING>&quot;Constant&quot;</STRING>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                </SCOPE>
            </VAR>
        </SCOPE>
    </VAR>
</SCOPE>        END LaserEnv

        BEGIN CommRad
        END CommRad

        BEGIN RadarCrossSection
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "Model">
        <SCOPE Class = "LinkEmbedControl">
            <VAR name = "ReferenceType">
                <STRING>&quot;Unlinked&quot;</STRING>
            </VAR>
            <VAR name = "Component">
                <VAR name = "Radar_Cross_Section">
                    <SCOPE Class = "RCS">
                        <VAR name = "Version">
                            <STRING>&quot;1.0.0 a&quot;</STRING>
                        </VAR>
                        <VAR name = "IdentifierInformation">
                            <SCOPE>
                                <VAR name = "Identifier">
                                    <STRING>&quot;{6B8DDD35-5658-480A-9396-86DBB6E2ADCA}&quot;</STRING>
                                </VAR>
                                <VAR name = "Version">
                                    <STRING>&quot;1&quot;</STRING>
                                </VAR>
                                <VAR name = "SourceIdentifierInformation">
                                    <SCOPE>
                                        <VAR name = "Identifier">
                                            <STRING>&quot;{EF03E656-5AB7-4F70-A363-4753683F2BD4}&quot;</STRING>
                                        </VAR>
                                        <VAR name = "Version">
                                            <STRING>&quot;1&quot;</STRING>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                            </SCOPE>
                        </VAR>
                        <VAR name = "ComponentName">
                            <STRING>&quot;Radar_Cross_Section&quot;</STRING>
                        </VAR>
                        <VAR name = "Description">
                            <STRING>&quot;Radar Cross Section&quot;</STRING>
                        </VAR>
                        <VAR name = "Type">
                            <STRING>&quot;Radar Cross Section&quot;</STRING>
                        </VAR>
                        <VAR name = "UserComment">
                            <STRING>&quot;Radar Cross Section&quot;</STRING>
                        </VAR>
                        <VAR name = "ReadOnly">
                            <BOOL>false</BOOL>
                        </VAR>
                        <VAR name = "Clonable">
                            <BOOL>true</BOOL>
                        </VAR>
                        <VAR name = "Category">
                            <STRING>&quot;@Top&quot;</STRING>
                        </VAR>
                        <VAR name = "FrequencyBandList">
                            <LIST>
                                <SCOPE>
                                    <VAR name = "MinFrequency">
                                        <QUANTITY Dimension = "BandwidthUnit" Unit = "Hz">
                                            <REAL>2997920</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "ComputeTypeStrategy">
                                        <VAR name = "Constant Value">
                                            <SCOPE Class = "RCS Compute Strategy">
                                                <VAR name = "ConstantValue">
                                                    <QUANTITY Dimension = "RcsUnit" Unit = "sqm">
                                                        <REAL>1</REAL>
                                                    </QUANTITY>
                                                </VAR>
                                                <VAR name = "Type">
                                                    <STRING>&quot;Constant Value&quot;</STRING>
                                                </VAR>
                                                <VAR name = "ComponentName">
                                                    <STRING>&quot;Constant Value&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </VAR>
                                    <VAR name = "SwerlingCase">
                                        <STRING>&quot;0&quot;</STRING>
                                    </VAR>
                                </SCOPE>
                            </LIST>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
        </SCOPE>
    </VAR>
</SCOPE>        END RadarCrossSection

        BEGIN RadarClutter
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "ClutterMap">
        <VAR name = "Constant Coefficient">
            <SCOPE Class = "Clutter Map">
                <VAR name = "ClutterCoefficient">
                    <QUANTITY Dimension = "RatioUnit" Unit = "units">
                        <REAL>1</REAL>
                    </QUANTITY>
                </VAR>
                <VAR name = "Type">
                    <STRING>&quot;Constant Coefficient&quot;</STRING>
                </VAR>
                <VAR name = "ComponentName">
                    <STRING>&quot;Constant Coefficient&quot;</STRING>
                </VAR>
            </SCOPE>
        </VAR>
    </VAR>
</SCOPE>        END RadarClutter

        BEGIN Gator
            RPOComponentsLoaded		 False
        END Gator

        BEGIN Crdn
            BEGIN EVENT
                Type		 EVENT_DATECONSTANT
                Name		 Today
                Hardcoded		
                Description		 Local midnight today.
                LocalOffsetWholeDays		 0
                LocalOffsetTime		  0.0000000000000000e+00
                ComputedDate		 24 Aug 2021 22:00:00.000000000
            END EVENT
            BEGIN EVENT
                Type		 EVENT_DATECONSTANT
                Name		 Tomorrow
                Hardcoded		
                Description		 Local midnight tomorrow.
                LocalOffsetWholeDays		 1
                LocalOffsetTime		  0.0000000000000000e+00
                ComputedDate		 25 Aug 2021 22:00:00.000000000
            END EVENT
        END Crdn

        BEGIN SpiceExt
        END SpiceExt

        BEGIN FlightScenExt
        END FlightScenExt

        BEGIN Graphics

            BEGIN Animation

                StartTime		 25 Aug 2021 00:00:00.000000000
                EndTime		 26 Aug 2021 00:00:00.000000000
                CurrentTime		 25 Aug 2021 00:00:00.000000000
                Direction		 Forward
                UpdateDelta		 10
                RefreshDelta		 0.010000
                XRealTimeMult		 1
                RealTimeOffset		 0
                XRtStartFromPause		                Yes		
                TimeArrayIncrement		 1

            END Animation


            BEGIN DisplayFlags
                ShowLabels		 On
                ShowPassLabel		 Off
                ShowElsetNum		 Off
                ShowGndTracks		 On
                ShowGndMarkers		 On
                ShowOrbitMarkers		 On
                ShowPlanetOrbits		 Off
                ShowPlanetCBIPos		 On
                ShowPlanetCBILabel		 On
                ShowPlanetGndPos		 On
                ShowPlanetGndLabel		 On
                ShowSensors		 On
                ShowWayptMarkers		 Off
                ShowWayptTurnMarkers		 Off
                ShowOrbits		 On
                ShowDtedRegions		 Off
                ShowAreaTgtCentroids		 On
                ShowToolBar		 On
                ShowStatusBar		 On
                ShowScrollBars		 On
                AllowAnimUpdate		 On
                AccShowLine		 On
                AccAnimHigh		 On
                AccStatHigh		 On
                AccAnimLineLineWidth		  1.0000000000000000e+00
                ShowPrintButton		 On
                ShowAnimButtons		 On
                ShowAnimModeButtons		 On
                ShowZoomMsrButtons		 On
                ShowMapCbButton		 Off
            END DisplayFlags

            BEGIN WinFonts

                Consolas,12,700,0
                Consolas,14,700,0
                Consolas,16,700,0

            END WinFonts

            BEGIN MapData

                BEGIN TerrainConverterData
                    NorthLat		  0.0000000000000000e+00
                    EastLon		  0.0000000000000000e+00
                    SouthLat		  0.0000000000000000e+00
                    WestLon		  0.0000000000000000e+00
                    ColorByRGB		 No
                    AltsFromMSL		 No
                    UseColorRamp		 Yes
                    UseRegionMinMax		 Yes
                    SizeSameAsSrc		 Yes
                    MinAltHSV		  0.0000000000000000e+00  6.9999999999999996e-01  8.0000000000000004e-01  4.0000000000000002e-01
                    MaxAltHSV		  1.0000000000000000e+06  0.0000000000000000e+00  2.0000000000000001e-01  1.0000000000000000e+00
                    SmoothColors		 Yes
                    CreateChunkTrn		 No
                    OutputFormat		 PDTTX
                END TerrainConverterData

                DisableDefKbdActions		 Off
                TextShadowStyle		 Dark
                TextShadowColor		 #000000
                BingLevelOfDetailScale		 2
                BEGIN Map
                    MapNum		 1
                    TrackingMode		 LatLon
                    PickEnabled		 On
                    PanEnabled		 On

                    BEGIN MapAttributes
                        PrimaryBody		 Earth
                        SecondaryBody		 Sun
                        CenterLatitude		 0
                        CenterLongitude		 0
                        ProjectionAltitude		 63621860
                        FieldOfView		 35
                        OrthoDisplayDistance		 20000000
                        TransformTrajectory		 On
                        EquatorialRadius		 6378137
                        BackgroundColor		 #000000
                        LatLonLines		 On
                        LatSpacing		 30
                        LonSpacing		 30
                        LatLonLineColor		 #999999
                        LatLonLineStyle		 2
                        ShowOrthoDistGrid		 Off
                        OrthoGridXSpacing		 5
                        OrthoGridYSpacing		 5
                        OrthoGridColor		 #ffffff
                        ShowImageExtents		 Off
                        ImageExtentLineColor		 #ffffff
                        ImageExtentLineStyle		 0
                        ImageExtentLineWidth		 1
                        ShowImageNames		 Off
                        ImageNameFont		 0
                        Projection		 EquidistantCylindrical
                        Resolution		 VeryLow
                        CoordinateSys		 ECF
                        UseBackgroundImage		 On
                        UseBingForBackground		 On
                        BingType		 Aerial
                        BingLogoHorizAlign		 Right
                        BingLogoVertAlign		 Bottom
                        BackgroundImageFile		 Basic.bmp
                        UseNightLights		 Off
                        NightLightsFactor		 3.5
                        UseCloudsFile		 Off
                        BEGIN ZoomLocations
                            BEGIN ZoomLocation
                                CenterLat		 0
                                CenterLon		 0
                                ZoomWidth		 360
                                ZoomHeight		 180
                            END ZoomLocation
                        END ZoomLocations
                        UseVarAspectRatio		 No
                        SwapMapResolution		 Yes
                        NoneToVLowSwapDist		 2000000
                        VLowToLowSwapDist		 20000
                        LowToMediumSwapDist		 10000
                        MediumToHighSwapDist		 5000
                        HighToVHighSwapDist		 1000
                        VHighToSHighSwapDist		 100
                        BEGIN Axes
                            DisplayAxes		 no
                            CoordSys		 CBI
                            2aryCB		 Sun
                            Display+x		 yes
                            Label+x		 yes
                            Color+x		 #ffffff
                            Scale+x		 3
                            Display-x		 yes
                            Label-x		 yes
                            Color-x		 #ffffff
                            Scale-x		 3
                            Display+y		 yes
                            Label+y		 yes
                            Color+y		 #ffffff
                            Scale+y		 3
                            Display-y		 yes
                            Label-y		 yes
                            Color-y		 #ffffff
                            Scale-y		 3
                            Display+z		 yes
                            Label+z		 yes
                            Color+z		 #ffffff
                            Scale+z		 3
                            Display-z		 yes
                            Label-z		 yes
                            Color-z		 #ffffff
                            Scale-z		 3
                        END Axes

                    END MapAttributes

                    BEGIN MapList
                        BEGIN Detail
                            Alias		 RWDB2_Coastlines
                            Show		 Yes
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_International_Borders
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Islands
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Lakes
                            Show		 No
                            Color		 #87cefa
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Provincial_Borders
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Rivers
                            Show		 No
                            Color		 #87cefa
                        END Detail
                    END MapList


                    BEGIN MapAnnotations
                    END MapAnnotations

                    BEGIN DisplayFlags
                        ShowLabels		 On
                        ShowPassLabel		 Off
                        ShowElsetNum		 Off
                        ShowGndTracks		 On
                        ShowGndMarkers		 On
                        ShowOrbitMarkers		 On
                        ShowPlanetOrbits		 Off
                        ShowPlanetCBIPos		 On
                        ShowPlanetCBILabel		 On
                        ShowPlanetGndPos		 On
                        ShowPlanetGndLabel		 On
                        ShowSensors		 On
                        ShowWayptMarkers		 Off
                        ShowWayptTurnMarkers		 Off
                        ShowOrbits		 On
                        ShowDtedRegions		 Off
                        ShowAreaTgtCentroids		 On
                        ShowToolBar		 On
                        ShowStatusBar		 On
                        ShowScrollBars		 On
                        AllowAnimUpdate		 Off
                        AccShowLine		 On
                        AccAnimHigh		 On
                        AccStatHigh		 On
                        AccAnimLineLineWidth		  1.0000000000000000e+00
                        ShowPrintButton		 On
                        ShowAnimButtons		 On
                        ShowAnimModeButtons		 On
                        ShowZoomMsrButtons		 On
                        ShowMapCbButton		 Off
                    END DisplayFlags

                    BEGIN RecordMovie
                        OutputFormat		 VIDEO
                        SdfSelected		 No
                        Directory		 C:\Users\Shadow\Desktop\oneweb
                        BaseName		 Frame
                        Digits		 4
                        Frame		 0
                        LastAnimTime		 0
                        OutputMode		 Normal
                        HiResAssembly		 Assemble
                        HRWidth		 6000
                        HRHeight		 4500
                        HRDPI		 600
                        UseSnapInterval		 No
                        SnapInterval		 0
                        VideoCodec		 "H264"
                        Framerate		 30
                        Bitrate		 10000000
                    END RecordMovie


                    BEGIN TimeDisplay
                        Show		 0
                        TextColor		 #ffffff
                        TextTranslucency		 0
                        ShowBackground		 0
                        BackColor		 #4d4d4d
                        BackTranslucency		 0.4
                        XPosition		 20
                        YPosition		 -20
                    END TimeDisplay

                    BEGIN LightingData
                        DisplayAltitude		 0
                        SubsolarPoint		 Off
                        SubsolarPointColor		 #ffff00
                        SubsolarPointMarkerStyle		 2

                        ShowUmbraLine		 Off
                        UmbraLineColor		 #000000
                        UmbraLineStyle		 0
                        UmbraLineWidth		 2
                        FillUmbra		 On
                        UmbraFillColor		 #000000
                        ShowSunlightLine		 Off
                        SunlightLineColor		 #ffff00
                        SunlightLineStyle		 0
                        SunlightLineWidth		 2
                        FillSunlight		 On
                        SunlightFillColor		 #ffffff
                        SunlightMinOpacity		 0
                        SunlightMaxOpacity		 0.2
                        UmbraMaxOpacity		 0.7
                        UmbraMinOpacity		 0.4
                    END LightingData
                END Map

                BEGIN MapStyles

                    UseStyleTime		 No

                    BEGIN Style
                        Name		 DefaultWithBing
                        Time		 36000
                        UpdateDelta		 10

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 On
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN RecordMovie
                            OutputFormat		 VIDEO
                            SdfSelected		 No
                            Directory		 C:\Users\Shadow\Desktop\oneweb
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            VideoCodec		 "H264"
                            Framerate		 30
                            Bitrate		 10000000
                        END RecordMovie


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                    BEGIN Style
                        Name		 DefaultWithoutBing
                        Time		 36000
                        UpdateDelta		 10

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 Off
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN RecordMovie
                            OutputFormat		 VIDEO
                            SdfSelected		 No
                            Directory		 C:\Users\Shadow\Desktop\oneweb
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            VideoCodec		 "H264"
                            Framerate		 30
                            Bitrate		 3000000
                        END RecordMovie


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                END MapStyles

            END MapData

            BEGIN GfxClassPref

            END GfxClassPref


            BEGIN ConnectGraphicsOptions

                AsyncPickReturnUnique		 OFF

            END ConnectGraphicsOptions

        END Graphics

        BEGIN Overlays
        END Overlays

        BEGIN VO
        END VO

        BEGIN ScenSpaceEnvironmentGfx

            BEGIN Gfx

                BEGIN MagFieldGfx
                    Show		 No
                    ColorBy		 Magnitude
                    ColorScale		 Log
                    ColorRampStart		 #0000ff
                    ColorRampStart		 #0000ff
                    ColorRampStop		 #ff0000
                    MaxTranslucency		 0.7
                    LineStyle		 0
                    LineWidth		 2
                    FieldLineRefresh		 300
                    NumLats		 8
                    NumLongs		 6
                    StartLat		 15
                    StopLat		 85
                    RefLongitude		 3.141592653589793
                    MainField		 IGRF
                    ExternalField		 None
                    IGRF_UpdateRate		 86400
                END MagFieldGfx

            END Gfx

        END ScenSpaceEnvironmentGfx

    END Extensions

    BEGIN SubObjects

        Class Constellation

            oneweb		

        END Class

        Class Satellite

            ONEWEB-0006_44061		
            ONEWEB-0007_44060		
            ONEWEB-0008_44059		
            ONEWEB-0010_44058		
            ONEWEB-0011_44062		
            ONEWEB-0012_44057		
            ONEWEB-0013_45131		
            ONEWEB-0017_45132		
            ONEWEB-0018_45434		
            ONEWEB-0019_45449		
            ONEWEB-0020_45133		
            ONEWEB-0021_45134		
            ONEWEB-0022_45135		
            ONEWEB-0023_45136		
            ONEWEB-0024_45137		
            ONEWEB-0025_45138		
            ONEWEB-0026_45139		
            ONEWEB-0027_45432		
            ONEWEB-0028_45140		
            ONEWEB-0029_45445		
            ONEWEB-0031_45431		
            ONEWEB-0032_45141		
            ONEWEB-0033_45142		
            ONEWEB-0034_45454		
            ONEWEB-0035_45143		
            ONEWEB-0036_45144		
            ONEWEB-0037_45440		
            ONEWEB-0038_45145		
            ONEWEB-0039_45146		
            ONEWEB-0040_45147		
            ONEWEB-0041_45148		
            ONEWEB-0042_45441		
            ONEWEB-0043_45149		
            ONEWEB-0044_45150		
            ONEWEB-0045_45151		
            ONEWEB-0046_45447		
            ONEWEB-0047_45152		
            ONEWEB-0048_45153		
            ONEWEB-0049_45154		
            ONEWEB-0050_45453		
            ONEWEB-0051_45155		
            ONEWEB-0052_45156		
            ONEWEB-0053_45157		
            ONEWEB-0054_45158		
            ONEWEB-0055_45443		
            ONEWEB-0056_45159		
            ONEWEB-0057_45160		
            ONEWEB-0058_45161		
            ONEWEB-0059_45162		
            ONEWEB-0060_45455		
            ONEWEB-0061_45428		
            ONEWEB-0062_45163		
            ONEWEB-0063_45448		
            ONEWEB-0064_45433		
            ONEWEB-0065_45164		
            ONEWEB-0066_45424		
            ONEWEB-0067_45425		
            ONEWEB-0068_45446		
            ONEWEB-0069_45430		
            ONEWEB-0080_45426		
            ONEWEB-0081_45429		
            ONEWEB-0082_45452		
            ONEWEB-0083_45435		
            ONEWEB-0085_45438		
            ONEWEB-0086_45456		
            ONEWEB-0087_45451		
            ONEWEB-0088_45457		
            ONEWEB-0090_45427		
            ONEWEB-0092_45437		
            ONEWEB-0093_45444		
            ONEWEB-0094_45450		
            ONEWEB-0095_45436		
            ONEWEB-0096_45439		
            ONEWEB-0098_45442		
            ONEWEB-0101_48049		
            ONEWEB-0102_47258		
            ONEWEB-0107_48048		
            ONEWEB-0108_48076		
            ONEWEB-0109_47259		
            ONEWEB-0110_47260		
            ONEWEB-0111_47261		
            ONEWEB-0112_48051		
            ONEWEB-0113_48050		
            ONEWEB-0114_47262		
            ONEWEB-0115_48042		
            ONEWEB-0116_48046		
            ONEWEB-0117_47263		
            ONEWEB-0118_47264		
            ONEWEB-0119_47265		
            ONEWEB-0120_47266		
            ONEWEB-0121_47267		
            ONEWEB-0122_47268		
            ONEWEB-0123_47269		
            ONEWEB-0124_47270		
            ONEWEB-0125_47271		
            ONEWEB-0126_47272		
            ONEWEB-0127_47273		
            ONEWEB-0128_47274		
            ONEWEB-0129_47275		
            ONEWEB-0130_47276		
            ONEWEB-0131_47277		
            ONEWEB-0132_47278		
            ONEWEB-0133_47279		
            ONEWEB-0134_47280		
            ONEWEB-0135_47281		
            ONEWEB-0136_47282		
            ONEWEB-0137_47283		
            ONEWEB-0138_47284		
            ONEWEB-0139_47285		
            ONEWEB-0140_47286		
            ONEWEB-0141_47287		
            ONEWEB-0142_47288		
            ONEWEB-0143_47289		
            ONEWEB-0144_47290		
            ONEWEB-0145_47291		
            ONEWEB-0146_47292		
            ONEWEB-0147_47293		
            ONEWEB-0148_48059		
            ONEWEB-0149_48058		
            ONEWEB-0150_48047		
            ONEWEB-0151_48066		
            ONEWEB-0152_48043		
            ONEWEB-0153_48044		
            ONEWEB-0154_48045		
            ONEWEB-0155_48057		
            ONEWEB-0156_48052		
            ONEWEB-0157_48055		
            ONEWEB-0158_48054		
            ONEWEB-0159_48062		
            ONEWEB-0160_48060		
            ONEWEB-0161_48053		
            ONEWEB-0162_48056		
            ONEWEB-0163_48061		
            ONEWEB-0164_48063		
            ONEWEB-0165_48233		
            ONEWEB-0166_48065		
            ONEWEB-0167_48064		
            ONEWEB-0168_48068		
            ONEWEB-0169_48077		
            ONEWEB-0170_48067		
            ONEWEB-0171_48070		
            ONEWEB-0172_48071		
            ONEWEB-0173_48069		
            ONEWEB-0174_48072		
            ONEWEB-0175_48073		
            ONEWEB-0176_48210		
            ONEWEB-0177_48074		
            ONEWEB-0178_48075		
            ONEWEB-0179_48212		
            ONEWEB-0180_48213		
            ONEWEB-0181_48230		
            ONEWEB-0182_48228		
            ONEWEB-0183_48219		
            ONEWEB-0184_48211		
            ONEWEB-0185_48220		
            ONEWEB-0186_48229		
            ONEWEB-0187_48221		
            ONEWEB-0188_48231		
            ONEWEB-0189_48217		
            ONEWEB-0190_48796		
            ONEWEB-0191_48239		
            ONEWEB-0192_48222		
            ONEWEB-0193_48238		
            ONEWEB-0194_48237		
            ONEWEB-0195_48240		
            ONEWEB-0196_48218		
            ONEWEB-0197_48236		
            ONEWEB-0198_48216		
            ONEWEB-0199_48234		
            ONEWEB-0200_48244		
            ONEWEB-0201_48241		
            ONEWEB-0202_48224		
            ONEWEB-0203_48235		
            ONEWEB-0204_48225		
            ONEWEB-0205_48226		
            ONEWEB-0206_48227		
            ONEWEB-0207_48242		
            ONEWEB-0208_48243		
            ONEWEB-0209_48215		
            ONEWEB-0210_48787		
            ONEWEB-0211_48767		
            ONEWEB-0212_48791		
            ONEWEB-0213_48790		
            ONEWEB-0214_48788		
            ONEWEB-0215_48800		
            ONEWEB-0216_48801		
            ONEWEB-0217_48245		
            ONEWEB-0218_48214		
            ONEWEB-0219_48223		
            ONEWEB-0220_48232		
            ONEWEB-0221_48789		
            ONEWEB-0222_48775		
            ONEWEB-0223_48768		
            ONEWEB-0224_48794		
            ONEWEB-0225_48799		
            ONEWEB-0226_48793		
            ONEWEB-0227_48792		
            ONEWEB-0228_48780		
            ONEWEB-0229_48779		
            ONEWEB-0230_48769		
            ONEWEB-0231_48782		
            ONEWEB-0232_48781		
            ONEWEB-0233_48795		
            ONEWEB-0234_48783		
            ONEWEB-0235_48771		
            ONEWEB-0236_48797		
            ONEWEB-0237_48770		
            ONEWEB-0238_48784		
            ONEWEB-0239_48802		
            ONEWEB-0240_48785		
            ONEWEB-0241_48773		
            ONEWEB-0242_48772		
            ONEWEB-0243_48774		
            ONEWEB-0244_48776		
            ONEWEB-0245_48778		
            ONEWEB-0246_48786		
            ONEWEB-0247_48777		
            ONEWEB-0248_48798		

        END Class

    END SubObjects

    BEGIN References
        Instance *
            *		
            Constellation/oneweb		
        END Instance
        Instance Constellation/oneweb
        END Instance
        Instance Satellite/ONEWEB-0006_44061
            Constellation/oneweb		
            Satellite/ONEWEB-0006_44061		
        END Instance
        Instance Satellite/ONEWEB-0007_44060
            Constellation/oneweb		
            Satellite/ONEWEB-0007_44060		
        END Instance
        Instance Satellite/ONEWEB-0008_44059
            Constellation/oneweb		
            Satellite/ONEWEB-0008_44059		
        END Instance
        Instance Satellite/ONEWEB-0010_44058
            Constellation/oneweb		
            Satellite/ONEWEB-0010_44058		
        END Instance
        Instance Satellite/ONEWEB-0011_44062
            Constellation/oneweb		
            Satellite/ONEWEB-0011_44062		
        END Instance
        Instance Satellite/ONEWEB-0012_44057
            Constellation/oneweb		
            Satellite/ONEWEB-0012_44057		
        END Instance
        Instance Satellite/ONEWEB-0013_45131
            Constellation/oneweb		
            Satellite/ONEWEB-0013_45131		
        END Instance
        Instance Satellite/ONEWEB-0017_45132
            Constellation/oneweb		
            Satellite/ONEWEB-0017_45132		
        END Instance
        Instance Satellite/ONEWEB-0018_45434
            Constellation/oneweb		
            Satellite/ONEWEB-0018_45434		
        END Instance
        Instance Satellite/ONEWEB-0019_45449
            Constellation/oneweb		
            Satellite/ONEWEB-0019_45449		
        END Instance
        Instance Satellite/ONEWEB-0020_45133
            Constellation/oneweb		
            Satellite/ONEWEB-0020_45133		
        END Instance
        Instance Satellite/ONEWEB-0021_45134
            Constellation/oneweb		
            Satellite/ONEWEB-0021_45134		
        END Instance
        Instance Satellite/ONEWEB-0022_45135
            Constellation/oneweb		
            Satellite/ONEWEB-0022_45135		
        END Instance
        Instance Satellite/ONEWEB-0023_45136
            Constellation/oneweb		
            Satellite/ONEWEB-0023_45136		
        END Instance
        Instance Satellite/ONEWEB-0024_45137
            Constellation/oneweb		
            Satellite/ONEWEB-0024_45137		
        END Instance
        Instance Satellite/ONEWEB-0025_45138
            Constellation/oneweb		
            Satellite/ONEWEB-0025_45138		
        END Instance
        Instance Satellite/ONEWEB-0026_45139
            Constellation/oneweb		
            Satellite/ONEWEB-0026_45139		
        END Instance
        Instance Satellite/ONEWEB-0027_45432
            Constellation/oneweb		
            Satellite/ONEWEB-0027_45432		
        END Instance
        Instance Satellite/ONEWEB-0028_45140
            Constellation/oneweb		
            Satellite/ONEWEB-0028_45140		
        END Instance
        Instance Satellite/ONEWEB-0029_45445
            Constellation/oneweb		
            Satellite/ONEWEB-0029_45445		
        END Instance
        Instance Satellite/ONEWEB-0031_45431
            Constellation/oneweb		
            Satellite/ONEWEB-0031_45431		
        END Instance
        Instance Satellite/ONEWEB-0032_45141
            Constellation/oneweb		
            Satellite/ONEWEB-0032_45141		
        END Instance
        Instance Satellite/ONEWEB-0033_45142
            Constellation/oneweb		
            Satellite/ONEWEB-0033_45142		
        END Instance
        Instance Satellite/ONEWEB-0034_45454
            Constellation/oneweb		
            Satellite/ONEWEB-0034_45454		
        END Instance
        Instance Satellite/ONEWEB-0035_45143
            Constellation/oneweb		
            Satellite/ONEWEB-0035_45143		
        END Instance
        Instance Satellite/ONEWEB-0036_45144
            Constellation/oneweb		
            Satellite/ONEWEB-0036_45144		
        END Instance
        Instance Satellite/ONEWEB-0037_45440
            Constellation/oneweb		
            Satellite/ONEWEB-0037_45440		
        END Instance
        Instance Satellite/ONEWEB-0038_45145
            Constellation/oneweb		
            Satellite/ONEWEB-0038_45145		
        END Instance
        Instance Satellite/ONEWEB-0039_45146
            Constellation/oneweb		
            Satellite/ONEWEB-0039_45146		
        END Instance
        Instance Satellite/ONEWEB-0040_45147
            Constellation/oneweb		
            Satellite/ONEWEB-0040_45147		
        END Instance
        Instance Satellite/ONEWEB-0041_45148
            Constellation/oneweb		
            Satellite/ONEWEB-0041_45148		
        END Instance
        Instance Satellite/ONEWEB-0042_45441
            Constellation/oneweb		
            Satellite/ONEWEB-0042_45441		
        END Instance
        Instance Satellite/ONEWEB-0043_45149
            Constellation/oneweb		
            Satellite/ONEWEB-0043_45149		
        END Instance
        Instance Satellite/ONEWEB-0044_45150
            Constellation/oneweb		
            Satellite/ONEWEB-0044_45150		
        END Instance
        Instance Satellite/ONEWEB-0045_45151
            Constellation/oneweb		
            Satellite/ONEWEB-0045_45151		
        END Instance
        Instance Satellite/ONEWEB-0046_45447
            Constellation/oneweb		
            Satellite/ONEWEB-0046_45447		
        END Instance
        Instance Satellite/ONEWEB-0047_45152
            Constellation/oneweb		
            Satellite/ONEWEB-0047_45152		
        END Instance
        Instance Satellite/ONEWEB-0048_45153
            Constellation/oneweb		
            Satellite/ONEWEB-0048_45153		
        END Instance
        Instance Satellite/ONEWEB-0049_45154
            Constellation/oneweb		
            Satellite/ONEWEB-0049_45154		
        END Instance
        Instance Satellite/ONEWEB-0050_45453
            Constellation/oneweb		
            Satellite/ONEWEB-0050_45453		
        END Instance
        Instance Satellite/ONEWEB-0051_45155
            Constellation/oneweb		
            Satellite/ONEWEB-0051_45155		
        END Instance
        Instance Satellite/ONEWEB-0052_45156
            Constellation/oneweb		
            Satellite/ONEWEB-0052_45156		
        END Instance
        Instance Satellite/ONEWEB-0053_45157
            Constellation/oneweb		
            Satellite/ONEWEB-0053_45157		
        END Instance
        Instance Satellite/ONEWEB-0054_45158
            Constellation/oneweb		
            Satellite/ONEWEB-0054_45158		
        END Instance
        Instance Satellite/ONEWEB-0055_45443
            Constellation/oneweb		
            Satellite/ONEWEB-0055_45443		
        END Instance
        Instance Satellite/ONEWEB-0056_45159
            Constellation/oneweb		
            Satellite/ONEWEB-0056_45159		
        END Instance
        Instance Satellite/ONEWEB-0057_45160
            Constellation/oneweb		
            Satellite/ONEWEB-0057_45160		
        END Instance
        Instance Satellite/ONEWEB-0058_45161
            Constellation/oneweb		
            Satellite/ONEWEB-0058_45161		
        END Instance
        Instance Satellite/ONEWEB-0059_45162
            Constellation/oneweb		
            Satellite/ONEWEB-0059_45162		
        END Instance
        Instance Satellite/ONEWEB-0060_45455
            Constellation/oneweb		
            Satellite/ONEWEB-0060_45455		
        END Instance
        Instance Satellite/ONEWEB-0061_45428
            Constellation/oneweb		
            Satellite/ONEWEB-0061_45428		
        END Instance
        Instance Satellite/ONEWEB-0062_45163
            Constellation/oneweb		
            Satellite/ONEWEB-0062_45163		
        END Instance
        Instance Satellite/ONEWEB-0063_45448
            Constellation/oneweb		
            Satellite/ONEWEB-0063_45448		
        END Instance
        Instance Satellite/ONEWEB-0064_45433
            Constellation/oneweb		
            Satellite/ONEWEB-0064_45433		
        END Instance
        Instance Satellite/ONEWEB-0065_45164
            Constellation/oneweb		
            Satellite/ONEWEB-0065_45164		
        END Instance
        Instance Satellite/ONEWEB-0066_45424
            Constellation/oneweb		
            Satellite/ONEWEB-0066_45424		
        END Instance
        Instance Satellite/ONEWEB-0067_45425
            Constellation/oneweb		
            Satellite/ONEWEB-0067_45425		
        END Instance
        Instance Satellite/ONEWEB-0068_45446
            Constellation/oneweb		
            Satellite/ONEWEB-0068_45446		
        END Instance
        Instance Satellite/ONEWEB-0069_45430
            Constellation/oneweb		
            Satellite/ONEWEB-0069_45430		
        END Instance
        Instance Satellite/ONEWEB-0080_45426
            Constellation/oneweb		
            Satellite/ONEWEB-0080_45426		
        END Instance
        Instance Satellite/ONEWEB-0081_45429
            Constellation/oneweb		
            Satellite/ONEWEB-0081_45429		
        END Instance
        Instance Satellite/ONEWEB-0082_45452
            Constellation/oneweb		
            Satellite/ONEWEB-0082_45452		
        END Instance
        Instance Satellite/ONEWEB-0083_45435
            Constellation/oneweb		
            Satellite/ONEWEB-0083_45435		
        END Instance
        Instance Satellite/ONEWEB-0085_45438
            Constellation/oneweb		
            Satellite/ONEWEB-0085_45438		
        END Instance
        Instance Satellite/ONEWEB-0086_45456
            Constellation/oneweb		
            Satellite/ONEWEB-0086_45456		
        END Instance
        Instance Satellite/ONEWEB-0087_45451
            Constellation/oneweb		
            Satellite/ONEWEB-0087_45451		
        END Instance
        Instance Satellite/ONEWEB-0088_45457
            Constellation/oneweb		
            Satellite/ONEWEB-0088_45457		
        END Instance
        Instance Satellite/ONEWEB-0090_45427
            Constellation/oneweb		
            Satellite/ONEWEB-0090_45427		
        END Instance
        Instance Satellite/ONEWEB-0092_45437
            Constellation/oneweb		
            Satellite/ONEWEB-0092_45437		
        END Instance
        Instance Satellite/ONEWEB-0093_45444
            Constellation/oneweb		
            Satellite/ONEWEB-0093_45444		
        END Instance
        Instance Satellite/ONEWEB-0094_45450
            Constellation/oneweb		
            Satellite/ONEWEB-0094_45450		
        END Instance
        Instance Satellite/ONEWEB-0095_45436
            Constellation/oneweb		
            Satellite/ONEWEB-0095_45436		
        END Instance
        Instance Satellite/ONEWEB-0096_45439
            Constellation/oneweb		
            Satellite/ONEWEB-0096_45439		
        END Instance
        Instance Satellite/ONEWEB-0098_45442
            Constellation/oneweb		
            Satellite/ONEWEB-0098_45442		
        END Instance
        Instance Satellite/ONEWEB-0101_48049
            Constellation/oneweb		
            Satellite/ONEWEB-0101_48049		
        END Instance
        Instance Satellite/ONEWEB-0102_47258
            Constellation/oneweb		
            Satellite/ONEWEB-0102_47258		
        END Instance
        Instance Satellite/ONEWEB-0107_48048
            Constellation/oneweb		
            Satellite/ONEWEB-0107_48048		
        END Instance
        Instance Satellite/ONEWEB-0108_48076
            Constellation/oneweb		
            Satellite/ONEWEB-0108_48076		
        END Instance
        Instance Satellite/ONEWEB-0109_47259
            Constellation/oneweb		
            Satellite/ONEWEB-0109_47259		
        END Instance
        Instance Satellite/ONEWEB-0110_47260
            Constellation/oneweb		
            Satellite/ONEWEB-0110_47260		
        END Instance
        Instance Satellite/ONEWEB-0111_47261
            Constellation/oneweb		
            Satellite/ONEWEB-0111_47261		
        END Instance
        Instance Satellite/ONEWEB-0112_48051
            Constellation/oneweb		
            Satellite/ONEWEB-0112_48051		
        END Instance
        Instance Satellite/ONEWEB-0113_48050
            Constellation/oneweb		
            Satellite/ONEWEB-0113_48050		
        END Instance
        Instance Satellite/ONEWEB-0114_47262
            Constellation/oneweb		
            Satellite/ONEWEB-0114_47262		
        END Instance
        Instance Satellite/ONEWEB-0115_48042
            Constellation/oneweb		
            Satellite/ONEWEB-0115_48042		
        END Instance
        Instance Satellite/ONEWEB-0116_48046
            Constellation/oneweb		
            Satellite/ONEWEB-0116_48046		
        END Instance
        Instance Satellite/ONEWEB-0117_47263
            Constellation/oneweb		
            Satellite/ONEWEB-0117_47263		
        END Instance
        Instance Satellite/ONEWEB-0118_47264
            Constellation/oneweb		
            Satellite/ONEWEB-0118_47264		
        END Instance
        Instance Satellite/ONEWEB-0119_47265
            Constellation/oneweb		
            Satellite/ONEWEB-0119_47265		
        END Instance
        Instance Satellite/ONEWEB-0120_47266
            Constellation/oneweb		
            Satellite/ONEWEB-0120_47266		
        END Instance
        Instance Satellite/ONEWEB-0121_47267
            Constellation/oneweb		
            Satellite/ONEWEB-0121_47267		
        END Instance
        Instance Satellite/ONEWEB-0122_47268
            Constellation/oneweb		
            Satellite/ONEWEB-0122_47268		
        END Instance
        Instance Satellite/ONEWEB-0123_47269
            Constellation/oneweb		
            Satellite/ONEWEB-0123_47269		
        END Instance
        Instance Satellite/ONEWEB-0124_47270
            Constellation/oneweb		
            Satellite/ONEWEB-0124_47270		
        END Instance
        Instance Satellite/ONEWEB-0125_47271
            Constellation/oneweb		
            Satellite/ONEWEB-0125_47271		
        END Instance
        Instance Satellite/ONEWEB-0126_47272
            Constellation/oneweb		
            Satellite/ONEWEB-0126_47272		
        END Instance
        Instance Satellite/ONEWEB-0127_47273
            Constellation/oneweb		
            Satellite/ONEWEB-0127_47273		
        END Instance
        Instance Satellite/ONEWEB-0128_47274
            Constellation/oneweb		
            Satellite/ONEWEB-0128_47274		
        END Instance
        Instance Satellite/ONEWEB-0129_47275
            Constellation/oneweb		
            Satellite/ONEWEB-0129_47275		
        END Instance
        Instance Satellite/ONEWEB-0130_47276
            Constellation/oneweb		
            Satellite/ONEWEB-0130_47276		
        END Instance
        Instance Satellite/ONEWEB-0131_47277
            Constellation/oneweb		
            Satellite/ONEWEB-0131_47277		
        END Instance
        Instance Satellite/ONEWEB-0132_47278
            Constellation/oneweb		
            Satellite/ONEWEB-0132_47278		
        END Instance
        Instance Satellite/ONEWEB-0133_47279
            Constellation/oneweb		
            Satellite/ONEWEB-0133_47279		
        END Instance
        Instance Satellite/ONEWEB-0134_47280
            Constellation/oneweb		
            Satellite/ONEWEB-0134_47280		
        END Instance
        Instance Satellite/ONEWEB-0135_47281
            Constellation/oneweb		
            Satellite/ONEWEB-0135_47281		
        END Instance
        Instance Satellite/ONEWEB-0136_47282
            Constellation/oneweb		
            Satellite/ONEWEB-0136_47282		
        END Instance
        Instance Satellite/ONEWEB-0137_47283
            Constellation/oneweb		
            Satellite/ONEWEB-0137_47283		
        END Instance
        Instance Satellite/ONEWEB-0138_47284
            Constellation/oneweb		
            Satellite/ONEWEB-0138_47284		
        END Instance
        Instance Satellite/ONEWEB-0139_47285
            Constellation/oneweb		
            Satellite/ONEWEB-0139_47285		
        END Instance
        Instance Satellite/ONEWEB-0140_47286
            Constellation/oneweb		
            Satellite/ONEWEB-0140_47286		
        END Instance
        Instance Satellite/ONEWEB-0141_47287
            Constellation/oneweb		
            Satellite/ONEWEB-0141_47287		
        END Instance
        Instance Satellite/ONEWEB-0142_47288
            Constellation/oneweb		
            Satellite/ONEWEB-0142_47288		
        END Instance
        Instance Satellite/ONEWEB-0143_47289
            Constellation/oneweb		
            Satellite/ONEWEB-0143_47289		
        END Instance
        Instance Satellite/ONEWEB-0144_47290
            Constellation/oneweb		
            Satellite/ONEWEB-0144_47290		
        END Instance
        Instance Satellite/ONEWEB-0145_47291
            Constellation/oneweb		
            Satellite/ONEWEB-0145_47291		
        END Instance
        Instance Satellite/ONEWEB-0146_47292
            Constellation/oneweb		
            Satellite/ONEWEB-0146_47292		
        END Instance
        Instance Satellite/ONEWEB-0147_47293
            Constellation/oneweb		
            Satellite/ONEWEB-0147_47293		
        END Instance
        Instance Satellite/ONEWEB-0148_48059
            Constellation/oneweb		
            Satellite/ONEWEB-0148_48059		
        END Instance
        Instance Satellite/ONEWEB-0149_48058
            Constellation/oneweb		
            Satellite/ONEWEB-0149_48058		
        END Instance
        Instance Satellite/ONEWEB-0150_48047
            Constellation/oneweb		
            Satellite/ONEWEB-0150_48047		
        END Instance
        Instance Satellite/ONEWEB-0151_48066
            Constellation/oneweb		
            Satellite/ONEWEB-0151_48066		
        END Instance
        Instance Satellite/ONEWEB-0152_48043
            Constellation/oneweb		
            Satellite/ONEWEB-0152_48043		
        END Instance
        Instance Satellite/ONEWEB-0153_48044
            Constellation/oneweb		
            Satellite/ONEWEB-0153_48044		
        END Instance
        Instance Satellite/ONEWEB-0154_48045
            Constellation/oneweb		
            Satellite/ONEWEB-0154_48045		
        END Instance
        Instance Satellite/ONEWEB-0155_48057
            Constellation/oneweb		
            Satellite/ONEWEB-0155_48057		
        END Instance
        Instance Satellite/ONEWEB-0156_48052
            Constellation/oneweb		
            Satellite/ONEWEB-0156_48052		
        END Instance
        Instance Satellite/ONEWEB-0157_48055
            Constellation/oneweb		
            Satellite/ONEWEB-0157_48055		
        END Instance
        Instance Satellite/ONEWEB-0158_48054
            Constellation/oneweb		
            Satellite/ONEWEB-0158_48054		
        END Instance
        Instance Satellite/ONEWEB-0159_48062
            Constellation/oneweb		
            Satellite/ONEWEB-0159_48062		
        END Instance
        Instance Satellite/ONEWEB-0160_48060
            Constellation/oneweb		
            Satellite/ONEWEB-0160_48060		
        END Instance
        Instance Satellite/ONEWEB-0161_48053
            Constellation/oneweb		
            Satellite/ONEWEB-0161_48053		
        END Instance
        Instance Satellite/ONEWEB-0162_48056
            Constellation/oneweb		
            Satellite/ONEWEB-0162_48056		
        END Instance
        Instance Satellite/ONEWEB-0163_48061
            Constellation/oneweb		
            Satellite/ONEWEB-0163_48061		
        END Instance
        Instance Satellite/ONEWEB-0164_48063
            Constellation/oneweb		
            Satellite/ONEWEB-0164_48063		
        END Instance
        Instance Satellite/ONEWEB-0165_48233
            Constellation/oneweb		
            Satellite/ONEWEB-0165_48233		
        END Instance
        Instance Satellite/ONEWEB-0166_48065
            Constellation/oneweb		
            Satellite/ONEWEB-0166_48065		
        END Instance
        Instance Satellite/ONEWEB-0167_48064
            Constellation/oneweb		
            Satellite/ONEWEB-0167_48064		
        END Instance
        Instance Satellite/ONEWEB-0168_48068
            Constellation/oneweb		
            Satellite/ONEWEB-0168_48068		
        END Instance
        Instance Satellite/ONEWEB-0169_48077
            Constellation/oneweb		
            Satellite/ONEWEB-0169_48077		
        END Instance
        Instance Satellite/ONEWEB-0170_48067
            Constellation/oneweb		
            Satellite/ONEWEB-0170_48067		
        END Instance
        Instance Satellite/ONEWEB-0171_48070
            Constellation/oneweb		
            Satellite/ONEWEB-0171_48070		
        END Instance
        Instance Satellite/ONEWEB-0172_48071
            Constellation/oneweb		
            Satellite/ONEWEB-0172_48071		
        END Instance
        Instance Satellite/ONEWEB-0173_48069
            Constellation/oneweb		
            Satellite/ONEWEB-0173_48069		
        END Instance
        Instance Satellite/ONEWEB-0174_48072
            Constellation/oneweb		
            Satellite/ONEWEB-0174_48072		
        END Instance
        Instance Satellite/ONEWEB-0175_48073
            Constellation/oneweb		
            Satellite/ONEWEB-0175_48073		
        END Instance
        Instance Satellite/ONEWEB-0176_48210
            Constellation/oneweb		
            Satellite/ONEWEB-0176_48210		
        END Instance
        Instance Satellite/ONEWEB-0177_48074
            Constellation/oneweb		
            Satellite/ONEWEB-0177_48074		
        END Instance
        Instance Satellite/ONEWEB-0178_48075
            Constellation/oneweb		
            Satellite/ONEWEB-0178_48075		
        END Instance
        Instance Satellite/ONEWEB-0179_48212
            Constellation/oneweb		
            Satellite/ONEWEB-0179_48212		
        END Instance
        Instance Satellite/ONEWEB-0180_48213
            Constellation/oneweb		
            Satellite/ONEWEB-0180_48213		
        END Instance
        Instance Satellite/ONEWEB-0181_48230
            Constellation/oneweb		
            Satellite/ONEWEB-0181_48230		
        END Instance
        Instance Satellite/ONEWEB-0182_48228
            Constellation/oneweb		
            Satellite/ONEWEB-0182_48228		
        END Instance
        Instance Satellite/ONEWEB-0183_48219
            Constellation/oneweb		
            Satellite/ONEWEB-0183_48219		
        END Instance
        Instance Satellite/ONEWEB-0184_48211
            Constellation/oneweb		
            Satellite/ONEWEB-0184_48211		
        END Instance
        Instance Satellite/ONEWEB-0185_48220
            Constellation/oneweb		
            Satellite/ONEWEB-0185_48220		
        END Instance
        Instance Satellite/ONEWEB-0186_48229
            Constellation/oneweb		
            Satellite/ONEWEB-0186_48229		
        END Instance
        Instance Satellite/ONEWEB-0187_48221
            Constellation/oneweb		
            Satellite/ONEWEB-0187_48221		
        END Instance
        Instance Satellite/ONEWEB-0188_48231
            Constellation/oneweb		
            Satellite/ONEWEB-0188_48231		
        END Instance
        Instance Satellite/ONEWEB-0189_48217
            Constellation/oneweb		
            Satellite/ONEWEB-0189_48217		
        END Instance
        Instance Satellite/ONEWEB-0190_48796
            Constellation/oneweb		
            Satellite/ONEWEB-0190_48796		
        END Instance
        Instance Satellite/ONEWEB-0191_48239
            Constellation/oneweb		
            Satellite/ONEWEB-0191_48239		
        END Instance
        Instance Satellite/ONEWEB-0192_48222
            Constellation/oneweb		
            Satellite/ONEWEB-0192_48222		
        END Instance
        Instance Satellite/ONEWEB-0193_48238
            Constellation/oneweb		
            Satellite/ONEWEB-0193_48238		
        END Instance
        Instance Satellite/ONEWEB-0194_48237
            Constellation/oneweb		
            Satellite/ONEWEB-0194_48237		
        END Instance
        Instance Satellite/ONEWEB-0195_48240
            Constellation/oneweb		
            Satellite/ONEWEB-0195_48240		
        END Instance
        Instance Satellite/ONEWEB-0196_48218
            Constellation/oneweb		
            Satellite/ONEWEB-0196_48218		
        END Instance
        Instance Satellite/ONEWEB-0197_48236
            Constellation/oneweb		
            Satellite/ONEWEB-0197_48236		
        END Instance
        Instance Satellite/ONEWEB-0198_48216
            Constellation/oneweb		
            Satellite/ONEWEB-0198_48216		
        END Instance
        Instance Satellite/ONEWEB-0199_48234
            Constellation/oneweb		
            Satellite/ONEWEB-0199_48234		
        END Instance
        Instance Satellite/ONEWEB-0200_48244
            Constellation/oneweb		
            Satellite/ONEWEB-0200_48244		
        END Instance
        Instance Satellite/ONEWEB-0201_48241
            Constellation/oneweb		
            Satellite/ONEWEB-0201_48241		
        END Instance
        Instance Satellite/ONEWEB-0202_48224
            Constellation/oneweb		
            Satellite/ONEWEB-0202_48224		
        END Instance
        Instance Satellite/ONEWEB-0203_48235
            Constellation/oneweb		
            Satellite/ONEWEB-0203_48235		
        END Instance
        Instance Satellite/ONEWEB-0204_48225
            Constellation/oneweb		
            Satellite/ONEWEB-0204_48225		
        END Instance
        Instance Satellite/ONEWEB-0205_48226
            Constellation/oneweb		
            Satellite/ONEWEB-0205_48226		
        END Instance
        Instance Satellite/ONEWEB-0206_48227
            Constellation/oneweb		
            Satellite/ONEWEB-0206_48227		
        END Instance
        Instance Satellite/ONEWEB-0207_48242
            Constellation/oneweb		
            Satellite/ONEWEB-0207_48242		
        END Instance
        Instance Satellite/ONEWEB-0208_48243
            Constellation/oneweb		
            Satellite/ONEWEB-0208_48243		
        END Instance
        Instance Satellite/ONEWEB-0209_48215
            Constellation/oneweb		
            Satellite/ONEWEB-0209_48215		
        END Instance
        Instance Satellite/ONEWEB-0210_48787
            Constellation/oneweb		
            Satellite/ONEWEB-0210_48787		
        END Instance
        Instance Satellite/ONEWEB-0211_48767
            Constellation/oneweb		
            Satellite/ONEWEB-0211_48767		
        END Instance
        Instance Satellite/ONEWEB-0212_48791
            Constellation/oneweb		
            Satellite/ONEWEB-0212_48791		
        END Instance
        Instance Satellite/ONEWEB-0213_48790
            Constellation/oneweb		
            Satellite/ONEWEB-0213_48790		
        END Instance
        Instance Satellite/ONEWEB-0214_48788
            Constellation/oneweb		
            Satellite/ONEWEB-0214_48788		
        END Instance
        Instance Satellite/ONEWEB-0215_48800
            Constellation/oneweb		
            Satellite/ONEWEB-0215_48800		
        END Instance
        Instance Satellite/ONEWEB-0216_48801
            Constellation/oneweb		
            Satellite/ONEWEB-0216_48801		
        END Instance
        Instance Satellite/ONEWEB-0217_48245
            Constellation/oneweb		
            Satellite/ONEWEB-0217_48245		
        END Instance
        Instance Satellite/ONEWEB-0218_48214
            Constellation/oneweb		
            Satellite/ONEWEB-0218_48214		
        END Instance
        Instance Satellite/ONEWEB-0219_48223
            Constellation/oneweb		
            Satellite/ONEWEB-0219_48223		
        END Instance
        Instance Satellite/ONEWEB-0220_48232
            Constellation/oneweb		
            Satellite/ONEWEB-0220_48232		
        END Instance
        Instance Satellite/ONEWEB-0221_48789
            Constellation/oneweb		
            Satellite/ONEWEB-0221_48789		
        END Instance
        Instance Satellite/ONEWEB-0222_48775
            Constellation/oneweb		
            Satellite/ONEWEB-0222_48775		
        END Instance
        Instance Satellite/ONEWEB-0223_48768
            Constellation/oneweb		
            Satellite/ONEWEB-0223_48768		
        END Instance
        Instance Satellite/ONEWEB-0224_48794
            Constellation/oneweb		
            Satellite/ONEWEB-0224_48794		
        END Instance
        Instance Satellite/ONEWEB-0225_48799
            Constellation/oneweb		
            Satellite/ONEWEB-0225_48799		
        END Instance
        Instance Satellite/ONEWEB-0226_48793
            Constellation/oneweb		
            Satellite/ONEWEB-0226_48793		
        END Instance
        Instance Satellite/ONEWEB-0227_48792
            Constellation/oneweb		
            Satellite/ONEWEB-0227_48792		
        END Instance
        Instance Satellite/ONEWEB-0228_48780
            Constellation/oneweb		
            Satellite/ONEWEB-0228_48780		
        END Instance
        Instance Satellite/ONEWEB-0229_48779
            Constellation/oneweb		
            Satellite/ONEWEB-0229_48779		
        END Instance
        Instance Satellite/ONEWEB-0230_48769
            Constellation/oneweb		
            Satellite/ONEWEB-0230_48769		
        END Instance
        Instance Satellite/ONEWEB-0231_48782
            Constellation/oneweb		
            Satellite/ONEWEB-0231_48782		
        END Instance
        Instance Satellite/ONEWEB-0232_48781
            Constellation/oneweb		
            Satellite/ONEWEB-0232_48781		
        END Instance
        Instance Satellite/ONEWEB-0233_48795
            Constellation/oneweb		
            Satellite/ONEWEB-0233_48795		
        END Instance
        Instance Satellite/ONEWEB-0234_48783
            Constellation/oneweb		
            Satellite/ONEWEB-0234_48783		
        END Instance
        Instance Satellite/ONEWEB-0235_48771
            Constellation/oneweb		
            Satellite/ONEWEB-0235_48771		
        END Instance
        Instance Satellite/ONEWEB-0236_48797
            Constellation/oneweb		
            Satellite/ONEWEB-0236_48797		
        END Instance
        Instance Satellite/ONEWEB-0237_48770
            Constellation/oneweb		
            Satellite/ONEWEB-0237_48770		
        END Instance
        Instance Satellite/ONEWEB-0238_48784
            Constellation/oneweb		
            Satellite/ONEWEB-0238_48784		
        END Instance
        Instance Satellite/ONEWEB-0239_48802
            Constellation/oneweb		
            Satellite/ONEWEB-0239_48802		
        END Instance
        Instance Satellite/ONEWEB-0240_48785
            Constellation/oneweb		
            Satellite/ONEWEB-0240_48785		
        END Instance
        Instance Satellite/ONEWEB-0241_48773
            Constellation/oneweb		
            Satellite/ONEWEB-0241_48773		
        END Instance
        Instance Satellite/ONEWEB-0242_48772
            Constellation/oneweb		
            Satellite/ONEWEB-0242_48772		
        END Instance
        Instance Satellite/ONEWEB-0243_48774
            Constellation/oneweb		
            Satellite/ONEWEB-0243_48774		
        END Instance
        Instance Satellite/ONEWEB-0244_48776
            Constellation/oneweb		
            Satellite/ONEWEB-0244_48776		
        END Instance
        Instance Satellite/ONEWEB-0245_48778
            Constellation/oneweb		
            Satellite/ONEWEB-0245_48778		
        END Instance
        Instance Satellite/ONEWEB-0246_48786
            Constellation/oneweb		
            Satellite/ONEWEB-0246_48786		
        END Instance
        Instance Satellite/ONEWEB-0247_48777
            Constellation/oneweb		
            Satellite/ONEWEB-0247_48777		
        END Instance
        Instance Satellite/ONEWEB-0248_48798
            Constellation/oneweb		
            Satellite/ONEWEB-0248_48798		
        END Instance
    END References

END Scenario
