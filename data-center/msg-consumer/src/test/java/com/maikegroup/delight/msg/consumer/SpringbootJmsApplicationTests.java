/**
 * Project Name:msg-consumer
 * File Name:SpringbootJmsApplicationTests.java
 * Package Name:com.maikegroup.delight.msg.consumer
 * Copyright (c) 2017, ******.
 *
 */
package com.maikegroup.delight.msg.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: SpringbootJmsApplicationTests <br/>
 * Function: 测试JMS消息发送. <br/>
 * @author juan.yang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJmsApplicationTests {
	
	private static final Log logger = LogFactory.getLog(SpringbootJmsApplicationTests.class);

	@Test
	public void contextLoads() throws InterruptedException {

	}
}
