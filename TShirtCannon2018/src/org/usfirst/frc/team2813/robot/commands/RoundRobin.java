package org.usfirst.frc.team2813.robot.commands;

import java.util.Deque;
import java.util.LinkedList;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RoundRobin extends Command {
	private Command[] commands;
	private int currentCommand;
    public RoundRobin(Command ...commands) {
    	super(getCommandName(commands));
        this.commands = commands;
    }

    private static String getCommandName(Command[] commands) {
		StringBuilder s=new StringBuilder("RoundRobin(");
		for(int i=0;i<commands.length-1;i++) {
			s.append(s);
			s.append(", ");
		}
		s.append(commands[commands.length-1]);
		s.append(")");
		return s.toString();
	}

	// Called just before this Command runs the first time
    protected void initialize() {
    	currentCommand++;
    	if(currentCommand >= commands.length) currentCommand = 0;
    	commands[currentCommand].start();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !commands[currentCommand].isRunning();
    }


    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	commands[currentCommand].cancel();
    }
}
