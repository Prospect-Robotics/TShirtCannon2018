package org.usfirst.frc.team2813.robot.commands;

import org.usfirst.frc.team2813.robot.subsystems.MotorSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunMotor extends Command {
	
	private final MotorSubsystem motor;
	private double speed;
	
    public RunMotor(MotorSubsystem motor, double speed) {
        requires(motor);
        this.motor = motor;
        this.speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	motor.set(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	motor.set(0.0); // prevent DS warning
    	
    	// The motors in WPILib have watchdogs on them that set them to zero
    	// when they aren't updated often enough.  However, setting them to
    	// zero explicitly is good practice because every time the watchdog
    	// shuts off a motor it logs a warning on the Driver Station.
    }
}
