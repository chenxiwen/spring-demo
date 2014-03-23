/**
 * @Project: spring-demo Maven Webapp
 * @Title: DependencyInjectionSetterImpl.java
 * @Package com.ender.demo.spring.beans
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午2:48:50
 * @version V1.0.0
 */
package com.ender.demo.spring.beans;

/**
 * @ClassName: DependencyInjectionSetterImpl
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午2:48:50
 *
 */
public class DependencyInjectionSetterImpl implements
		IDependencyInjectionSetter {
	
	private IUserDao userDao;

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
		this.userDao = userDao;
	}

	/*
	 * <p>Title: callMethodFromAnotherBean</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.beans.IDependencyInjectionSetter#callMethodFromAnotherBean()
	 */
	public void callMethodFromAnotherBean() {
		// TODO Auto-generated method stub
		userDao.saveUser();
	}

}
