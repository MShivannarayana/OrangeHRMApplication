 package OrangeHRMApplicationWebPagesTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utility.Log;

import OrangeHRMApplicationWebPages.OrangeHRMAddEmployeePage;
import OrangeHRMApplicationWebPages.OrangeHRMHomePage;
import OrangeHRMApplicationWebPages.OrangeHRMLoginPage;

public class OrangeHRmAddEmployeeTest extends OrangeHRMLoginPage {
	OrangeHRMLoginPageTest logInPage;
	OrangeHRMHomePage homePage;
	OrangeHRMAddEmployeePage addEmployee;
	
	@Test(priority=3,description="Validating AddEmployeeText")
	public void validtingAddEmployeeHeaderText() throws IOException
	{
		logInPage=new OrangeHRMLoginPageTest();
		logInPage.validatingLogInTest();
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePage();
		addEmployee=new OrangeHRMAddEmployeePage();
		addEmployee.validtingAddEmployeeHeaderText();
		Log.info("Validating AddEmployee Header Text Sucussfully-navigated to AddEmployee Page");
	}
}
	
	