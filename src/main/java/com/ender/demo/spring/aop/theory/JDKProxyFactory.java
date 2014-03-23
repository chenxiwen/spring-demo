/**
 * @Project: spring-demo Maven Webapp
 * @Title: EnderProxyFactory.java
 * @Package com.ender.demo.spring.aop.theory
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 上午11:37:29
 * @version V1.0.0
 */
package com.ender.demo.spring.aop.theory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: EnderProxyFactory
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 上午11:37:29
 *
 */
public class JDKProxyFactory implements InvocationHandler {
	private Object targetObject;
	
	private User user;
	
	public Object getProxyInstance(Object o){
		this.targetObject = o;
		Object obj = Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(), this.targetObject.getClass().getInterfaces(), this);
		return obj;
	}

	/*
	  * <p>Title: invoke</p>
	  * <p>Description: </p>
	  * @param proxy
	  * @param method
	  * @param args
	  * @return
	  * @throws Throwable
	  * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	  */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		if(this.getUser()!=null && this.getUser().getRoleSet().size()>0){
//			IServiceBean serviceBean = (IServiceBean)proxy;
			result = method.invoke(proxy, args);
		}else{
			System.out.println("no user or user don't have roles");
		}

		return result;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
