package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	@Test(dataProvider = "loginData")
	public void TestLogin(String userName, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Time at Work']")).isDisplayed());
		Thread.sleep(5000);
		driver.quit();
	}
	
	@DataProvider
	public Object[][] loginData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "Admin";
		data[1][1] = "test123";
		
		return data;
	}

}
