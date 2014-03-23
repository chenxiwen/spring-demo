/**
 * @Project: spring-demo Maven Webapp
 * @Title: Test3WaysOfInitBeans.java
 * @Package com.ender.demo.spring.beans.initWays
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-10 下午10:08:05
 * @version V1.0.0
 */
package com.ender.demo.spring.beans.initWays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Test3WaysOfInitBeans
 * @Description: TODO
 * @author ender
 * @date 2014-3-10 下午10:08:05
 *
 */
public class Test3WaysOfInitBeans {

	/**
	
	 * main(这里用一句话描述这个方法的作用)
	 * @author ender
	 * @Title: main
	 * @Description: TODO
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_initBean.xml");
		//使用默认构造方法进行实例化对象的获取
		ServiceBean serviceBean_defaultContructor = ac.getBean("serviceBean1", ServiceBean.class);
		serviceBean_defaultContructor.sayHello();
		
		ServiceBean serviceBean_staticFactory = ac.getBean("serviceBean2",ServiceBean.class);
		serviceBean_staticFactory.sayHello();
		
		ServiceBean serviceBean_factory = ac.getBean("serviceBean3",ServiceBean.class);
		serviceBean_factory.sayHello();
		
		
	}

}
