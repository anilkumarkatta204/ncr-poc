package com.ncr.poc.consumers;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import com.ncr.poc.constants.ApplicationConstants;
import com.ncr.poc.services.ATMService;

public class ATMConsumers {
	
	private final static Logger logger = Logger.getLogger(ATMConsumers.class);


	public static void main(String[] args) {
		
		logger.info("##########-- ATMConsumers Started --##########");
		
		System.out.print("Please Enter Number of Workers [Consumers] to be executed (eg: 10) : ");
		
		Scanner scanner = new Scanner(System.in);
		//logger.debug(">>>>> Captuering User Input from the console <<<<<");
		int input = scanner.nextInt();
		logger.debug(">>>>> User Input Entered :" + input +" <<<<<");
		
		logger.debug(">>>>> Instantiating Executer Service Framework <<<<<");
		ExecutorService executors = Executors.newFixedThreadPool(ApplicationConstants.FIXED_THREAD_POOOL_SIZE);
		
		while(0<input) {
			logger.debug(">>>>> Instantiating ATM Service Worker <<<<<");
			//Runnable worker = new ATMService("Consumer-ID" + input);
			
			logger.debug(">>>>> Initiating Executer Service <<<<<");
            executors.execute(new ATMService("Consumer-ID" + input));
			input--;
		}
		
		logger.debug(">>>>> Shutting down ATM Service Worker Thread <<<<<");
		executors.shutdown();
        while (!executors.isTerminated()) {
        }
        logger.debug(">>>>> Finished all threads <<<<<");
        System.out.println("Finished all threads");

		scanner.close();		
		logger.info("##########-- ATMConsumers Completed --##########");
	}

}
