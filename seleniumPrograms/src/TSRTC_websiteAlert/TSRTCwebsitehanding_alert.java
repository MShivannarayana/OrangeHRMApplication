package TSRTC_websiteAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSRTCwebsitehanding_alert {
	WebDriver driver;
	String applicationsurladdress="https://www.tsrtconline.in/oprs-web/";
	@BeforeTest
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationsurladdress);
	driver.manage().window().maximize();
	}
	/*@AfterTest
	
	public void tearDown()
	{
		driver.quit();
		
	}*/
	
	@Test(priority=1,description="getting the alert window message")
	public void handingAlert() throws InterruptedException 
	{
		By checkAvalibitylocator=By.id("searchBtn");
		WebElement checkAvalibity=driver.findElement(checkAvalibitylocator);
		checkAvalibity.click();
		Alert tsrtcAlertWindow=driver.switchTo().alert();
		String tsrtcAlertMessage=tsrtcAlertWindow.getText();
		System.out.println("the message of the alert window is"+tsrtcAlertMessage);
		//Thread.sleep(10000);
		
	}
	
	

}
