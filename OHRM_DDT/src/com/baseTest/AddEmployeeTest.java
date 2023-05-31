package com.baseTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployeeTest extends LoginValidationText{
	

	FileInputStream testDataFile;
	FileOutputStream fileOutPut;
	XSSFSheet testDatasheet;
	XSSFWorkbook WorkBook;
	Row testDataRow;
	FileInputStream properiesFile;
	Properties propertiesFilesProperty;
	
	@Test(priority=1,description="LoginPageValidation Test")
	public void oHRMApplicationLogInPageValidationTest() throws IOException
	{
		testDataFile=new FileInputStream("./src/com/ApplicationsDataXLFiles/MultipleTestDataOHRM.xlsx");
		WorkBook = new XSSFWorkbook(testDataFile);
		testDatasheet=WorkBook.getSheet("Sheet1");
		testDataRow=testDatasheet.getRow(1);
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
		
	
		FileOutputStream fileOutPut=new FileOutputStream("./src/AplicationstestresultXLfiles/LogInTestResultOHRM.xlsx");
		WorkBook.write(fileOutPut);
		
		driver.findElement(By.className(propertiesFilesProperty.getProperty("logInPageSubmitButtonProperty"))).click();
		
	
		}
	@Test(priority=2)
	public void oHRMApplicationHomePageAdminTest()
	{
		Cell rowOfCell11 = testDataRow.getCell(11);
		String expected_OHRMHomePageAdminText = rowOfCell11.getStringCellValue();
	
		System.out.println("The Expected Text of the OHRMHomepage Admin Text is:-" + expected_OHRMHomePageAdminText);
		 
		By orangeHRMApllicationAdminLoacator=By.id("menu_admin_viewAdminModule");
		WebElement Admin=driver.findElement(orangeHRMApllicationAdminLoacator);
		String actual_OHRMHomePageAdminText=Admin.getText();
		
		 System.out.println("The Expected Text of the OHRMHomepage Admin text is :-"+actual_OHRMHomePageAdminText);
		 Cell adminCell=testDataRow.createCell(12);
		 adminCell.setCellValue(actual_OHRMHomePageAdminText);
		 if(actual_OHRMHomePageAdminText.equals(expected_OHRMHomePageAdminText))
		 {
			 System.out.println("the text of the Admin is Matched == PASS");
			 Cell adminresult =testDataRow.createCell(13);
			 adminresult.setCellValue("the text of the Admin is Matched == PASS");
			 
		 }
		 else
		 {
			 System.out.println("the text of the Admin is not matched == Fail");
			 Cell adminresult =testDataRow.createCell(13);
			 adminresult.setCellValue("the text of the Admin is Not Matched == Fail");
		 }
		 
	}
	
	@Test(priority=3,description="PIM Test")
	public void oHRMApplicationHomePagePIMTest()
	{
		By pimLocator = By.linkText(propertiesFilesProperty.getProperty("pimElementProperty"));
		WebElement pim=driver.findElement(pimLocator);
		Actions pimAction =new Actions(driver);
		pimAction.moveToElement(pim).build().perform();
	}
	@Test(priority=4,description="Add Employee Test")
	public void oHRMApplicationHomePageAddEmployeeTest()
	{
		By addEmployeeLocator=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeeLocator);
		addEmployee.click();
	}
	@Test(priority=5,description="AddEmployee Validation Test")
	public void oHRMApplicationHomePageAddEmployeeValidationTest() throws IOException, InterruptedException
	{
		Cell rowOfCell14=testDataRow.getCell(14);
	    String expected_AddEmployeeHeaderText=rowOfCell14.getStringCellValue();
		System.out.println("The Expected Text Of The AddEmployee Header is :-"+expected_AddEmployeeHeaderText);
		
		By addEmployeeHeaderLocator=By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1");
		WebElement addEmployeeHeader=driver.findElement(addEmployeeHeaderLocator);
		String actual_AddEmployeeHeaderText=addEmployeeHeader.getText();
		System.out.println("The Actual Text Of The AddEmployee Header is :-"+actual_AddEmployeeHeaderText);
		Cell rowOfCell15=testDataRow.createCell(15);
		rowOfCell15.setCellValue(actual_AddEmployeeHeaderText);
		
		if(actual_AddEmployeeHeaderText.equals(expected_AddEmployeeHeaderText))
		{
			System.out.println("The Text Of The AddEmployee Header is Mathed : - PASS ");
			Cell rowOfCell16=testDataRow.createCell(16);
			rowOfCell16.setCellValue("The Text Of The AddEmployee Header is Mathed : - PASS ");
		}
		else
		{
			System.out.println("The Text Of The AddEmployee Header is Not Mathed : - FAIL ");
			Cell rowOfCell16=testDataRow.createCell(16);
			rowOfCell16.setCellValue("The Text Of The AddEmployee Header is Not Mathed : - FAIL ");
		}
		Cell rowofCell17=testDataRow.getCell(17);
		String expected_Fullname=rowofCell17.getStringCellValue();
		System.out.println("the Expeted Text of the Full name:-"+expected_Fullname );
		By fullNameLocator=By.className("hasTopFieldHelp");
		 WebElement fullName=driver.findElement(fullNameLocator);
		 String actual_Fulname= fullName.getText();
		 System.out.println("the actual Text of the Full name:-"+actual_Fulname );
		 Cell rowOfCell18=testDataRow.createCell(18);
		 rowOfCell18.setCellValue(actual_Fulname);
		 if(actual_Fulname.equals(expected_Fullname))
		 {
			 System.out.println("the text of the Full Name is Matched :- PASS");
			 Cell rowofCell19=testDataRow.createCell(19);
			 rowofCell19.setCellValue("the text of the Full Name is Matched :- PASS" );
		 }
		 else
		 {
			 System.out.println("the text of the Full Name is Not  Matched :- Fail");
			 Cell rowofCell19=testDataRow.createCell(19);
			 rowofCell19.setCellValue("the text of the Full Name is Not Matched :- Fail" );
		 }
		 Cell rowofCell20=testDataRow.getCell(20);
		 String expected_firstName=rowofCell20.getStringCellValue();
		 System.out.println("the Excpeted firstname is:-"+expected_firstName);
		By firstNameLocator= By.id("firstName");
		WebElement FirstName =driver.findElement(firstNameLocator);
		FirstName.sendKeys(expected_firstName);
		Actions addEmployeeAction=new Actions(driver);
		addEmployeeAction.sendKeys(Keys.TAB).build().perform();
		Cell rowOfCell23=testDataRow.getCell(23);
		String expected_MiddleName=rowOfCell23.getStringCellValue();
		addEmployeeAction.sendKeys(expected_MiddleName).build().perform();
		
		//Actions addEmployeAction=new Actions(driver);
		addEmployeeAction.sendKeys(Keys.TAB).build().perform();
		Cell rowOfCell26=testDataRow.getCell(26);
		String expected_LastName=rowOfCell26.getStringCellValue();
		addEmployeeAction.sendKeys(expected_LastName).build().perform();
		
		addEmployeeAction.sendKeys(Keys.TAB).build().perform();
		By employeeIdLocator=By.id("employeeId");
	    WebElement employeeId=driver.findElement(employeeIdLocator);
	    String expected_EmployeeId=employeeId.getAttribute("value");
	    System.out.println("The Number Of The Employee Id is :-  "+expected_EmployeeId);
	    Cell rowOfCell29=testDataRow.createCell(29);
	    rowOfCell29.setCellValue(expected_EmployeeId);
	    
	    addEmployeeAction.sendKeys(Keys.TAB).build().perform();
	    addEmployeeAction.sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(5000);
	   java.lang.Runtime.getRuntime().exec("./FileUpload/Fileupload.exe");
	   Thread.sleep(5000);
	    
	    
	    addEmployeeAction.sendKeys(Keys.TAB).build().perform();
	    addEmployeeAction.sendKeys(Keys.TAB).build().perform();
	    
	    addEmployeeAction.sendKeys(Keys.ENTER).build().perform();
	  
	   
	    if(employeeId.equals(expected_EmployeeId))
	    {
	    System.out.println("The Number Of The EmployeeId is Matched :- PASS");
	    Cell testResultOfEmployeeId=testDataRow.createCell(31);
	    testResultOfEmployeeId.setCellValue("The Number Of The EmployeeId is Matched :- PASS");
	    }
	    else
	    {
	    System.out.println("The Number Of The EmployeeId is Not Matched :- FAIL");
	    Cell testResultOfEmployeeId=testDataRow.createCell(31);
	    testResultOfEmployeeId.setCellValue("The Number Of The EmployeeId is Not Matched :- FAIL");
	    }


	    fileOutPut=new FileOutputStream("./src/AplicationstestresultXLfiles/OHRMEmployyelistTestData.xlsx");
	    WorkBook.write(fileOutPut);
	    

}
}

