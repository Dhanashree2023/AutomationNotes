//capture screenshot with date and time
package Interview_Practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SS_Date {

	public static void main(String[] args) throws IOException {
		
		Date currentdate = new Date();
		String screenshotname = currentdate.toString().replace(" ", "-").replace(":","-");
		System.out.println(currentdate);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();			
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".//SS_With_DT//"+screenshotname  +".png"));	
	}

}
