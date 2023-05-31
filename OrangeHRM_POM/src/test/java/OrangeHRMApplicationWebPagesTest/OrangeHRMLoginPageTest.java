package OrangeHRMApplicationWebPagesTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.utility.Log;

import OrangeHRMApplicationWebPages.OrangeHRMLoginPage;

public class OrangeHRMLoginPageTest extends  BaseTest
{
	OrangeHRMLoginPage loginpage;
	@Test(priority=1,description="validting LogIn Page LogInPanel Text")
	public void validatingLogInPageTextTest()
	
	{
		loginpage=new OrangeHRMLoginPage();
		loginpage.validatingLogInPageText();
		
		Log.info("Validating LogIn Page logInPanel text Successfull-navigated to LogIN Page");
		
	}
	@Test(priority=2,description="Vailding LogIn Functionality")
	
	public void validatingLogInTest() throws IOException
	{
		FileInputStream testDataFile=new FileInputStream("./src/main/java/com/ApplicationTestdataFiles/MultipleTestDataOHRM.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
		
		//for(int rowIndex=1;rowIndex<=5;rowIndex++)
		//{
			Row testDataRow=testDataSheet.getRow(1);
			
			Cell rowOfCell9=testDataRow.getCell(9);
			Cell rowOfCell10=testDataRow.getCell(10);
			
			loginpage=new OrangeHRMLoginPage();
			loginpage.validatingLogIn(rowOfCell9.getStringCellValue(),rowOfCell10.getStringCellValue() );
			
			Log.info("validation of login functionlity Sucussfully" );
			
			
			
		//}
		
		/*loginpage=new OrangeHRMLoginPage();
		loginpage.validatingLogIn("Admin","Shiva@143");
		
		Log.info("Validating LogIn functionality Successfull");*/
	}
	@Test(priority=3,description="validting LogIn Page Logo")
	public void validatingLogInPageLogoTest()
	{
		loginpage=new OrangeHRMLoginPage();
		loginpage.validatingLogInPageLogo();
		
		Log.info("OrangeHRM Application LogIn page Logo existing");
		
		
	}
	
}
