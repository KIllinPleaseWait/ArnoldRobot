package us.loadingpleasewait.arnoldrobot;
/**
 * SAM interface with an init method
 */
@FunctionalInterface 
public interface Initializable {
	
	/**
	 * Initialize an instance
	 * @param environment the environment to initialize with
	 */
	public void init(Environment environment);
	
}
