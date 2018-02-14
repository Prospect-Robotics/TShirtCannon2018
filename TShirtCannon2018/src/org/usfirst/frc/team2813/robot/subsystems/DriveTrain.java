package org.usfirst.frc.team2813.robot.subsystems;

import org.usfirst.frc.team2813.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    private final RobotDrive driveTrain;
    
    public DriveTrain() {
    	driveTrain = new RobotDrive(new Spark(0), new Spark(1),
    			new Spark(2), new Spark(3));
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickDrive());
    }

	public void mecanumDrive(Joystick joystick0, double gyroAngle) {
		driveTrain.mecanumDrive_Cartesian(joystick0.getX(), joystick0.getY(), joystick0.getTwist(), gyroAngle);
		
	}
	
	public void mecanumDrive_cartesian(double forward, double lateral, double rotate) {
		driveTrain.mecanumDrive_Cartesian(forward, lateral, rotate, 0);
		
	}
    
    
}

