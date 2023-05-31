package TestNG_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wevbsite_AumaticfillName {
	
	

	WebDriver driver;
	String applicationUrlAddress="https://www.rediff.com/";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
	}
	
	/*@AfterTest
	public void tearDown()
	{
		driver.close();
	}*/
	
	@Test
	public void createAccount() throws InterruptedException
	{
	 By createAccountLocator=By.linkText("Create Account");
	 WebElement createAccount=driver.findElement(createAccountLocator);
	 createAccount.click();			
	 
	 By fullNameLocator=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input");
	 WebElement fullName=driver.findElement(fullNameLocator);
	 fullName.sendKeys("Shiva Acharya");
}
}