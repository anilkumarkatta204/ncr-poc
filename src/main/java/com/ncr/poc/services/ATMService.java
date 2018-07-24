package com.ncr.poc.services;

import org.apache.log4j.Logger;

public class ATMService implements Runnable{
	
	private final static Logger logger = Logger.getLogger(ATMService.class);

	private String name = "";
	
	public ATMService(String name) {
		this.name = name;
	}

	public void run() {
		try {
			logger.info("Started : " + name + ": "+Thread.currentThread().getName());
			doSomething();
			Thread.sleep(5000);
			logger.info("Finished : " + name + ": "+Thread.currentThread().getName());
			
		} catch (Exception e) {
			logger.error("Application Exception Raised : ", e);			
		} 
	}
	
	private void doSomething() {
		logger.info("*****Entered doSomething Method*****");
		logger.info("*****Exited doSomething Method*****");
	}
}
