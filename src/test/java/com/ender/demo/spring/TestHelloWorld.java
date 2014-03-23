/**
 * @Project: spring-demo Maven Webapp
 * @Title: TestHelloWorld.java
 * @Package ender.com.demo.spring
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 上午11:41:57
 * @version V1.0.0
 */
package com.ender.demo.spring;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ender.demo.spring.beans.HelloWorldInterface;

/**
 * @ClassName: TestHelloWorld
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 上午11:41:57
 *
 */
public class TestHelloWorld {
	private static ApplicationContext ac;
	@BeforeClass
	public static void beforeClass(){
		if(ac == null){
//			ac = new ClassPathXmlApplicationContext();
			ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			System.out.println("applicationContext is null, new one for ac");
		}
//		System.out.println("beforeClass:"+ac);
	}
	@Test
	public void testSayHello(){
		HelloWorldInterface hw = ac.getBean("helloWorld",HelloWorldInterface.class);
		hw.sayHello(null);
	}
}
