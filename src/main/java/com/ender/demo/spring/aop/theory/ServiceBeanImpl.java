/**
 * @Project: spring-demo Maven Webapp
 * @Title: ServiceBeanImpl.java
 * @Package com.ender.demo.spring.aop.theory
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 上午11:32:27
 * @version V1.0.0
 */
package com.ender.demo.spring.aop.theory;

/**
 * @ClassName: ServiceBeanImpl
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 上午11:32:27
 *
 */
public class ServiceBeanImpl implements IServiceBean {

	/*
	 * <p>Title: method1</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.aop.theory.IServiceBean#method1()
	 */
	public void method1() {
		System.out.println("method1");
	}

	/*
	 * <p>Title: method2</p>
	 * <p>Description: </p>
	 * @return
	 * @see com.ender.demo.spring.aop.theory.IServiceBean#method2()
	 */
	public String method2() {
		System.out.println("method2");
		return "xxx";
	}

	/*
	 * <p>Title: method3</p>
	 * <p>Description: </p>
	 * @param str
	 * @see com.ender.demo.spring.aop.theory.IServiceBean#method3(java.lang.String)
	 */
	public void method3(String str) {
		System.out.println("method3  "+str);
	}

}
