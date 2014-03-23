/**
 * @Project: spring-demo Maven Webapp
 * @Title: TestBeamImpl.java
 * @Package com.ender.demo.spring.aop
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午10:59:37
 * @version V1.0.0
 */
package com.ender.demo.spring.aop;

/**
 * @ClassName: TestBeamImpl
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午10:59:37
 *
 */
public class TestBeanImpl implements ITestBean {

	/*
	 * <p>Title: someMethod</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.aop.ITestBean#someMethod()
	 */
	public void someMethod() {
		// TODO Auto-generated method stub
		System.out.println("some code...");
	}

	/*
	  * <p>Title: callMethod</p>
	  * <p>Description: </p>
	  * @param name
	  * @see com.ender.demo.spring.aop.ITestBean#callMethod(java.lang.String)
	  */
	public void callMethod(String name) {
		// TODO Auto-generated method stub
		System.out.println("input is "+name);
	}

}
