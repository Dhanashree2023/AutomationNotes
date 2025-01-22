package com;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void testcase1()
	{
		//console+report
		Reporter.log("Test case 1", true);
	}
	
	@Test
	public void testcase2()
	{
		//report
		Reporter.log("Test case 2", false);
	}
}
