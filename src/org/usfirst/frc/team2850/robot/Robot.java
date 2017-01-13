package org.usfirst.frc.team2850.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {

    public void robotInit() {
    	 Definitions.initPerf();
  
        
    }
    
    public void autonomousInit() {
    	
    }

    public void autonomousPeriodic() {
    	
    }


    public void teleopPeriodic() {
   //DriveShifter.shiftGears();
   //Definitions.compressor.start();
   Definitions.intake.set(-Definitions.xbox1.getRawAxis(3));
   Definitions.robotdrive.arcadeDrive(Definitions.xbox1.getRawAxis(1), -Definitions.xbox1.getRawAxis(4));
   
   if(Double.compare(Definitions.PDP.getCurrent(11),Definitions.maxC) >0)
   {
	   Definitions.maxC = Definitions.PDP.getCurrent(11);
	   System.out.println(Definitions.maxC);
   }
   
   
    }
    
    
    public void testPeriodic() {
    
    }
    
}
