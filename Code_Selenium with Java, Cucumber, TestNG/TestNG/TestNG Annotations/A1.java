//TestNG Annotation
package Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A1 {
	
	
	@BeforeClass
	public void openbrowser()
	{
		System.out.println("Open browser");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
	
	@BeforeMethod
	public void LoginToApplication()
	{
		System.out.println("Login Code");
	}
	
	@AfterMethod
	public void LogouttheApplication()
	{
		System.out.println("Logout code");
	}

	@Test
	public void verifyusername()
	{
		System.out.println("Actual test case 1");
	}
	
	@Test
	public void verifyusername1()
	{
		System.out.println("Actual test case 2");
	}
	
	@Test
	public void verifyusername2()
	{
		System.out.println("Actual test case 3");
	}
	
	

}
