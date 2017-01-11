package org.usfirst.frc.team2850.robot;

public class DriveShifter {
	public static boolean shifterState = false;
	public static void shiftGears()
	{
		if(Definitions.xbox1.getRawButton(6))
		{
			shifterState = false;
		}
		else if(Definitions.xbox1.getRawButton(5))
		{
			shifterState = true;
		}
		//Definitions.Driveshifter.set(shifterState);
	}
	
}
