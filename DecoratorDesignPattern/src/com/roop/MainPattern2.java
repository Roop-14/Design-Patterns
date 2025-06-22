package com.roop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger{
	@Override
	public void log(String message) {
		System.out.println(message);
		
	}
}

abstract class LoggerDecorator implements Logger{
	Logger logger;
	public LoggerDecorator(Logger logger) {
		this.logger=logger;
	}
}

class TimeStampLogger extends LoggerDecorator{
	public TimeStampLogger(Logger logger) {
		super(logger);
	}
	@Override
	public void log(String message) {
		String timeStamp="["+LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE)+"]";
		logger.log(timeStamp+""+message);
	}
	
}


public class MainPattern2 {

	public static void main(String[] args) {
		Logger logger=new TimeStampLogger(new ConsoleLogger());
		logger.log("Failure");

	}

}
