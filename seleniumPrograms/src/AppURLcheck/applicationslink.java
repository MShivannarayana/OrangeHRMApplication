package AppURLcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class applicationslink {
	public static void main(String[] args) {
		WebDriver driver;
		String applicatuinsUrlAddress="https://www.google.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(applicatuinsUrlAddress);
		driver.findElement(By.linkText("sign in")).click();
		
		By singInlocator=By.linkText("sign in");
		WebElement signIn=driver.findElement(singInlocator);
		signIn.click();
		driver.quit();
		By singInlocator1 =By.linkText("signin");
		WebElement signin=driver.findElement(singInlocator1);
		String Signintext =signin.getText();
		System.out.println("the text of the webelemnt sign in on google homepage is"+Signintext);
		signin.click();
		driver.quit();
		By SigninLocator =By.partialLinkText("signin");
		WebElement WebElement = driver.findElement(SigninLocator);
		signin.click();
		driver.quit();
		
	}

}


