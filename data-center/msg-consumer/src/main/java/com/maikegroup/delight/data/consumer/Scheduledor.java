/**
 * Project Name:data-consumer
 * File Name:Scheduledor.java
 * Package Name:com.maikegroup.delight.data.consumer
 * Copyright (c) 2018, *******.
 *
 */
package com.maikegroup.delight.data.consumer;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ClassName: Scheduledor <br/>
 * Function: TODO 定时任务. <br/>
 * 
 * @author juan.yang
 */
@Component
public class Scheduledor {

	Logger logger = Logger.getLogger(Scheduledor.class);

	@Autowired
	DataService dataService;

	@Scheduled(cron = "0/5 * * * * ? ")
	public void task() {
		logger.info("start");

		// do your business
		dataService.process();

		logger.info("end");
	}
}
