package Draganddropoprrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquary_DragAndDrop {
		 WebDriver driver;
		 String applicationUrlAddress="https://jqueryui.com/droppable/";
		 public void DraganddropTest()
		 {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(applicationUrlAddress);
		 By webpageframelocator =By.className("Demo-frame");
		 WebElement  webpageframe=driver.findElement( webpageframelocator);
		 driver.switchTo().frame( webpageframe);
		 
		 By dragmetomytargetlocator =By.id("draggable");
		 WebElement  dragmetomytaget=driver.findElement( dragmetomytargetlocator);
		 //id="draggable";
		 By dropHerelocator=By.id("draggable");
		 WebElement dropHere =driver.findElement(dropHerelocator);
		 
		 Actions dragAction=new Actions(driver);
		 dragAction.dragAndDrop(dragmetomytaget, dropHere).build().perform();
		 }
		 public void resizableTest()
		 {
			 By resizeablelocator=By.linkText("Resizable");
			 WebElement resizable=driver.findElement(resizeablelocator);
			 resizable.click();
			 
			 String webpageTitle=driver.getTitle();
			 System.out.println("the title of the resizable webpage is"+webpageTitle);
			 }
		 public static void main(String[] args) {
			 Jquary_DragAndDrop DragAndDrop =new  Jquary_DragAndDrop();
			 DragAndDrop.applicationlaunch();
			 DragAndDrop. DraganddropTest();
			 DragAndDrop.resizableTest();
			 
		
			
		}
		private void applicationlaunch() {
			// TODO Auto-generated method stub
			
		}
}
