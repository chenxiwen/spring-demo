/**
 * @Project: spring-demo Maven Webapp
 * @Title: TestDependencyInjection.java
 * @Package ender.com.demo.spring
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午2:53:18
 * @version V1.0.0
 */
package com.ender.demo.spring;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ender.demo.spring.beans.IDependencyInjectionConstructor;
import com.ender.demo.spring.beans.IDependencyInjectionConstructorVariant;
import com.ender.demo.spring.beans.IDependencyInjectionSetter;

/**
 * @ClassName: TestDependencyInjection
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午2:53:18
 *
 */
public class TestDependencyInjection {
	private static ApplicationContext ac;
	@BeforeClass
	public static void beforeClass(){
		if(ac == null){
			ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
	}
	
	@Test
	public void testSetterInjection(){
		IDependencyInjectionSetter dis = ac.getBean("dependencyInjectionSetter",IDependencyInjectionSetter.class);
		dis.callMethodFromAnotherBean();
	}
	
	@Test
	public void testConstructorInjection(){
		IDependencyInjectionConstructor dic = ac.getBean("dependencyInjectionConstructor", IDependencyInjectionConstructor.class);
		dic.callMethodFromAnotherBean();
	}
	
	@Test
	public void testSingleton(){
		try{
			IDependencyInjectionConstructor dis1 = ac.getBean("dependencyInjectionConstructor",IDependencyInjectionConstructor.class);
			IDependencyInjectionConstructor dis2 = ac.getBean("dependencyInjectionConstructor",IDependencyInjectionConstructor.class);
			System.out.println(dis1==dis2);
			IDependencyInjectionConstructorVariant dicv1 = ac.getBean("dependencyInjectionConstructorVariant",IDependencyInjectionConstructorVariant.class);
			IDependencyInjectionConstructorVariant dicv2 = ac.getBean("dependencyInjectionConstructorVariant",IDependencyInjectionConstructorVariant.class);
			System.out.println(dicv1==dicv2);
			Tank tank1 = ac.getBean("tank", Tank.class);
			Tank tank2 = ac.getBean("tank", Tank.class);
			System.out.println(tank1+"\n"+tank2);
			System.out.println(tank1==tank2);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testConstractorInjectionVariant(){
		IDependencyInjectionConstructorVariant dicv = ac.getBean("dependencyInjectionConstructorVariant",IDependencyInjectionConstructorVariant.class);
		dicv.callMethodFromAnotherBean();
	}
	
	
	
}
