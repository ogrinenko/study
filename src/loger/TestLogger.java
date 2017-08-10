package loger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogger {
	
	
	public static void logOuter() {
		logger.info("Open something");
		
		logger.debug("invoke ->>>>>>setPrecondition");
		setPrecondition();
		logger.debug("<<<<<<<----------");
	}
	
	public static void setPrecondition() {
		logger.debug("set special precondition");
	}
	
	
	private static final Logger logger = LogManager.getLogger();
	//private static final Logger logger = LogManager.getLogger(TestLogger.class);
	

	public static void main(String[] args) {
		
		logger.trace("Trace");
		logger.debug("Debug");
		logger.info("Info");
		logger.warn("Warn");
		logger.error("Error");
		logger.fatal("Fatal");
		
		logOuter();

	}

}
