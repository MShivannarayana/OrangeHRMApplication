package homeworkfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_get_title {

	public static void main(String[] args) {
		ChromeDriver driver;
		String applicationUrlAddress="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		String  expected_FacebookHomePageTitle ="Facebook - login in or sign up";
		//facebookHomePageTitle=driver.getTitle();
		System.out.println("the expected Title of the Facebook home page is:-"+ expected_FacebookHomePageTitle);
	
		String actual_FacebookHomePageTitle =driver.getTitle();
		System.out.println("the actual title of the Facebook home page is"+actual_FacebookHomePageTitle);
		
		if(actual_FacebookHomePageTitle.equals(expected_FacebookHomePageTitle))

			System.out.println("the actual result matches thede expected result");
		else
		
			System.out.println("the actual result matches thede expected result");
		String expected_FacebookHomePageUrlAddress="facebook.com";
		System.out.println("The Expected Url adress of facebook homePage is"+expected_FacebookHomePageUrlAddress);
		String actual_FacebookHomePageUrlAddress=driver.getCurrentUrl();
		System.out.println("The actual Url adress of facebook homePage is"+actual_FacebookHomePageUrlAddress);
		if(actual_FacebookHomePageUrlAddress.contains(expected_FacebookHomePageUrlAddress)) 
		{
			System.out.println("Successfully navigated to facebookHpme page_Url Address matched-PASS");
		}
		else
		{
			System.out.println("Successfully navigated to facebookHpme page_Url Not Address matched-Fail");
		}
		driver.quit();
		
		
		}
			
	}

