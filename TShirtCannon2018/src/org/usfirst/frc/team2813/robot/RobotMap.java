package org.usfirst.frc.team2813.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int switchSolenoidPort = 1;	// This solenoid controls which tank will be pressurized next
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	public static final int masterSolenoidPort = -1; 	// -1 here means there is no master solenoid
	public static final boolean hasCompressor = false;
	public static final int leftCannonSolenoid = 0;		// Solenoid on left pressure valve
	public static final int rightCannonSolenoid = 2;	// Solenoid on right pressure valve

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
