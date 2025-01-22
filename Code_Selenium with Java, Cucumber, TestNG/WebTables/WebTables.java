//Web Tables
package basicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://testautomationpractice.blogspot.com/");	// Navigate to URL
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1400)", "");
		
		
		//Find the rows in the tables
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name = 'BookTable']/tbody/tr"));
		System.out.println("Total Rows in the table="+rows.size());
		
		//Find the total columns
		List<WebElement> column = driver.findElements(By.xpath("//table[@name = 'BookTable']/tbody/tr[2]/td"));
		System.out.println("Total Rows in the table="+column.size());
		
		String data = driver.findElement(By.xpath("//table[@name = 'BookTable']/tbody/tr[2]/td[2]")).getText();
		System.out.println(data);
		
		//Print All Records
		for(int i=2; i <= rows.size(); i++)   //rows
		{
			  for(int c=1; c<=column.size();c++)  // columns
			  {
				  String data1 = driver.findElement(By.xpath("//table[@name = 'BookTable']/tbody/tr[" + i + "]/td[" + c + "]")).getText();				  
				  System.out.println(data1);		
			  }
		}			
	}
}
