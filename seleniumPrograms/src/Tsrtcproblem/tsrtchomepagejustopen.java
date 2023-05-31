package Tsrtcproblem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tsrtchomepagejustopen {

	public static void main(String[] args) {
	
		
		WebDriver driver;
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ApplicationUrlAddress);

		By LinksLocator=By.tagName("a");
		List<WebElement>tsrtcHomePagelinks=driver.findElements(LinksLocator);
		int tsrtcHomePagelinksCount=tsrtcHomePagelinks.size();
		System.out.println(tsrtcHomePagelinksCount);
		driver.quit();

	
	}
	
	
	
	
}
