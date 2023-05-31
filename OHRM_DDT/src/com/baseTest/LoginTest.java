package com.baseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	@Test
	public void logInPageValidationTest() throws IOException
	
	{
		FileInputStream propertiesFile=new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");
		driver=new ChromeDriver();

		Properties propertiesfileProperty=new Properties();
		propertiesfileProperty.load(propertiesFile);
		
		By logInPageLoginPaneelTextLocator=By.id(propertiesfileProperty.getProperty("orangeHRMApplicationLoginPageLogInPanelProperty"));
		WebElement logInPageLogInPanel=driver.findElement(logInPageLoginPaneelTextLocator);
		String actual_LogInPageLogInPanelText=logInPageLogInPanel.getText();
		System.out.println("LogInPage Text is"+actual_LogInPageLogInPanelText);
	}
	
}