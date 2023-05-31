package com.xpathmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RediffMail {
	WebDriver driver;
	String ApplicationURLAddress="http;//register.rediff.com/register.php?FormName=user_details";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty(" webdriver.chrome.driver","/driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ApplicationURLAddress);
		
	}
	@Test

	public void rediffMailTest()
	{
	
	By fullNameLocator=By.xpath("//*[starts-with(@name,'name')]");
	WebElement fullName=driver.findElement(fullNameLocator);
	fullName.sendKeys("Testing");
}
}

