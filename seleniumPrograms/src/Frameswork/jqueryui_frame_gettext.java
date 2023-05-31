package Frameswork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryui_frame_gettext {
	WebDriver driver;
	String applicationurladdress="https://jqueryui.com/droppable/";
	public void applicationlaunch()
	{
		System.setProperty("webdriver.chrome.driver","./seleniumPrograms/driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void FramesgetText()
	{
	By webpageframelocator	=By.className("demo-Frame");
	WebElement webpageframe=driver.findElement(webpageframelocator);
	driver.switchTo().frame(webpageframe);
	
	By DragmeToMyTargetLocator=By.id("drag Able");
	WebElement DragmeToMyTarget=driver.findElement(DragmeToMyTargetLocator);
	String DragmeToMyTargetText=DragmeToMyTarget.getText();
	System.out.println("the text of the element DragmeToMyTarget is"+DragmeToMyTargetText);}
	public void applicationsclose()
	{
		driver.quit();
	 Object jqueryui_frame_gettext=new jqueryui_frame_gettext();
	}
	
}
