package org.usfirst.frc.team4501.robot;

import edu.wpi.first.wpilibj.SPI.Port;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//DRIVETRAIN
	public static final int TALON1 = 0;
	public static final int TALON2 = 1;
	public static final int TALON3 = 2;
	public static final int TALON4 = 3;
	
	//ARM
	public static final int TALON5 = 6;
	public static final int TALON6 = 7;
	
	//SOLENOID
	public static class SOLENOIDS {
		public static final int HIGHGEAR = 0;        
	}
	
	public static class SENSORS {
		
		//POTENTIOMETER
		public static final int POTENTIOMETERA = 0;
		public static final int POTENTIOMETERB = 270;
		public static final int POTENTIOMETERC = 0;
		
		//GYRO
		public static final int GYRO = 1;
	}

		
}
		

