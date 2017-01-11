//package org.usfirst.frc.team2850.robot;
//import org.usfirst.frc.team2850.robot.Robot;
//
//
//public class antiBrownOutDrive {
//	public static double voltage;
//	public static double threshold = 10.0;
//	public static double difference;
//	public static double mult;
//	public static double adjustment = .133;
//	public static double rawAx1;
//	public static double rawAx4;
////testing ways to prevent brownouts please dont delete just comment out in Robot.java
//public static void drive()
//{
//	//does NOT work do not use this!!!! 
//	//CAUSS THE ROBOT TO BROWN OUT
//
////	voltage = Robot.pdp.getVoltage();
//	System.out.println(voltage);
//	if(voltage < threshold)
//	{
//		difference = threshold - voltage;
//		difference *= adjustment; 
//		mult = 1 - difference;   
//	}							
//	else
//	{
//		mult = 1;
//	}
//		Robot.drivetrain.arcadeDrive( -Robot.xbox1.getRawAxis(1)*mult, -Robot.xbox1.getRawAxis(4)*mult);
//	
//	
//}
//
//}