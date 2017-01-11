package org.usfirst.frc.team2850.robot;

//import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
//import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;

public class Definitions {
	public static Spark Leftdrive1;
	//public static Spark Leftdrive2;
	public static Spark Rightdrive1;
	public static Spark intake;
	public static PowerDistributionPanel PDP;
	public static double maxC;
	//public static Spark Rightdrive2;
	//public static Compressor compressor;
	public static Joystick xbox1;
	//public static Solenoid Driveshifter;
	public static RobotDrive robotdrive;
	
public static void initPerf()
{
	maxC = 0;
	Leftdrive1 = new Spark(1);
	Rightdrive1 = new Spark(0);
	intake = new Spark(2);
	PDP = new PowerDistributionPanel();
	robotdrive = new RobotDrive(Leftdrive1,Rightdrive1);
	//compressor = new Compressor();
	xbox1 = new Joystick(0);
	//Driveshifter = new Solenoid(0);
	
}

}
