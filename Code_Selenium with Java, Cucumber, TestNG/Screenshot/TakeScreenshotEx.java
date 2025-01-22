package Screenshot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotEx {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");	// Navigate to URL
		driver.manage().window().maximize();
		
		//casting of TakesScreenshot with driver
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//store the screenshot in variable temporary
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
	//	File destFile = new File("C://Users//Amol//Desktop//SS//sc.png");
		
		//If you made folder saveSS in your Project Folder
		File destFile = new File("./saveSS/sc.png");
		
		//Store screenshot in the Folder
		FileUtils.copyFile(srcFile, destFile);
		
	}
}
