package com.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	 public WebDriver driver;
	String applicationsurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	//String applicationsurladdress="http:\\Amazon.in";
	
	@BeforeTest
	public void setup()
	
	{
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe ");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(applicationsurladdress);
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
