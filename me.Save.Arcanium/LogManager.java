package me.Save.arcanium;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogManager {
	
	private LogManager() {}
	
	public static Logger createLoggerWithDefaultPrefix() {
		return new Logger("Client");
	}
	public static Logger createLogger(final String prefix) {
		Logger logger = new Logger(prefix);
		logger.time = setupDateAndTime(logger.time);
		
		return logger;
	}
	private static String setupDateAndTime(String time) {
		Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("kk:mm:ss");
		time = formatter.format(currentDate);
		
		return "[" + time + "]";
	}
	
}