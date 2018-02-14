package org.usfirst.frc.team2813.robot.triggers;

import edu.wpi.first.wpilibj.Utility;
import edu.wpi.first.wpilibj.buttons.Button;

/** The USER button on the roboRIO.  You can make it do stuff when you
 * push it.  Not really sure what though, maybe bind this to 'fire'
 * and have them hold the top bit at a 45-degree angle and press it?
 *
 */
public class RoboRIOUserButton extends Button {
    public boolean get() {
        return Utility.getUserButton();
    }
}
