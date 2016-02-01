package us.loadingpleasewait.arnoldrobot;
import org.impact2585.lib2585.RobotEnvironment;

import edu.wpi.first.wpilibj.RobotBase;
import us.loadingpleasewait.arnoldrobot.systems.WheelSystem;
import us.loadingpleasewait.arnoldrobot.input.XboxInput;

/**
 * Environment containing the RobotSystems
 */
public class Environment extends RobotEnvironment {

	private static final long serialVersionUID = -4080895200275405374L;

	private WheelSystem wheels;
	private XboxInput input;

	/**
	 * @param robot robot to set
	 */
	public Environment(RobotBase robot) {
		super(robot);
		input = new XboxInput();
		wheels = new WheelSystem(this);
	}

	/* (non-Javadoc)
	 * @see org.impact2585.lib2585.Destroyable#destroy()
	 */
	@Override
	public void destroy() {
		wheels.destroy();
	}

	/**
	 * @return the input
	 */
	public XboxInput getInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(XboxInput input) {
		this.input = input;
	}

	/**
	 * @return the wheels
	 */
	public WheelSystem getWheels() {
		return wheels;
	}

	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(WheelSystem wheels) {
		this.wheels = wheels;
	}

}
