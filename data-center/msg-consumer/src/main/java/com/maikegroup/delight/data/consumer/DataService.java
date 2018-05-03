/**
 * Project Name:data-consumer
 * File Name:DataService.java
 * Package Name:com.maikegroup.delight.data.consumer
 * Copyright (c) 2018, *******.
 *
 */
package com.maikegroup.delight.data.consumer;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import us.codecraft.webmagic.Spider;

/**
 * ClassName: DataService <br/>
 * Function: TODO 接口实现类. <br/>
 * 
 * @author juan.yang
 */

@Component
public class DataService {

	Logger logger = Logger.getLogger(DataService.class);

	@Autowired
	private CuPriceProcessor cuPriceProcessor;
	
	public void process() {

		// do your business

		long startTime, endTime;
		System.out.println("爬虫开始...");
		startTime = System.currentTimeMillis();

		// 从有色行情首页开始抓，开启5个线程，启动爬虫
		Spider.create(cuPriceProcessor).addUrl("https://hq.smm.cn/tong").thread(5).run();

		endTime = System.currentTimeMillis();
		System.out.println("爬虫结束，耗时约" + ((endTime - startTime) / 1000) + "秒，已保存到数据库，大胖猫请查收！");

	}
}
