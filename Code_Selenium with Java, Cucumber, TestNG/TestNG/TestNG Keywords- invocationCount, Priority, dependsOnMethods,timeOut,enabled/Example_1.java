package com;

import org.testng.annotations.Test;

public class Example_1 {
	
	@Test(invocationCount = 4)
	public void login()
	{
		//invocationCount
		System.out.println("Test Case 1");
	}

}
