import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ornagehrm {
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress=" https://www.facebook.com/";
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	String expected_facebookhomePageTitle="Facebook-login or sign up";
	System.out.println("the expected Title of the facebook Home Page is:-"+ expected_facebookhomePageTitle);
	String actual_facebookhomePageTitle=driver.getTitle();
	System.out.println("the actual Title of the facebook Home Page is:-"+actual_facebookhomePageTitle);
	if(actual_facebookhomePageTitle.equals(expected_facebookhomePageTitle))
	{
		System.out.println("Facebook home Page title matched -PASS");
	}
	else
	{
		System.out.println("Facebook home Page title NOT matched -FAIL");
	}
	//validating Url adress home page
}
}
