package org.usfirst.frc.team2813.robot;

import java.util.function.DoubleSupplier;

import org.usfirst.frc.team2813.robot.commands.Fire;
import org.usfirst.frc.team2813.robot.commands.ResetGyro;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public Joystick joystick0;
	public SendableChooser<DoubleSupplier> driveTypeChooser;
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	public OI() {
		joystick0 = new Joystick(0);
		Robot r = Robot.getInstance();
		
		new JoystickButton(joystick0, 3).whenPressed(new Fire(r.leftCannon));	//  Left cannon has been pressure tested
		new JoystickButton(joystick0, 4).whenPressed(new Fire(r.rightCannon));	//  Right cannon cannister is new; has NOT been pressure tested; uncomment when tested
		new JoystickButton(joystick0, 2).whenPressed(new ResetGyro());
		
		driveTypeChooser = new SendableChooser();
		driveTypeChooser.addDefault("Robot-oriented", () -> 0);
		driveTypeChooser.addObject("Field-oriented", Robot.getInstance().gyro::getAngle);
		SmartDashboard.putData("Select Drive Type", driveTypeChooser);
	}
}
