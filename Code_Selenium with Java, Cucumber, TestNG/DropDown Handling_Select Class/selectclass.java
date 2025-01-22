//DropDown Handling
package basicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectclass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// To check that actual title and expected titles are equals or not
		String ExpectedTitle = "Practice Page";
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals(ExpectedTitle))
		{
			System.out.println("title matched : PASS");
		}
		else
		{
			System.out.println("title not matched : Fail");
		}
		
				
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
			
		Select se = new Select(dropdown);
		
		//1) SelectByIndex
		se.selectByIndex(1);		
		Thread.sleep(3000);
		
				
		//2) Select By Value
		se.selectByValue("option2");
	   Thread.sleep(3000);
		
	
		//3) select by visible text		
		se.selectByVisibleText("Option3");
	   Thread.sleep(3000);
		
		
//		WebElement pagename = driver.findElement(By.xpath("//h1[text() = 'Practice Page']"));
//		String s1 = pagename.getText();	
//		System.out.println(s1);
		
		
		WebElement autodropdown = driver.findElement(By.id("autocomplete"));
		autodropdown.sendKeys("in");
		
		Thread.sleep(2000);
		
		//dynamic element
		
		//findElement - only one webElement   NoSuchElementException
		//findElements - Multiple web Element     List      empty list
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class = 'ui-menu-item']"));
		System.out.println(options.size());  //how many elements in your list
		
		for(WebElement option:options)
		{
			String ele = option.getText();   // All text of List
         	System.out.println(ele);
			
			if(ele.equalsIgnoreCase("India"))    // compare text with India
			{
				option.click();  // if condition matches it clicks on India
				break;
			}			
		}		
	}
}
