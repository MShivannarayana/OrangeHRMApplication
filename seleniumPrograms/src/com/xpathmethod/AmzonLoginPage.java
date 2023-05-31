package com.xpathmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmzonLoginPage {
	WebDriver driver;
	String applicationurlAddress="http://amazon.in";
	@BeforeTest
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver","./chromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationurlAddress);
	}
	/*
	 * @AfterTest
	 * public void tearDown()
	 * {
	 * driver.quit();
	 * }
	 */
	@Test
	public void customerServiceTest()
	{
		/*
		 * xpath using contains:
		 * 1.//tagname[contains(text(),'partialtextvalue')]
		 */
		// //a[contains(text();'Customer')]
		By customerServiceLocator=By.xpath("//a[contains(text();'Customer']");
		WebElement customerService=driver.findElement(customerServiceLocator);
		customerService.click();
	 }
	

}
