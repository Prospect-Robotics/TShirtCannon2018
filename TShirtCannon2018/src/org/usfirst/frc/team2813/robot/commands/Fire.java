package org.usfirst.frc.team2813.robot.commands;

import org.usfirst.frc.team2813.robot.Robot;
import org.usfirst.frc.team2813.robot.subsystems.Cannon;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class Fire extends TimedCommand {

	private Cannon cannon;
	public static double SOLENOID_ON_TIME = 0.25D;
	
    public Fire(Cannon cannon) {
    	super(SOLENOID_ON_TIME);
        requires(cannon);
        requires(Robot.getInstance().pneumatics);
        this.cannon=cannon;
    }

    // Called as the command starts executing
    protected void initialize() {
    	// disconnect the tank while firing:
    	cannon.setPressurizing(false);
    	cannon.solenoid.set(true);
    }

    // Called as the command stops executing (after the set delay or when it is cancel()ed)
    protected void end() {
    	cannon.solenoid.set(false);
    	// repressurize the cylinder
    	cannon.setPressurizing(true);
    }
}
