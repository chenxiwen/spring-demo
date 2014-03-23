/**
 * @Project: spring-demo Maven Webapp
 * @Title: User.java
 * @Package com.ender.demo.spring.aop.theory
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 上午11:33:50
 * @version V1.0.0
 */
package com.ender.demo.spring.aop.theory;

import java.util.Set;

/**
 * @ClassName: User
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 上午11:33:50
 *
 */
public class User {
	private String nickName;
	private String username;
	private String password;
	
	private Set<String> roleSet;

	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the roleSet
	 */
	public Set<String> getRoleSet() {
		return roleSet;
	}

	/**
	 * @param roleSet the roleSet to set
	 */
	public void setRoleSet(Set<String> roleSet) {
		this.roleSet = roleSet;
	}
	
	
}
