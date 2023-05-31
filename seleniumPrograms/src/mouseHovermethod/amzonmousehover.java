package mouseHovermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amzonmousehover {
	public static void main(String[] args) {
		WebDriver driver;
		String applicationsurlAddress="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationsurlAddress);
		By helloSingInlocator=By.id("nav-link-accountlist");
		WebElement helloSignIn=driver.findElement(helloSingInlocator);
		Actions helloSignInAction =new Actions(driver);
		Actions helloSingInAction = null;
		helloSingInAction.moveToElement(helloSignIn).build().perform();
		By yourOrdersLocator = By.linkText("Orders");
		WebElement yourOrders=driver.findElement(yourOrdersLocator);
		yourOrders.click();
				
	}
}

