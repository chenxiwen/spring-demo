/**
 * @Project: spring-demo Maven Webapp
 * @Title: LogInterceptorAnnotation.java
 * @Package com.ender.demo.spring.aop
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 下午4:17:21
 * @version V1.0.0
 */
package com.ender.demo.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @ClassName: LogInterceptorAnnotation
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 下午4:17:21
 *
 */
@Aspect   //声明是一个切面
public class LogInterceptorAnnotation {
	
	@Pointcut("execution (* com.ender.demo.spring.aop.TestBeanImpl.*(..))") 	  //定义一个切入点
	private void anyMethod(){
		
	}
	
	@Before("anyMethod()")
	public void beforeExecute(){
		System.out.println("beforeExecute...");
	}
}
