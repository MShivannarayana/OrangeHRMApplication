package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ornge_hrm {
	
	
	
	
	
	
	//	private static ChromeDriver driver;

	private static final String OrangeHRMHomePage = null;
	private static ChromeDriver WebDriver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver1=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");


		driver.findElement(By.name("txtPassword")).sendKeys("Shiva@143");

		

		driver.findElement(By.className("button")).click();
	}
}

		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	






