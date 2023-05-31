package Tsrtcproblem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class apstclinks7open {
private static final By ApsrtcHomePageHeaderBlockLocator = null;
private static List<WebElement> ApsrtcHomePageHeaderBlocklinks = null;

public static void main(String[] args) {
	
	WebDriver driver;
	String ApplicationsUrlAddress="https://www.apsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe " );
    driver=new ChromeDriver();
    driver.get(ApplicationsUrlAddress);
    By apsrtcHomePageHeaderBlockLocator=By.className("menu-wrap");
    WebElement apsrtcHomePageHeaderBlock=driver.findElement(apsrtcHomePageHeaderBlockLocator);
    By headerBlocklinksLocator=By.tagName("a");
    List<WebElement>apsrtcHomePageHeaderBlocklinks=apsrtcHomePageHeaderBlock.findElements(headerBlocklinksLocator);
    int apsrtcHomePageHeaderBlocklinkscount=apsrtcHomePageHeaderBlocklinks.size();
    System.out.println("the number of links in the header block of tsrtc application homepage are"+ "-" +apsrtcHomePageHeaderBlocklinkscount);
    
   for (int apsrtchomepageheaderblocklinksindex=0;apsrtchomepageheaderblocklinksindex<apsrtcHomePageHeaderBlocklinkscount;apsrtchomepageheaderblocklinksindex++)
	    {
    	String apsrtcHomePageHeaderBlocklinksname=apsrtcHomePageHeaderBlocklinks.get(apsrtchomepageheaderblocklinksindex).getText();
    	System.out.println(apsrtchomepageheaderblocklinksindex + "--" +apsrtcHomePageHeaderBlocklinksname);
    	apsrtcHomePageHeaderBlocklinks.get(apsrtchomepageheaderblocklinksindex).click();
    	
    	String apsrtcwebpagetitle=driver.getTitle();
    	System.out.println("the title of the current web page is"+ apsrtcwebpagetitle);
    	String apsrtcwebpageCurrentUrlAddress=driver.getCurrentUrl();
    	//System.out.println("the Current URL Address of the WebPage is"+apsrtcwebpageCurrentUrlAddress);
    	//driver.navigate().back();
    	 
    	apsrtcHomePageHeaderBlock=driver.findElement(apsrtcHomePageHeaderBlockLocator);
    	apsrtcHomePageHeaderBlocklinks=apsrtcHomePageHeaderBlock.findElements(headerBlocklinksLocator);
   
    	
    	
    	
	    }
    
}
}

