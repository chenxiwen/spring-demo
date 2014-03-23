/**
 * @Project: spring-demo Maven Webapp
 * @Title: TestAopAnnotation.java
 * @Package ender.com.demo.spring
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 下午4:34:15
 * @version V1.0.0
 */
package com.ender.demo.spring;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ender.demo.spring.aop.ITestBean;

/**
 * @ClassName: TestAopAnnotation
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 下午4:34:15
 *
 */
public class TestAopAnnotation {
	private static ApplicationContext ac;
	@BeforeClass
	public static void beforeClass(){
		if(ac == null){
			ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
	}
	@Test
	public void testAopAnnotation(){
		ITestBean tb = ac.getBean("testBean",ITestBean.class);
		tb.someMethod();
		tb.callMethod("ender");
	}
}
