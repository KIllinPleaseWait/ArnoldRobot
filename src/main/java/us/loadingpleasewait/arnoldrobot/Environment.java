package us.loadingpleasewait.arnoldrobot;
import org.impact2585.lib2585.RobotEnvironment;

import edu.wpi.first.wpilibj.RobotBase;
import us.loadingpleasewait.arnoldrobot.systems.WheelSystem;

/**
 * Environment containing the RobotSystems
 */
public class Environment extends RobotEnvironment {

	private static final long serialVersionUID = -4080895200275405374L;
	
	private WheelSystem wheels;

	/**
	 * @param robot robot to set
	 */
	public Environment(RobotBase robot) {
		super(robot);
	}

	/* (non-Javadoc)
	 * @see org.impact2585.lib2585.Destroyable#destroy()
	 */
	@Override
	public void destroy() {
		wheels.destroy();
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
