/**
 * @Project: spring-demo Maven Webapp
 * @Title: IUserDao.java
 * @Package com.ender.demo.spring.beans
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午2:19:48
 * @version V1.0.0
 */
package com.ender.demo.spring.beans;

/**
 * @ClassName: IUserDao
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午2:19:48
 *
 */
public interface IUserDao {
	public void saveUser();
	public void updateUser();
	public void deleteUser();
	
	public void printProperties();
	public void printList();
	public void printSet();
	public void printMap();
}
