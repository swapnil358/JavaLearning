package com.testng;

import org.testng.annotations.Test;

public class InvocationCountTest {

	// How many times you want to execute test case

	@Test(invocationCount = 10)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;

		System.out.println("sum is ----" + c);
	}
	
	@Test
	public void sum1() {
		System.out.println("sum1");
	}
		

}
