package groups;

import org.testng.annotations.Test;

public class ExampleG2 {
	
	@Test
	public void testCase1()
	{
		System.out.println("test Case1 is running from Example1");
		//Assert.fail();
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("test Case2 is running from Example1");
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("test Case3 is running from Example1");
		int i = 100/0;
	}


}
