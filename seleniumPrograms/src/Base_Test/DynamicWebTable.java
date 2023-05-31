package Base_Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicWebTable {
	WebDriver driver;
	String applicationsurladdress="https://www.timeanddate.com/worldclock/";
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationsurladdress);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void getcompletewebtabledatatest() throws IOException
	{
		FileInputStream exceltestDataFile=new FileInputStream("./src/com/ExcelFiles2/Book1.xlsx");
		XSSFWorkbook WorkBook =new XSSFWorkbook(exceltestDataFile);
		XSSFSheet testDataSheet= WorkBook.getSheet("Sheet1");
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	
	///html/body/div[5]/section[1]/div
	By webtablelocator=By.xpath("./html/body/div[5]/section[1]/div");
	 WebElement WebTable =driver.findElement(webtablelocator);
	 By rowslocator=By.tagName("tr");
	 List<WebElement>rows=WebTable.findElements(rowslocator);
		
		// of the WebTable - should goto all the Rows
		for(int rowIndex=1;rowIndex<rows.size();rowIndex++)
		{
				// in the Sheet - creating a new Row
			Row newRow=testDataSheet.createRow(rowIndex-1);

		 
		 By rowOfCellLocator=By.tagName("td");
			List<WebElement>rowOfCells=rows.get(rowIndex).findElements(rowOfCellLocator);
			
			// to goto every Row of all the Cells
			for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
			{
				Cell newRowOfCell=newRow.createCell(rowOfCellIndex);
				String testData=rowOfCells.get(rowOfCellIndex).getText();
				
				newRowOfCell.setCellValue(testData);
				System.out.print(testData+"  ");
				
				FileOutputStream fileOutPut = new FileOutputStream
						("./src/com/ExcelFiles2/dynamicXLsheet.xlsx");
WorkBook.write(fileOutPut);
			}
			System.out.println();
		}
	}
}