/*What is Soft Assert?
Soft assertions are the ones in which the test execution does not stop if the test does not 
meet the assertion condition. The remaining tests are executed.*/
/*
What is Hard Assert?
Hard Assert is a technique used in software testing to check whether a certain condition is true 
or not. In other words, it is a way of verifying that a certain piece of code is working as expected.
When an assert statement is executed, it compares the actual outcome of a test with
the expected outcome. If the two outcomes match, the assert statement passes and
the test continues. If the actual outcome does not match the expected outcome, 
the assert statement fails and the test is halted. 
The remaining tests are skipped and the test is marked as failed.
 */
package com;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class AssertionInTestNG {
	
	@Test
	public void trueAsset()
	{
		String s = "Java";
		String a = "Java";
		Assert.assertEquals(s, a);
		System.out.println("Assert 1 Passed");
		
		Assert.assertTrue(s.equals(a));
		System.out.println("Assert 2 Passed");
				
	}
	
	@Test
	public void falseAsset()
	{
		String s = "Java";
		String a = "Java1";
		Assert.assertNotEquals(s, a);
		System.out.println("Assert 3 Passed");
		
		Assert.assertFalse(s.equals(a));
		System.out.println("Assert 4 Passed");				
	}
	
	@Test
	public void SoftAssert()
	{
		String s = "Java";
		String a = "Java1";
	   SoftAssert soft = new SoftAssert();
	   soft.assertEquals(s, a);
	   System.out.println("Assert 5 is Passed");
		soft.assertAll();
	}
}
