package us.loadingpleasewait.arnoldrobot;
import org.impact2585.lib2585.RunnableExecuter;

/**
 * Executer for teleoperated mode
 */
public class TeleopExecuter extends RunnableExecuter implements Initializable {

	private static final long serialVersionUID = 4016295475222526857L;

	public TeleopExecuter(Environment environment) {
		init(environment);
	}

	/* (non-Javadoc)
	 * @see Initializable#init(Environment)
	 */
	@Override
	public void init(Environment environment) {
		getRunnables().add(environment.getWheels());
	}

}
