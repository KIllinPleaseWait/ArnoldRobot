package us.loadingpleasewait.arnoldrobot;
import org.impact2585.lib2585.ExecuterBasedRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends ExecuterBasedRobot {
    
	private static final long serialVersionUID = 2806539572420010012L;
	
	private Environment environment;
	
    /* (non-Javadoc)
     * @see org.impact2585.lib2585.ExecuterBasedRobot#robotInit()
     */
    @Override
    public void robotInit() {
    	environment = new Environment(this);
    }

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.IterativeRobot#teleopInit()
	 */
	@Override
	public void teleopInit() {
		setExecuter(new TeleopExecuter(environment));
	}

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.RobotBase#free()
	 */
	@Override
	public void free() {
		environment.destroy();
		super.free();
	}
    
}
