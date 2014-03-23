/**
 * @Project: spring-demo Maven Webapp
 * @Title: HelloWorldImpl.java
 * @Package com.ender.demo.spring.beans
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 上午11:36:40
 * @version V1.0.0
 */
package com.ender.demo.spring.beans;

/**
 * @ClassName: HelloWorldImpl
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 上午11:36:40
 *
 */
public class HelloWorldImpl implements HelloWorldInterface {
	
	private IUserDao userDao;
	private String world; 

	/**
	 * @return the world
	 */
	public String getWorld() {
		return world;
	}

	/**
	 * @param world the world to set
	 */
	public void setWorld(String world) {
		System.out.println("setWorld");
		this.world = world;
	}
	
	

	/**
	 * @return the userDao
	 */
	public IUserDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(IUserDao userDao) {
		System.out.println("setUserDao");
		this.userDao = userDao;
	}

	/*
	 * <p>Title: sayHello</p>
	 * <p>Description: </p>
	 * @param name
	 * @see com.ender.demo.spring.beans.HelloWorldInterface#sayHello(java.lang.String)
	 */
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("sayHelloMethod");
		System.out.println("Hello"+" "+(null==name?getWorld():name));
		userDao.saveUser();
	}

}
