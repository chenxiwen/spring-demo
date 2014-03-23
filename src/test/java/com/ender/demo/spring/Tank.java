/**
 * @Project: spring-demo Maven Webapp
 * @Title: Tank.java
 * @Package com.ender.demo.spring.aop
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-1 下午7:13:04
 * @version V1.0.0
 */
package com.ender.demo.spring;

import java.util.Random;
import java.util.Set;

/**
 * @ClassName: Tank
 * @Description: TODO
 * @author ender
 * @date 2014-3-1 下午7:13:04
 *
 */
public class Tank implements Weapon, Moveable, Runnable {
	private Set<Object> targetSet; 

	private Object target;
	
	private int health;
	
	/**
	 * @return the targetSet
	 */
	public Set<Object> getTargetSet() {
		return targetSet;
	}

	/**
	 * @param targetSet the targetSet to set
	 */
	public void setTargetSet(Set<Object> targetSet) {
		this.targetSet = targetSet;
	}

	
	/**
	 * @return the target
	 */
	public Object getTarget() {
		return target;
	}

	/**
	 * @param target the target to set
	 */
	public void setTarget(Object target) {
		this.target = target;
	}
	

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/*
	 * <p>Title: forward</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.aop.Moveable#forward()
	 */
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().toString()+" moved forward...");
	}

	/*
	 * <p>Title: backward</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.aop.Moveable#backward()
	 */
	public void backward() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().toString()+" moved backward...");
	}

	/*
	 * <p>Title: leftward</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.aop.Moveable#leftward()
	 */
	public void leftward() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().toString()+" moved leftward...");
	}

	/*
	 * <p>Title: rightward</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.aop.Moveable#rightward()
	 */
	public void rightward() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().toString()+" moved rightward...");
	}
	

	/*
	  * <p>Title: stop</p>
	  * <p>Description: </p>
	  * @see com.ender.demo.spring.aop.Moveable#stop()
	  */
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().toString()+ "stop...");
	}

	/*
	 * <p>Title: targetAt</p>
	 * <p>Description: </p>
	 * @param o
	 * @see com.ender.demo.spring.aop.Weapon#targetAt(java.lang.Object)
	 */
	public void aimAt(Object o) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().toString()+" aim at "+o);
	}

	/*
	 * <p>Title: atteck</p>
	 * <p>Description: </p>
	 * @see com.ender.demo.spring.aop.Weapon#atteck()
	 */
	public void atteck(Object o) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().toString()+" fire a missile...at "+o);
		if(o instanceof Tank){
			((Tank) o).damage();
		}
	}

	/*
	  * <p>Title: run</p>
	  * <p>Description: </p>
	  * @see java.lang.Runnable#run()
	  */
	public void run() {
		// TODO Auto-generated method stub
		try {
			TargetStruct.addTarget(this);
			Thread.sleep(1000);
			System.out.println("a tank join, total:"+TargetStruct.getInstance().size());
			go();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void go() throws InterruptedException{
		Thread.sleep(500);
		targetSet = TargetStruct.getInstance();
		if(isWin(targetSet)){
			System.out.println("win...");
			return;
		}
		Random random = new Random();
		int direct = random.nextInt();
		switch(direct%6){
			case 0:{ //aimAt
				if(target == null){
					target = getOneTarget(targetSet);
					aimAt(target);
					break;
				}else{
					go();
				}
			}
			case 1:{// fire
				if(target == null){
					go();
				}else{
					atteck(target);
					break;
				}
			}
			case 2:{//forward
				forward();
				break;
			}
			case 3:{//backward
				backward();
				break;
			}
			case 4:{//leftward
				leftward();
				break;
			}
			case 5:{//rightward
				rightward();
				break;
			}
			//default:go();
		}
		go();
	}
	
	public void damage(){
		int h = getHealth();
		h--;
		this.setHealth(h);
		if(!isAlive()){
			TargetStruct.removeTarget(this);
			System.out.println(this.getClass().toString()+"---->dead");
			return;
		}
	}
	
	private boolean isAlive(){
		return this.getHealth()>0?true:false;
	}
	
	private boolean isWin(Set<Object> targetSet){
		Set<Object> targets = targetSet;
		System.out.println("isWin before remove targets size:"+targetSet.size());
		targets.remove(this);
		System.out.println(this.getClass().toString()+" isWin--targets.size:"+targets.size());
		if(targets.size()==0){
			return true;
		}else{
			return false;
		}
	}
	
	private Object getOneTarget(Set<Object> targetSet){
		Set<Object> targets = targetSet;
		System.out.println("getOneTarget before remove targets size:"+targetSet.size());
		targets.remove(this);
		System.out.println("getOneTarget after remove targets size:"+targetSet.size());
		for(Object o:targets){
			if(Math.random()>0.5){
				return o;
			}
		}
		return targets.toArray()[0];
	}
	
}
