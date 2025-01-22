//Grouping of TestNG
package Examples;

import org.testng.annotations.Test;

public class Ex2 {
	
	
	@Test(groups = "Login")
	public void loginwithvalidCred()
	{
		System.out.println("loginwithvalidCred");
	}
	
	@Test(groups = "Login")
	public void loginwithInvalidCred()
	{
		System.out.println("loginwithInvalidCred");
	}
	
	@Test(groups = "Login")
	public void loginwithEmptyCred()
	{
		System.out.println("loginwithEmptyCred");
	}
	
	@Test(groups = "Logout")
	public void LogoutwhenuserIsnotloggedin()
	{
		System.out.println("LogoutwhenuserIsnotloggedin1");
	}
	
	@Test(groups = "Logout")
	public void LogoutwhenuserIsloggedin()
	{
		System.out.println("LogoutwhenuserIsloggedin2");
	}
	
	
	

}
