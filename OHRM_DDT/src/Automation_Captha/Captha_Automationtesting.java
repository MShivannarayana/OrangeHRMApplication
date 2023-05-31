package Automation_Captha;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captha_Automationtesting {
private static final long Duration = 0;

public static void main(String[] args)  throws InterruptedException{
	System.setProperty("webdriver.chromedriver","./driverfiles/chromedriver.exe ");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration,ofSeconds(20));
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	driver.findElement(By.id("Form_getForm_subdomain")).sendKeys("ShivaNarayana234");
	driver.findElement(By.id("Form_getForm_Name")).sendKeys("Admin");
	driver.findElement(By.id("Form_getForm_Contact")).sendKeys("Shiva@143");
	driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
	Thread.sleep(5000);
	driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.findElement(By.id("Form_getForm_action_submitForm")).click();
}

private static TimeUnit ofSeconds(int i) {
	// TODO Auto-generated method stub
	return null;
}

}

