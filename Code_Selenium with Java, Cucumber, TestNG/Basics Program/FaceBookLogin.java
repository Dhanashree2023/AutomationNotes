//Locators - cssSelector
//WebDriver Interface Methods
//Xpaths
package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.facebook.com/");	// Navigate to URL
		
		String title = driver.getTitle();  //get the Title of Web Page
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		//css Selector  
		//1) tagName & ID		
//		WebElement userName = driver.findElement(By.cssSelector("input#email"));
//		userName.sendKeys("4364354");
		
		// 2) tagName & className
		// input.inputtext
//		WebElement userName = driver.findElement(By.cssSelector("input.inputtext"));
//		userName.sendKeys("4364354");
//		
		//3) Tag and Attribute	             css=tag[attribute=value]
		WebElement userName = driver.findElement(By.cssSelector("input[name = email]"));
		userName.sendKeys("4364354");
		
		//4)Tag, Class, and Attribute
		// css=tag.class[attribute=value]		
		WebElement pass = driver.findElement(By.cssSelector("	input.inputtext[name = pass]"));
		pass.sendKeys("4364354");
		
//		//contains - by attribute (use when attribute value changes dynamically)
//		  WebElement userName = driver.findElement(By.xpath("//input[contains(@id,'email')]")); 
//			userName.sendKeys("dhnpatil01@gmail.com");
//			
//			//2) Locating By Using Name
//			WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
//	    	password.sendKeys("secret_sauce");
//	    	 	
//	    	// text() Function    [Fixed Text ] 
//	    	WebElement login = driver.findElement(By.xpath("//button[text() = 'Log in']"));
//	    	login.click();
//	    	   	
//	    	//contains with Text [ if text value changes dynamically ] 
//	    	WebElement Forgetpass = driver.findElement(By.xpath("//span[contains(text(),'Forgotten')]"));
//	    	Forgetpass.click();
//	    	    	
//	    	//how to getText() 	
//	    	String s1 = Forgetpass.getText();
//	    	System.out.println(s1);    
	}

}
