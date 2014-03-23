/**
 * @Project: spring-demo Maven Webapp
 * @Title: UserDaoImpl.java
 * @Package com.ender.demo.spring.beans
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午2:21:19
 * @version V1.0.0
 */
package com.ender.demo.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午2:21:19
 *
 */
public class UserDaoImpl implements IUserDao {
	private Properties properties;
	private List list;
	private Set set;
	private Map map;

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	/**
	 * @return the list
	 */
	public List getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List list) {
		this.list = list;
	}

	/**
	 * @return the set
	 */
	public Set getSet() {
		return set;
	}

	/**
	 * @param set the set to set
	 */
	public void setSet(Set set) {
		this.set = set;
	}

	/**
	 * @return the map
	 */
	public Map getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map map) {
		this.map = map;
	}

	/*
	 * <p>Title: saveUser</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.beans.IUserDao#saveUser()
	 */
	public void saveUser() {
		// TODO Auto-generated method stub
		System.out.println("save a user!");

	}

	/*
	 * <p>Title: updateUser</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.beans.IUserDao#updateUser()
	 */
	public void updateUser() {
		// TODO Auto-generated method stub
		System.out.println("update a user!");
		
	}

	/*
	 * <p>Title: deleteUser</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.beans.IUserDao#deleteUser()
	 */
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("delete a user!");

	}

	/*
	  * <p>Title: printProperties</p>
	  * <p>Description: </p>
	  * @see com.ender.demo.spring.beans.IUserDao#printProperties()
	  */
	public void printProperties() {
		// TODO Auto-generated method stub
		for(Object pro:properties.keySet()){
			System.out.println(properties.get(pro));
		}
	}

	/*
	  * <p>Title: printList</p>
	  * <p>Description: </p>
	  * @see com.ender.demo.spring.beans.IUserDao#printList()
	  */
	public void printList() {
		// TODO Auto-generated method stub
		for(Object o : list){
			System.out.println(o);
		}
	}

	/*
	  * <p>Title: printSet</p>
	  * <p>Description: </p>
	  * @see com.ender.demo.spring.beans.IUserDao#printSet()
	  */
	public void printSet() {
		// TODO Auto-generated method stub
		for(Object entity:set){
			System.out.println(entity);
		}
	}

	/*
	  * <p>Title: printMap</p>
	  * <p>Description: </p>
	  * @see com.ender.demo.spring.beans.IUserDao#printMap()
	  */
	public void printMap() {
		// TODO Auto-generated method stub
		for(Object obj : map.keySet()){
			System.out.println(map.get(obj));
		}
	}
	

}
