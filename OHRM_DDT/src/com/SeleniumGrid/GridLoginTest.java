package com.SeleniumGrid;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridLoginTest {
	@Parameters("Browser")
	@Test
	public void login(String browserName)throws InterruptedException,IOException
	{
		System.out.println("The Browser Name is:"+browserName);
		DesiredCapabilities cap=null;
		if(browserName.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browserName.equals("firefox"))
				
			{
				cap=DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
			}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.6.1:4444/wd/hub"),cap);
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(ApplicationUrlAddress);
		//validating title of OrangeHRM Application Login Page
		String expected_OrangeHRMApplicationLoginPageTitle="OrangeHRM";
		System.out.println("The Expected title of the OrangeHRM Application Login Page"+expected_OrangeHRMApplicationLoginPageTitle);
		
		String Actual_OrangeHRMApplicationLoginPageTitle=driver.getTitle();
		System.out.println("the actual title of the OrangeHRM Application Login Page"+Actual_OrangeHRMApplicationLoginPageTitle);
		
		if
		(Actual_OrangeHRMApplicationLoginPageTitle.equals(expected_OrangeHRMApplicationLoginPageTitle))
		{
		System.out.println("Title of OrangeHRM Application LogIn Page Matched:-+PASSED");
		}
		else
			
		{
			System.out.println("Title of OrangeHRM Application LogIn Page NOt Matched:-+FAIlED");
		}
		driver.close();
	}
}
	

