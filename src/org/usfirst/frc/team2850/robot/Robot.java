
package org.usfirst.frc.team2850.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	
    public void robotInit() {
    	 Definitions.initPerf();
  
        
    }
    
	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the switch structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */
    public void autonomousInit() {
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	
    }


    public void teleopPeriodic() {
   //Definitions.robotdrive.setSafetyEnabled(false);
   //DriveShifter.shiftGears();
   //Definitions.compressor.start();
   Definitions.intake.set(-Definitions.xbox1.getRawAxis(3));
   Definitions.robotdrive.arcadeDrive(Definitions.xbox1.getRawAxis(1), -Definitions.xbox1.getRawAxis(4));
  
   if(Double.compare(Definitions.PDP.getCurrent(11),Definitions.maxC) >0)
   {
	   //(int)Definitions.PDP.getCurrent(11) > Definitions.maxC
	   Definitions.maxC = Definitions.PDP.getCurrent(11);
	   System.out.println(Definitions.maxC);
   }
   
   
    }
    
    
    public void testPeriodic() {
    
    }
    
}
