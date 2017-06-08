package org.usfirst.frc.team2813.robot.triggers;

import edu.wpi.first.wpilibj.Utility;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 *
 */
public class RoboRIOUserButton extends Button {
    public boolean get() {
        return Utility.getUserButton();
    }
}
