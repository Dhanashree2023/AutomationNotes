package com;

import org.testng.annotations.Test;

public class Example_2 {
	
	@Test(priority = -3)
	public void login()
	{
		System.out.println("login");
	}
	
	//If priority are same it check method name in Alphabetic order
	@Test(priority = 2)
	public void signup()
	{
		System.out.println("signup");
	}
	
	@Test(priority = 2)
	public void AddtoCart()
	{
		System.out.println("AddtoCart");
	}
	
	@Test(priority = -4)
	public void logout()
	{
		System.out.println("logout");
	}
	
	@Test(timeOut = 1000)
	public void testcase10() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Test Case 10");
	}
	
	@Test 
	public void searchProduct()    // by default priority = 0
	{
		System.out.println("search product");
	}
	
	//Test Case Skip
	@Test(enabled = false)
	public void BuyNow()
	{
		System.out.println("Buy Now");
	}
	
}
