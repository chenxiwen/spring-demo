/**
 * @Project: spring-demo Maven Webapp
 * @Title: TestCollections.java
 * @Package ender.com.demo.spring
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午6:07:43
 * @version V1.0.0
 */
package com.ender.demo.spring;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ender.demo.spring.beans.IUserDao;

/**
 * @ClassName: TestCollections
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午6:07:43
 *
 */
public class TestCollections {
	private static ApplicationContext ac;
	@BeforeClass
	public static void beforeClass(){
		if(ac == null){
			ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
	}
	
	@Test
	public void testProperties(){
		IUserDao userDao = ac.getBean("userDao", IUserDao.class);
		userDao.printProperties();
	}
	@Test
	public void testList(){
		IUserDao userDao = ac.getBean("userDao", IUserDao.class);
		userDao.printList();
	}
	@Test
	public void testSet(){
		IUserDao userDao = ac.getBean("userDao", IUserDao.class);
		userDao.printSet();
	}
	@Test
	public void testMap(){
		IUserDao userDao = ac.getBean("userDao", IUserDao.class);
		userDao.printMap();
	}
	
		
}
