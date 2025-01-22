package practice;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class brokenlink {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");	
		
		List <WebElement> linkList = driver.findElements(By.tagName("a")); //Collect all the links in the web page based on <a> tag.
		System.out.println("Total links on page ="+linkList.size());
		int resCode = 200; //2xx Responce code is valid
		int brokenLinkCnt = 0;
		
		for(WebElement element : linkList)
		{
			String url = element.getAttribute("href");
			
			try {
				URL urlLink = new URL(url);
				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				resCode = huc.getResponseCode();
				
				if(resCode >= 400)   //4xx and 5xx series are broken link
				{
					System.out.println(url +"   : broken Link" );
					brokenLinkCnt++;
				}
			}
			catch(MalformedURLException e)
			{		}
			catch(Exception e)
			{	}		
		}	
		System.out.println("Total Broken Link =" +brokenLinkCnt );		
	}
}
