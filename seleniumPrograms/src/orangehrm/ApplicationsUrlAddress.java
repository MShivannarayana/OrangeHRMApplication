package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationsUrlAddress {
	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe ");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(applicationUrlAddress);
		driver.quit();
		
		
		String excepetd_OrangeHRMApplicationloginPageTitle="OrangeHRM";
		System.out.println("the Expected title of the orangeHRMApplicatiologinpageis"+"excepetd_OrangeHRMApplicationloginPageTitle");
	
		String actual_OrangeHRMApplicationloginPageTitle="OrangeHRM";
		System.out.println("the actual title of the orangeHRMApplicatiologinpageis"+"actual_OrangeHRMApplicationloginPageTitle");
		
		if(actual_OrangeHRMApplicationloginPageTitle.equals(excepetd_OrangeHRMApplicationloginPageTitle))
		{
			System.out.println("Title of OrangeHRMApplicationloginPage matched- PASS ");
		}
		else
		{
			System.out.println(" Title of OrangeHRMApplicationloginPage is not matched - FAIL");
		}
		
		System.out.println("############validate urlorangeadress ###########################");
		String expected_OrangeHRMApplicationloginPageUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.out.println("the ExpectedURLAdress of the OrangeHRMApplicationloginpage is"+expected_OrangeHRMApplicationloginPageUrlAdress);
		
		
		System.out.println("the actual urladdressurladdressoftheOrangeHRMApplicationsloginpage"+"--"+actual_OrangeHRMApplicationloginPageTitle);
		
		
		
	}

}
