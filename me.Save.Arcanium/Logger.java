package me.Save.arcanium;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	private String ANSI_RESET = "\u001B[0m";
	private String ANSI_BLACK = "\u001B[30m";
	private String ANSI_RED = "\u001B[31m";
	private String ANSI_GREEN = "\u001B[32m";
	private String ANSI_YELLOW = "\u001B[33m";
	private String ANSI_BLUE = "\u001B[34m";
	private String ANSI_PURPLE = "\u001B[35m";
	private String ANSI_CYAN = "\u001B[36m";
	private String ANSI_WHITE = "\u001B[37m";
	
	String prefix;
	String time = null;
	
	Logger(String prefix) {
		this.prefix = prefix.substring(0, 1).toUpperCase() + prefix.substring(1).toLowerCase();
	}
	
	private void log(int level, Object message)
	{
		switch(level) {
		case LogLevel.INFO:
			System.out.println(time + " [" + ANSI_CYAN + prefix + ANSI_RESET + "/" + ANSI_CYAN + "INFO" + ANSI_RESET + "] " + message);
			break;
		case LogLevel.WARN:
	        System.out.println(time + " [" + ANSI_YELLOW + prefix + ANSI_RESET + "/" + ANSI_YELLOW + "WARN" + ANSI_RESET + "] " + message);
	        break;
		case LogLevel.DEBUG:
	        System.out.println(time + " [" + ANSI_PURPLE + prefix + ANSI_RESET + "/" + ANSI_PURPLE + "DEBUG" + ANSI_RESET + "] " + message);
	        break;
		case LogLevel.ERROR:
	        System.err.println(time + " [" + ANSI_RED + prefix + ANSI_RESET + "/" + ANSI_RED + "ERROR" + ANSI_RESET + "] " + message);
	        break;
		}
	}

    public void info(Object message) {
        this.log(LogLevel.INFO, message);
    }
    public void error(Object message) {
        this.log(LogLevel.ERROR, message);
    }
    public void warn(Object message) {
    	this.log(LogLevel.WARN, message);
    }
    public void debug(Object message) {
    	this.log(LogLevel.DEBUG, message);
    }
}
