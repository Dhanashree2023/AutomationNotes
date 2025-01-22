package com;

import org.testng.annotations.Test;

public class Example_3 {
	
	@Test
	public void login()
	{
		System.out.println("Login test case");
		int i = 10/0;
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		System.out.println("logout");
	}

}
