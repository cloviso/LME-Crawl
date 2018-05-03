/**
 * Project Name:msg-consumer
 * File Name:Application.java
 * Package Name:com.maikegroup.delight.msg.consumer
 * Copyright (c) 2017, ******.
 *
 */
package com.maikegroup.delight.data.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ClassName: Application <br/>
 * Function: 主程序启动类. <br/>
 * 
 * @author juan.yang
 */
@SpringBootApplication
@ComponentScan({"com.maikegroup.delight.data.consumer","com.maikegroup.delight.data.repository"})
@EnableScheduling
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
