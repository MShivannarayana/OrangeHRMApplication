package MonstarProblem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class monstarproblem {
	public static void main(String[] args) {
		
		
		WebDriver driver;
		String ApplicationsUrlAddress="http://my.monsterindia.com/sponsered_popup.html";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(ApplicationsUrlAddress);
		 By currentLocationLocator=By.tagName("boader_grey 1");
		 WebElement Currentlocation=driver.findElement(currentLocationLocator);
		 By currentlocationDropDownlocator=By.tagName("option");
		 List<WebElement>currentlocationDropDown=Currentlocation.findElements(currentlocationDropDownlocator);
		 
		 int currentlocationDropdownCount=currentlocationDropDown.size();
		 
				 
					System.out.println("the number of cities in the current locations drop down are"+"-"+currentlocationDropdownCount);
					
				/*	for(int currentlocationindex=0;currentlocationindex<currentlocationDropdownCount;currentlocationindex++)
					{
						String cityName=currentLocationDropDown.get(currentLocationIndex).getText();
					System.out.println(currentLocationIndex+" - "+cityName);
						
					}
				*/
					
				Select selectCurrentlocation=new Select(Currentlocation);
				selectCurrentlocation.selectByIndex(2);
				selectCurrentlocation.selectByValue("65");
				selectCurrentlocation.selectByVisibleText("mysore");
				
				By industryLocator=By.id("id_industry");
				WebElement industry=driver.findElement(industryLocator);
				
				By industryDropDownLocator=By.tagName("option");
				List<WebElement> industryDropDown=industry.findElements(industryDropDownLocator);
				
				int industryDropDownCount=industryDropDown.size();
				System.out.println(industryDropDownCount);
				
				Select selectIndustry=new Select(industry);
				
				selectIndustry.selectByIndex(3);
				selectIndustry.selectByValue("sanju");
				selectIndustry.selectByIndex(10);
				
				selectIndustry.deselectByIndex(3);
				selectIndustry.deselectAll();
				
				
					
					
					
					
		 
		 
		 
	}

}
