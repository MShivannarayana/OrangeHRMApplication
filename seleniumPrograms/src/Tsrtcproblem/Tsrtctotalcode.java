package Tsrtcproblem;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtctotalcode {
private static int tsrtcHomePageHeaderBlocklinksnames;

public static void main(String[] args) {
	WebDriver driver;
	String ApplicationsUrlAddress="https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe " );
    driver=new ChromeDriver();
    driver.get(ApplicationsUrlAddress);
    By tsrtcHomePageHeaderBlockLocator=By.className("menu-wrap");
    WebElement tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockLocator); 
    By headerBlocklinksLocator=By.tagName("a");
    List<WebElement>tsrtcHomePageHeaderBlocklinks=tsrtcHomePageHeaderBlock.findElements(headerBlocklinksLocator);
    int tsrtcHomePageHeaderBlocklinkscount=tsrtcHomePageHeaderBlocklinks.size();
    System.out.println("the number of links in the header block of tsrtc application homepage are"+ "-" +tsrtcHomePageHeaderBlocklinkscount);
    
   for (int tsrtchomepageheaderblocklinksindex=0;tsrtchomepageheaderblocklinksindex<tsrtcHomePageHeaderBlocklinkscount;tsrtchomepageheaderblocklinksindex++)
	    {
    	String tsrtcHomePageHeaderBlocklinksname=tsrtcHomePageHeaderBlocklinks.get(tsrtchomepageheaderblocklinksindex).getText();
    	System.out.println(tsrtchomepageheaderblocklinksindex + "--" +tsrtcHomePageHeaderBlocklinksname);
    	tsrtcHomePageHeaderBlocklinks.get(tsrtchomepageheaderblocklinksindex).click();
    	
    	String tsrtcwebpagetitle=driver.getTitle();
    	System.out.println("the title of the current web page is"+tsrtcwebpagetitle);
    	String tsrtcwebpageCurrentUrlAddress=driver.getCurrentUrl();
    	//System.out.println("the Current URL Address of the WebPage is"+tsrtcwebpageCurrentUrlAddress);
    	//driver.navigate().back();
    	
    	
    	 
    	tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockLocator);
    	tsrtcHomePageHeaderBlocklinks=tsrtcHomePageHeaderBlock.findElements(headerBlocklinksLocator);
   
    	
    	
    	
	    }
    
}
}
