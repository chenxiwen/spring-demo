/**
 * @Project: spring-demo Maven Webapp
 * @Title: DependencyInjectionConstructorVariantImpl.java
 * @Package com.ender.demo.spring.beans
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午4:55:01
 * @version V1.0.0
 */
package com.ender.demo.spring.beans;

/**
 * @ClassName: DependencyInjectionConstructorVariantImpl
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午4:55:01
 *
 */
public class DependencyInjectionConstructorVariantImpl implements
		IDependencyInjectionConstructorVariant {
	private IUserDao userDao;
	private String name;
	
	public static DependencyInjectionConstructorVariantImpl createInstance(IUserDao userDao, String name){
		DependencyInjectionConstructorVariantImpl dicv = new DependencyInjectionConstructorVariantImpl();
		dicv.userDao = userDao;
		dicv.name = name;
		return dicv;
	}

	/*
	 * <p>Title: callMethodFromAnotherBean</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.beans.IDependencyInjectionConstructorVariant#callMethodFromAnotherBean()
	 */
	public void callMethodFromAnotherBean() {
		// TODO Auto-generated method stub
		userDao.updateUser();
		System.out.println("Hello "+this.name+"！");
	}

}
