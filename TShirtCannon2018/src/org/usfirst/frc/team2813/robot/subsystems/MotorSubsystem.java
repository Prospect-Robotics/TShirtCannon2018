package org.usfirst.frc.team2813.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class MotorSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	/** The speed controller this motor subsystem is controlling.
	 * 
	 */
	private final SpeedController motor;
	
	public MotorSubsystem(SpeedController motor) {
		this.motor = motor;
	}
	
	public MotorSubsystem(int pwmChannel) {
		this(new VictorSP(pwmChannel));
	}

    public void initDefaultCommand() {
        setDefaultCommand(null);
    }

	public void set(double speed) {
		motor.set(speed);
	}
}

