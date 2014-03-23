/**
 * @Project: spring-demo Maven Webapp
 * @Title: LogInterceptor.java
 * @Package com.ender.demo.spring.aop
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午11:00:20
 * @version V1.0.0
 */
package com.ender.demo.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ClassName: LogInterceptor
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午11:00:20
 *
 */
public class LogInterceptor {
	
	public void before(JoinPoint jp){
		System.out.println("before method -- "+jp.getTarget().getClass().getName()+"."+jp.getSignature().getName());
	}
	
	public void after(JoinPoint jp){
		System.out.println("after method -- "+jp.getTarget().getClass().getName()+"."+jp.getSignature().getName());
	}
	
	public void doThrowing(JoinPoint jp, Throwable ex) {  
        System.out.println("method " + jp.getTarget().getClass().getName()  
                + "." + jp.getSignature().getName() + " throw exception");  
        System.out.println(ex.getMessage());  
    } 
	
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		long t1 = System.currentTimeMillis();
		Object obj = pjp.proceed();
		long time = System.currentTimeMillis()-t1;
		System.out.println("process time :"+time+"ms");
	}
}
