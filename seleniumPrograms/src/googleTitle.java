

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class googleTitle {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://frontlinesmedia.in/");
	driver.get("https://www.naukri.com/mnjuser/homepage");

	
}
}
