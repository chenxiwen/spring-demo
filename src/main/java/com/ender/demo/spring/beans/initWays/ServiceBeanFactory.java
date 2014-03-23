/**
 * @Project: spring-demo Maven Webapp
 * @Title: ServiceBeanFactory.java
 * @Package com.ender.demo.spring.beans.initWays
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-10 下午10:25:25
 * @version V1.0.0
 */
package com.ender.demo.spring.beans.initWays;

/**
 * @ClassName: ServiceBeanFactory
 * @Description: TODO
 * @author ender
 * @date 2014-3-10 下午10:25:25
 *
 */
public class ServiceBeanFactory {
	
	//非static声明
	public ServiceBean getServiceBean(){
		return new ServiceBeanImpl();
	}
}
