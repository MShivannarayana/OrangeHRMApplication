package com.Utility;

import java.util.Properties;
import java.util.logging.Logger;

public class Log {
	public static Logger log=Logger.getLogger("Log");
	public static void info(String message)
	{
		PropertiesConfigure("Log4j.properties");
		Log.info(message);
		
	}
	private static void PropertiesConfigure(String string) {
		// TODO Auto-generated method stub
		
	}
	private static void Configure(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
