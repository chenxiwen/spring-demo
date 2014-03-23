/**
 * @Project: spring-demo Maven Webapp
 * @Title: Moveable.java
 * @Package com.ender.demo.spring.aop
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午7:09:29
 * @version V1.0.0
 */
package com.ender.demo.spring;

/**
 * @ClassName: Moveable
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午7:09:29
 *
 */
public interface Moveable {
	
	public void forward();
	
	public void backward();
	
	public void leftward();
	
	public void rightward();
	
	public void stop();
}
