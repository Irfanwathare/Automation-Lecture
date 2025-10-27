package com.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LogDemo {

	public static void main(String[] args) {
	
		Logger log =LogManager.getFormatterLogger();
		
		log.error("This is an error message");
		log.fatal("This is an Fatal message");
		log.info("This is an info message");
		log.trace("This is an trace message");
		log.debug("This is an debug message");

	}

}
