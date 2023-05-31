package Frameswork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery_Frame_gettext {
 WebDriver driver;
 String applicationUrlAddress="https://jqueryui.com/droppable/";
 public void applicationlaunch()
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(applicationUrlAddress);
 }
 public void FrameGetText()
 {
	 By webpageframelocator=By.className("demo-frame");
	 WebElement webpageFrame =driver.findElement(webpageframelocator);
	 driver.switchTo().frame(webpageFrame);
	 By dragMeToMyTargetLocator=By.id("draggable");
	 
	 WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetLocator);
	 String dragMeToMyTargetText=dragMeToMyTarget.getText();
	 System.out.println("the text of the element drag me to my target is"+dragMeToMyTargetText);
 }
 public void applicationclose()
 {
	 driver.quit();
 }
 public static void main(String[] args) {
	 JQuery_Frame_gettext Object=new JQuery_Frame_gettext();
	Object.applicationlaunch();
	Object.FrameGetText();
	Object.applicationclose();
	
}
 
}
