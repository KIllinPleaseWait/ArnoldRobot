package us.loadingpleasewait.arnoldrobot.input;

import org.impact2585.lib2585.XboxConstants;

import edu.wpi.first.wpilibj.Joystick;
import us.loadingpleasewait.arnoldrobot.Arnold;

/**
 * Get input from an XBox 360 controller
 */
public class XboxInput {

	private Joystick controller = new Joystick(0);

	/**
	 * @return value to move forward from -1 to 1
	 */
	public double movementValue() {
		return Arnold.invert(Math.round((float)controller.getRawAxis(XboxConstants.LEFT_Y_AXIS) * 100)) / 100d;
	}

	/**
	 * @return value to rotate from -1 to 1
	 */
	public double rotatationValue() {
		return controller.getRawAxis(XboxConstants.RIGHT_X_AXIS);
	}

}
