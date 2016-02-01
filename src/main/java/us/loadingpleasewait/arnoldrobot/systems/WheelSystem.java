package us.loadingpleasewait.arnoldrobot.systems;
import edu.wpi.first.wpilibj.RobotDrive;
import us.loadingpleasewait.arnoldrobot.Environment;

/**
 * System that controls the drivetrain
 */
public class WheelSystem implements RobotSystem {
	
	private RobotDrive drive;

	/**
	 * @param environment environment to initialize with
	 */
	public WheelSystem(Environment environment) {
		init(environment);
	}
	
	/* (non-Javadoc)
	 * @see Initializable#init(Environment)
	 */
	@Override
	public void init(Environment environment) {
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
	}
	
	/**
	 * Arcade drive
	 * @param movement movement value from -1 to 1
	 * @param rotation rotation value from -1 to 1
	 */
	public void drive(double movement, double rotation){
		drive.arcadeDrive(movement, rotation);
	}

	/* (non-Javadoc)
	 * @see org.impact2585.lib2585.Destroyable#destroy()
	 */
	@Override
	public void destroy() {
		drive.free();
	}

}
