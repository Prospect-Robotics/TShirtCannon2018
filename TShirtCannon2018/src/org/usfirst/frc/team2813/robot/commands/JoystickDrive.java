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
    	DriveTrain dt = Robot.getInstance().driveTrain;
        requires(dt);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.mecanumDrive(Robot.getInstance().oi.joystick0, Robot.getInstance().gyro.getAngle());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
}
// :D