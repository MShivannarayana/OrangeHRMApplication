package com.RadioButton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Test_problem {
public WebDriver driver;
String applicationsurladdress="https://echoecho.com/index.html";
public void setup()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationsurladdress);
		
	}
	public void teardown()
	{
		driver.quit();
	}

}

