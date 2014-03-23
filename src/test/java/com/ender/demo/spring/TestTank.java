/**
 * @Project: spring-demo Maven Webapp
 * @Title: TestTank.java
 * @Package ender.com.demo.spring
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午8:51:11
 * @version V1.0.0
 */
package com.ender.demo.spring;


/**
 * @ClassName: TestTank
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午8:51:11
 *
 */
public class TestTank {

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
		Thread tank1 = new Thread(new Tank());
		Thread tank2 = new Thread(new Tank());
		tank1.start();
		tank2.start();
	}

}
