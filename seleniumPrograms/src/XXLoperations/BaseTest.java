package XXLoperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}


}
