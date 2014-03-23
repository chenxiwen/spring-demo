/**
 * @Project: spring-demo Maven Webapp
 * @Title: CglibProxyFactory.java
 * @Package com.ender.demo.spring.aop.theory
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 下午12:06:46
 * @version V1.0.0
 */
package com.ender.demo.spring.aop.theory;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;



/**
 * @ClassName: CglibProxyFactory
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 下午12:06:46
 *
 */
public class CglibProxyFactory implements MethodInterceptor{
	private Object targetObject;
	private User user;
	
	public Object getProxyInstance(Object o){
		this.targetObject = o;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.targetObject.getClass());
		enhancer.setCallback(this);
		Object proxy = enhancer.create();
		return proxy;
	}

	/*
	  * <p>Title: intercept</p>
	  * <p>Description: </p>
	  * @param arg0
	  * @param arg1
	  * @param arg2
	  * @param arg3
	  * @return
	  * @throws Throwable
	  * @see net.sf.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], net.sf.cglib.proxy.MethodProxy)
	  */
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodPorxy) throws Throwable {
		Object result = null;
		if(this.getUser()!=null&&this.getUser().getRoleSet().size()>0){
			result = method.invoke(this.targetObject, args);
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
