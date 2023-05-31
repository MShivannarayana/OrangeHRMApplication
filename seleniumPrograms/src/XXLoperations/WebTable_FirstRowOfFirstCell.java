package XXLoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_FirstRowOfFirstCell {
	public void firstRowOfFirstCellTest()
	{
		// Xpath - locator
		// xpath expression(selector)
		// The xpath expression is the Tag's starting from the Top of the source code till
		//    the inspected element property tag name
// Selector - /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		// Xpath - Absolute Xpath(starts with html tag)
		
By cityNameLocator=By.xpath
		("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[20]/td[7]/a");
		
	
		WebElement cityName=driver.findElement(cityNameLocator);
		
		String cityNameText=cityName.getText();
		System.out.println("the cityname is"+cityNameText);
					
	}

	public static void main(String[] args) {
WebTable_FirstRowOfFirstCell firstRowOfFirstCell = new WebTable_FirstRowOfFirstCell();

		firstRowOfFirstCell.setUp();
		firstRowOfFirstCell.firstRowOfFirstCellTest();
		firstRowOfFirstCell.tearDown();

			
	}

	private void setUp() {
		// TODO Auto-generated method stub
		
	}

	private void tearDown() {
		// TODO Auto-generated method stub
		
	}
}


