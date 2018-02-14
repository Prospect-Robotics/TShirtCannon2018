package org.usfirst.frc.team2813.robot.commands;

import org.usfirst.frc.team2813.robot.Robot;
import org.usfirst.frc.team2813.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickDrive extends Command {
	DriveTrain driveTrain;
    public JoystickDrive() {
    	requires(Robot.getInstance().driveTrain);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot r = Robot.getInstance(); // syntactic sugar
    	r.driveTrain.mecanumDrive(r.oi.joystick0, r.oi.driveTypeChooser.getSelected().getAsDouble());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
}
// :D