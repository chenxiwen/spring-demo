/**
 * @Project: spring-demo Maven Webapp
 * @Title: TestEnderProxyFactory.java
 * @Package com.ender.demo.spring.aop.theory
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 上午11:52:30
 * @version V1.0.0
 */
package com.ender.demo.spring.aop.theory;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: TestEnderProxyFactory
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 上午11:52:30
 *
 */
public class TestEnderProxyFactory {

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
		// TODO Auto-generated method stub
		User user = new User();
		user.setNickName("ender");
		user.setUsername("chenxiwen");
		user.setPassword("123456");
		Set<String> roleSet = new HashSet<String>();
		roleSet.add("admin");
		roleSet.add("dba");
		roleSet.add("network");
		user.setRoleSet(roleSet);
		
		JDKProxyFactory epf = new JDKProxyFactory();
		epf.setUser(user);
		IServiceBean serviceBean = (IServiceBean)epf.getProxyInstance(new ServiceBeanImpl());
		serviceBean.method1();
		serviceBean.method2();
		serviceBean.method3("helloWorld");
		
	}

}
