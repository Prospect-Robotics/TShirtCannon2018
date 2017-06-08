package org.usfirst.frc.team2813.robot.subsystems;

import org.usfirst.frc.team2813.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    private RobotDrive driveTrain;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickDrive());
    }

	public void mecanumDrive(Joystick joy, double gyroAngle) {
		driveTrain.mecanumDrive_Cartesian(joy.getX(), joy.getY(), joy.getTwist(), gyroAngle);
		
	}
    
    
}

