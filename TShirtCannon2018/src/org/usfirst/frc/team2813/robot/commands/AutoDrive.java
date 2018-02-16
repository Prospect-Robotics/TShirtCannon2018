package org.usfirst.frc.team2813.robot.commands;

import org.usfirst.frc.team2813.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class AutoDrive extends TimedCommand {

    private final double forward, lateral, rotate;

	public AutoDrive(double forward, double lateral, double spin, double timeout) {
        super(timeout);
        requires(Robot.driveTrain);
        this.forward=forward;
        this.lateral=lateral;
        this.rotate=spin;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.mecanumDrive_cartesian(forward, lateral, rotate);
    }
}
