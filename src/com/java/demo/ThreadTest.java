/*
 * Copyright (c) 2015 아시아나IDT
 * 
 * 이 프로그램은 저작권 보호법에 의해 보호됩니다.
 * 이 프로그램의 일부나 전부를 무단으로 복제하거나 배포하는 경우에는
 * 저작권의 침해가 되므로 주의하시기 바랍니다.
 */
package com.java.demo;

/**
 * 이 클래스는...
 *
 * @author yoots
 * Created on 2015. 12. 15.
 */

public class ThreadTest {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread( () -> System.out.println("Hello Thread"));
		thread.start();
		
		try{
			thread.join();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		Runnable r = () -> System.out.println("Hello Runnable");
		
	}

}
