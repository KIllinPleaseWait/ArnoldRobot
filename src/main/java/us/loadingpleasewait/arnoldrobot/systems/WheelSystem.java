package us.loadingpleasewait.arnoldrobot.systems;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import us.loadingpleasewait.arnoldrobot.Environment;
import us.loadingpleasewait.arnoldrobot.input.XboxInput;
import us.loadingpleasewait.arnoldrobot.Arnold;

/**
 * System that controls the drivetrain
 */
public class WheelSystem implements RobotSystem {

	private RobotDrive drive;
	private XboxInput input;



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
		drive = new RobotDrive(new Victor(1), new Victor(2), new Victor(3),  new Victor(4));
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight , true );
		drive.setInvertedMotor(RobotDrive.MotorType.kRearRight , true );
		input = new XboxInput();
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		 drive(input.movementValue(), input.rotatationValue());
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
