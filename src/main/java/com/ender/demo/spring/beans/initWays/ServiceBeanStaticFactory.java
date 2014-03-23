/**
 * @Project: spring-demo Maven Webapp
 * @Title: ServiceBeanStaticFactoryImpl.java
 * @Package com.ender.demo.spring.beans.initWays
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-10 下午10:14:04
 * @version V1.0.0
 */
package com.ender.demo.spring.beans.initWays;

/**
 * @ClassName: ServiceBeanStaticFactory
 * @Description: TODO
 * @author ender
 * @date 2014-3-10 下午10:14:04
 *
 */
public class ServiceBeanStaticFactory{
	
	//这里只返回一个简单实现对象，实际使用时可能是个单例或者默认的构造方法不方便使用
	public static ServiceBean getServiceBean(){
		return new ServiceBeanImpl();
	}
	
}
