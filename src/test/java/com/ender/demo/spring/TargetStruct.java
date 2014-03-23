/**
 * @Project: spring-demo Maven Webapp
 * @Title: TargetMapStruct.java
 * @Package com.ender.demo.spring.aop
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午8:05:09
 * @version V1.0.0
 */
package com.ender.demo.spring;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: TargetMapStruct
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午8:05:09
 *
 */
public class TargetStruct {
	private static Set<Object> targetSet;
	
	static{
		targetSet = new HashSet<Object>();
		System.out.println("targetSet initialiation...");
	}
	
	private TargetStruct(){
		
	}
	
	public static Set<Object> getInstance(){
			return targetSet;
	}
	
	public synchronized static void addTarget(Object o){
			targetSet.add(o);
			System.out.println(o+" has been added into targetSet");
			System.out.println("total size:"+targetSet.size());
	}
	
	public synchronized static void removeTarget(Object o){
			targetSet.remove(o);
			System.out.println(o+" has been removed from targetSet");
	}
}
