package Tsrtcproblem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class apstctotalcode {
  private static final int ApsrtcHomePagelinksindex = 0;

public static void main(String[] args) {
	WebDriver driver;
	String ApplicationsUrlApplications="https://www.apsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shiva nnarayana\\\\eclipse-workspace\\\\seleniumPrograms\\\\driverfiles\\\\chromedriver.exe ");
	driver =new ChromeDriver();
	driver.get(ApplicationsUrlApplications);
	
	By linkslocator= By.tagName("a");
	List<WebElement>ApsrtcHomePagelinks=driver.findElements(linkslocator);
	int ApsrtcHomePagelinkscount=ApsrtcHomePagelinks.size();
	System.out.println("the number of links on the ApsrtcApplications homepage are" + "---->" + ApsrtcHomePagelinkscount);
	for(int ApsrtcHomePagelinksindex=0; ApsrtcHomePagelinksindex<ApsrtcHomePagelinkscount;ApsrtcHomePagelinksindex++)
	{
		String ApsrtcHomePagelinksName=ApsrtcHomePagelinks.get(ApsrtcHomePagelinksindex).getText();
		System.out.println(ApsrtcHomePagelinksindex+"----->"+ ApsrtcHomePagelinksName);
		
		
	//By ApsrtcHomePageheaderBlocklocator = By.className("Menu-Wrap");
	//WebElement ApsrtcHomePageheaderBlock=driver.findElement(ApsrtcHomePageheaderBlocklocator);
	//By headerBlocklinkslocator= By.tagName("a");
	//By linkslocator = null;
	//List<WebElement>ApsrtcHomePageHeaderBlocklinks=driver.findElements(linkslocator);
	//int ApsrtcHomePageHeaderBlocklinkscount=ApsrtcHomePageHeaderBlocklinks.size();
	//System.out.println("the number of links on the ApsrtcApplications home page are"+"---->" +ApsrtcHomePageHeaderBlocklinkscount);
	{
		String ApsrtcHomePagelinksNames=ApsrtcHomePagelinks.get(ApsrtcHomePagelinksindex).getText();
		System.out.println("apsrtc homepage links are "+"--->"+ApsrtcHomePagelinksNames);
		
	}
	
		
}

}
}


