package TestforLog4j;

import org.apache.logging.log4j.message.LoggerNameAwareMessage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestClass {

	private static Logger logger = LogManager.getLogger(TestClass.class);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		TestClass testclass = new TestClass();
		
		logger.info("This is a information message");
		logger.error("Error message");
		logger.warn("Warning message");
		logger.fatal("Fatal message");
		logger.debug("Debugging the message");
		//System.out.println("Hello !!!");
		
		Properties properties = new Properties();
        InputStream fs = testclass.getClass().getClassLoader().getResourceAsStream("Log4j2.properties"); 
        properties.load(fs);
        
        String userName = properties.getProperty("dhruv");
		
	}

}
