import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class monstarreume {
	public static void main(String[] args) {
		/*WebDriver driver = null;
		String applicationsurladdress="https://my.monsterindia.com/sponspered-pop.html";
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		By currentlocation=By.className("border-grey1");
		WebElement currentLocation=driver.findElement(currentlocation);
		By currentLocationDropDownlocator = By.tagName("option");
		
		List<WebElement>currentLocationDropDown=currentLocation.findElements(currentLocationDropDownlocator);
	    int currentLocationDropDownCount=currentLocationDropDown.size();
	    System.out.println("the number of the cities in the current location dropdown are"+currentLocationDropDownCount);
	    
	    for(int CurrentLocationindex=0;CurrentLocationindex<currentLocationDropDownCount;CurrentLocationindex++)
	    {
	    	String cityName=currentLocationDropDown.get(CurrentLocationindex).getText();
	    	System.out.println(CurrentLocationindex+"--"+cityName);
	    }*/
				
				WebDriver driver;
				String applicationUrlAddress="http://my.monsterindia.com/sponsered_popup.html";
				
				System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shiva nnarayana\\\\eclipse-workspace\\\\seleniumPrograms\\\\driverfiles\\\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(applicationUrlAddress);
				
				By currentLocationLocator=By.className("border_grey1");
				WebElement currentLocation=driver.findElement(currentLocationLocator);
				
				By currentLocationDropDownLocator=By.tagName("option");
				List<WebElement>currentLocationDropDown=currentLocation.findElements(currentLocationDropDownLocator);
				
				int currentLocationDropDownCount=currentLocationDropDown.size();
				System.out.println(currentLocationDropDownCount);
				
				/*for(int currentLocationIndex=0;currentLocationIndex<currentLocationDropDownCount;currentLocationIndex++)
				{
					String cityName=currentLocationDropDown.get(currentLocationIndex).getText();
					System.out.println(currentLocationIndex+" - "+cityName);
			
					
				}*/  
				Select selectCurrentLocatoin=new Select(currentLocation);
				
				selectCurrentLocatoin.selectByIndex(2);
				selectCurrentLocatoin.selectByValue("65");
				selectCurrentLocatoin.selectByVisibleText("Mysore");
				
				By industryLocator=By.id("id_industry");
				WebElement industry=driver.findElement(industryLocator);
				
				By industryDropDownLocator=By.tagName("option");
				List<WebElement> industryDropDown=industry.findElements(industryDropDownLocator);
				
				int industryDropDownCount=industryDropDown.size();
				System.out.println(industryDropDownCount);
				
				Select selectIndustry=new Select(industry);
				
				selectIndustry.selectByIndex(3);
				selectIndustry.selectByValue("4");
				selectIndustry.selectByIndex(10);
				
				selectIndustry.deselectByIndex(3);
				selectIndustry.deselectAll();
				
				//driver.close();
			}

		
}
