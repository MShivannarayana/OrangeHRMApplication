package com.OrangeHRmTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

//import com.google.common.collect.Table.Cell;

public class LoginValidationText<XSSFSheet> extends BaseTest{
	
	FileInputStream testDataFile;
	FileOutputStream fileOutPut;
	XSSFSheet testDatasheet;
	XSSFWorkbook WorkBook;
	Row testDataRow;
	FileInputStream properiesFile;
	Properties propertiesFilesProperty;

	@Test(priority=1,description="LoginPageValidation Test")
	public void OHRMApplicationLogInPageValidationTest() throws IOException
	{
		testDataFile=new FileInputStream("./src/com/ApplicationsDataXLFiles/MultipleTestDataOHRM.xlsx");
		WorkBook = new XSSFWorkbook(testDataFile);
		//testDatasheet=WorkBook.getSheet("Sheet1");
		//testDataRow=testDatasheet.getRow(1);
		properiesFile=new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");
		propertiesFilesProperty=new Properties();
		propertiesFilesProperty.load(properiesFile);
		
		Cell rowOfCell0=testDataRow.getCell(0);
		String expected_OHRMHomePageloginPanelText= rowOfCell0.getStringCellValue();
		//System.out.println("The actual Text of the OHRMHomepage LoginPanel is:-"+ actual_OHRMHomePageLoginloginPanelText);
		System.out.println("The Expected Text of the OHRMHomepage LoginPanel is:-"+ expected_OHRMHomePageloginPanelText);
		
		By LogInPanelLocator=By.id(propertiesFilesProperty.getProperty("orangeHRMApplicationLoginPageLogInPanelProperty"));
		WebElement LoginPanel=driver.findElement(LogInPanelLocator);
		String actual_OHRMHomePageLoginPageText=LoginPanel.getText();
		System.out.println("The actual Text of the OHRMHomepage LoginPanel is:-"+actual_OHRMHomePageLoginPageText);
		
   
		Cell testDataOHRMHomePageLoginPanelText=testDataRow.createCell(1);
		testDataOHRMHomePageLoginPanelText.setCellValue(actual_OHRMHomePageLoginPageText);
		
		if(actual_OHRMHomePageLoginPageText.equals(expected_OHRMHomePageloginPanelText))
		{
			System.out.println("the text of the OHRMHomePage Login Panel is Matched-PASS");
			org.apache.poi.ss.usermodel.Cell resultTestDataLoginPanelText=testDataRow.createCell(2);
			resultTestDataLoginPanelText.setCellValue("the text of the OHRMHomePage Login Panel is Matched_-PASS");
		}
		else
		{
			System.out.println("the text of the OHRMHomePage Login Panel is Not Matched-FAIL");
			org.apache.poi.ss.usermodel.Cell 
			resultTestDataLoginPanelText=testDataRow.createCell(2);
			resultTestDataLoginPanelText.setCellValue("the text of the OHRMHomePage Login Panel is Not Matched-FAIL");	
		}
		Cell rowOfCell3=(Cell) testDataRow.getCell(3);
		String expected_OHRMHomePageTItle=rowOfCell3.getStringCellValue();
		System.out.println("the Excpeted Title of the OHRMHomePage Text is"+expected_OHRMHomePageTItle);
		
		String actual_OHRMHomePageTItle=driver.getTitle();
		System.out.println("the Actual Title of the OHRMHomePage Text is"+actual_OHRMHomePageTItle);
		
		
		org.apache.poi.ss.usermodel.Cell testDataOHRMHomePageTitle= testDataRow.createCell(4);
		testDataOHRMHomePageTitle.setCellValue(actual_OHRMHomePageTItle);
		
		if(actual_OHRMHomePageTItle.equals(expected_OHRMHomePageTItle))
		{
			System.out.println("the title of the orangeHRMHomePage is matched-PASS");
			Cell resultTestDataTitle=testDataRow.createCell(5);
		  resultTestDataTitle.setCellValue("the Title of the OrangeHRMHomePage is matced:+PASS");
		}
		else
		{
			System.out.println("the title of the orangeHRMHomePage is  Not matched-FAIL");
			Cell resultTestDataTitle=testDataRow.createCell(5);
		 resultTestDataTitle.setCellValue("the Title of the OrangeHRMHomePage is not matced:+FAIL");
		}
		org.apache.poi.ss.usermodel.Cell rowOfCell6=testDataRow.getCell(6);
		String expected_OHRMHomePageUrl=rowOfCell6.getStringCellValue();
		System.out.println("The Expected Url of the OHRMHomePage is"+expected_OHRMHomePageUrl);
		
		String actual_OHRMHomePageUrl=driver.getCurrentUrl();
		Cell testDataOHRMHomePageUrl=testDataRow.createCell(7);
		System.out.println("the actual Url of the OHRMHomepage is"+actual_OHRMHomePageUrl);
		testDataOHRMHomePageUrl.setCellValue(actual_OHRMHomePageUrl);
		if(actual_OHRMHomePageUrl.contains(expected_OHRMHomePageUrl))
		{
			System.out.println("the Url of the OHRMHomePage is Matched-PASS");
			Cell resulttestDataUrl=testDataRow.createCell(8);
			resulttestDataUrl.setCellValue("the url of the OHRMHomePage is matched-PASS ");
		}
		else
		{
			System.out.println("the Url of the OHRMHomePage is Not  Matched-FAIL");
			Cell resulttestDataUrl=testDataRow.createCell(8);
			resulttestDataUrl.setCellValue("the url of the OHRMHomePage is not  matched-FAIL ");
		}
		Cell userNameTestDataRowOfCell=testDataRow.getCell(9);
		String userNameTestData=userNameTestDataRowOfCell.getStringCellValue();
		System.out.println("The UserName is:-"+userNameTestData);
		driver.findElement(By.id(propertiesFilesProperty.getProperty("userNameElmentproperty"))).sendKeys(userNameTestData);

		Cell passwordTestDataRowOfCell1=testDataRow.getCell(10);
		String passwordTestData=passwordTestDataRowOfCell1.getStringCellValue();
		System.out.println("The Password is:-"+passwordTestData);
		driver.findElement(By.id(propertiesFilesProperty.getProperty("passwordElementProperty"))).sendKeys(passwordTestData);

		driver.findElement(By.className(propertiesFilesProperty.getProperty("logInPageSubmitButtonProperty"))).click();

		fileOutPut=new FileOutputStream("./src/AplicationstestresultXLfiles/LogInTestResultOHRM.xlsx");
		WorkBook.write(fileOutPut);
		}
	
	
	
		@Test(priority=8,description="LogOut Test")
		private void oHRMApplicationHomePagelogOutTest() throws InterruptedException 
		{
		By WelcomeAdminLocator=By.id(propertiesFilesProperty.getProperty("welcomeAdminProperty"));
		WebElement WelcomeAdmin=driver.findElement(WelcomeAdminLocator);

		        WelcomeAdmin.click();

		Thread.sleep(1000);

		   By LogoutLocator=By.linkText(propertiesFilesProperty.getProperty("homePageLogOutProperty"));
		   WebElement Logout=driver.findElement(LogoutLocator);
		 
		   Logout.click();
		}
				
		
		
		
		
		
		
	
}
