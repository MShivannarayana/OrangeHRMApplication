import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplehrm2 {
public static void main(String[] args) {
	WebDriver driver;
	String ApplicationsUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(ApplicationsUrlAddress);
	String expected_orangeHRMApplicatiologinpagetitle="orange HRM";
	System.out.println("the expected title of the orange hrm applications login page is"+"--->"+(expected_orangeHRMApplicatiologinpagetitle));
	String actual_orangeHRMApplicatiologinpagetitle=driver.getTitle();
	System.out.println("the actual title of the orange hrm applications login page is"+"-->"+(actual_orangeHRMApplicatiologinpagetitle));
	
	if(actual_orangeHRMApplicatiologinpagetitle.equals(expected_orangeHRMApplicatiologinpagetitle))
	{
		System.out.println("title of orange hrm application login page is matched PASS");
	}
	else
	{
		System.out.println("the title orange hrm applications login page is not maatched-FAIL");
	}
	
}
}
