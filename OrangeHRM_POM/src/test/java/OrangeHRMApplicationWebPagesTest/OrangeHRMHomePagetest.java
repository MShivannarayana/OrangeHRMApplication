package OrangeHRMApplicationWebPagesTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utility.Log;

import OrangeHRMApplicationWebPages.OrangeHRMHomePage;

public class OrangeHRMHomePagetest  extends OrangeHRMLoginPageTest{
		OrangeHRMHomePagetest logInPage;
		OrangeHRMHomePage homePage;

		@Test(priority=1,description="Validating ORHM Application Home Page Admin Text")
		public void validatingHomePageAdminTextTest() throws IOException, InterruptedException
		{
		logInPage=new OrangeHRMHomePagetest();
		logInPage.validatingLogInTest();

		Log.info("Validation of LogIn functionality Successfull");

		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageAdminText();

		Log.info(" Validating Home Page Admin Text Successfull - Naviagated to Home Page");
		}

		@Test(priority=2,description="Validating ORHM Application Home Page PIM Text")
		public void validatingHomePagePIMTextTest() throws IOException
		{

		logInPage.validatingLogInTest();

		Log.info("Validation of LogIn functionality Successfull");


		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageAdminText();

		Log.info(" Validating Home Page PIM Text Successfull - Naviagated to Home Page");

		}

		@Test(priority=4,description="Validating ORHM Application Home Page Leave Text")
		public void validatingHomePageLeaveTextTest() throws IOException
		{

		logInPage.validatingLogInTest();

		Log.info("Validation of LogIn functionality Successfull");

		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageAdminText();

		Log.info(" Validating Home Page Leave Text Successfull - Naviagated to Home Page");

		}

		@Test(priority=5,description="Validating ORHM Application Home Page Time Text")
		public void validatingHomePageTimeTextTest() throws IOException
		{
		        logInPage.validatingLogInTest();

		Log.info("Validation of LogIn functionality Successfull");

		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageAdminText();

		Log.info(" Validating Home Page Time Text Successfull - Naviagated to Home Page");

		}

		}

