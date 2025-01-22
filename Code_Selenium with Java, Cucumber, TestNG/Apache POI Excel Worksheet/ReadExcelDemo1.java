package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcelDemo1 {
	public static void main(String[] args) throws IOException, InterruptedException {
			FileInputStream fs = new FileInputStream("./ExcelData/Excel_Data.xlsx");   
	
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sheet1 = wb.getSheetAt(0);	
			
			//get row count
			int totalRows = sheet1.getLastRowNum() + 1;
			System.out.println(totalRows);
				
			for(int currentRow = 1; currentRow<totalRows ; currentRow++)
			{
					WebDriverManager.chromedriver().setup();				
					WebDriver driver = new ChromeDriver();  //Opened Empty browser
					driver.get("https://www.saucedemo.com/");	// Navigate to URL
					
					driver.manage().window().maximize();
					
					//1) Locating By Using ID
				    WebElement userName = driver.findElement(By.xpath("(//input[@class ='input_error form_input'])[1]")); 
					userName.sendKeys(sheet1.getRow(currentRow).getCell(0).toString());
					
					//2) Locating By Using Name
					WebElement password = driver.findElement(By.xpath("//input[@type ='password']"));
			    	password.sendKeys(sheet1.getRow(currentRow).getCell(1).toString());
			    
			    	Thread.sleep(2000);
			    	
			    	//3) className   	
			    	WebElement login = driver.findElement(By.className("submit-button"));
			    	login.click();
			    	Thread.sleep(2000);
			}
			
			System.out.println("----------------------------------------------------");
						
	}

}
