/**
 * @Project: spring-demo Maven Webapp
 * @Title: TestAop.java
 * @Package ender.com.demo.spring
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 上午12:02:36
 * @version V1.0.0
 */
package com.ender.demo.spring;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ender.demo.spring.aop.ITestBean;

/**
 * @ClassName: TestAop
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 上午12:02:36
 *
 */
public class TestAop {
	private static ApplicationContext ac;
	@BeforeClass
	public static void beforeClass(){
		try{
			if(ac == null){
				ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	@Test
	public void testAop(){
		try{
			ITestBean tb = ac.getBean("testBean",ITestBean.class);
			tb.someMethod();
			tb.callMethod("ender");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
