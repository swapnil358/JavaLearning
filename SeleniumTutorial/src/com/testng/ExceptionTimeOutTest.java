package com.testng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	
	/*
	 * @Test(invocationTimeOut=2, expectedExceptions=NumberFormatException.class)
	 * public void infinitLoopTest() { int i = 1; while(i==1) {
	 * System.out.println(i); } }
	 */
	
	
	//Interview Question - How to catch exception in testNG
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x = "10x";
		Integer.parseInt(x);
	}
}
