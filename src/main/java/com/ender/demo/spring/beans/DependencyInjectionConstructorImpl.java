/**
 * @Project: spring-demo Maven Webapp
 * @Title: DependencyInjectionConstructorImpl.java
 * @Package com.ender.demo.spring.beans
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午3:03:02
 * @version V1.0.0
 */
package com.ender.demo.spring.beans;

/**
 * @ClassName: DependencyInjectionConstructorImpl
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午3:03:02
 *
 */
public class DependencyInjectionConstructorImpl implements
		IDependencyInjectionConstructor {
	
	private IUserDao userDao;
	private String name;
	
	public DependencyInjectionConstructorImpl(IUserDao userDao){
		this.userDao = userDao;
		this.name = "ender";
	}
	
//	public DependencyInjectionConstructorImpl(){
//		this.name="ender";
//	}
	
	public DependencyInjectionConstructorImpl(IUserDao userDao,String name){
		this.userDao = userDao;
		this.name = name;
	}

	/*
	 * <p>Title: callMethodFromAnotherBean</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.beans.IDependencyInjectionContructor#callMethodFromAnotherBean()
	 */
	public void callMethodFromAnotherBean() {
		// TODO Auto-generated method stub
		userDao.deleteUser();
		saySth();
	}
	
	public void saySth(){
		System.out.println("Hello "+this.name);
	}

}
