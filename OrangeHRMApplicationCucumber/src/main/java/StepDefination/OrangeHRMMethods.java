package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMMethods {
	WebDriver driver;
	String applicationsurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@Given("^User should launch chrome Browser$")
	public void user_should_launch_chrome_Browser(){
		System.setProperty("webdriver.chrome.driver"," ./driverfiles/chromedriver.exe");
		driver= new ChromeDriver();
		
		System.out.println("*** Chrome Browser Launched Sucussfully ***");
		
	    
	}


	@When("^User should enter Valid OrangeHRM Application Url Address$")
	public void user_should_enter_Valid_OrangeHRM_Application_Url_Address(){
		driver.get(applicationsurladdress);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	   
	}

	@Then("^user should be navigated to OrangeHRM Application Login Page$")
	public void user_should_be_navigated_to_OrangeHRM_Application_Login_Page() {
		String OHRMHomePageTitle=driver.getTitle();

		System.out.println("The title of the OHRMHomePage is:-"+OHRMHomePageTitle);



		String expected_OHRMHomePage="OrangeHRM";

		System.out.println("The expected title of the ORHMHomePage is:-"+expected_OHRMHomePage);

		String actual_ORHMHomePage=OHRMHomePageTitle;

		System.out.println("The expected title of the ORHMHomePage is:-"+actual_ORHMHomePage);

		

		

		

		if(actual_ORHMHomePage.equals(expected_OHRMHomePage))

		{

			System.out.println("The title of the OHRMHomePage is matched:-Pass");

		}

		else

		{

			System.out.println("The title of the OHRMHomePage is Not matched:-Fail");

		}

		

		String OHRMHomePageUrlAddress=driver.getCurrentUrl();

		System.out.println("The Url of the OHRMHomePage is:-"+OHRMHomePageUrlAddress);

		

		String expected_ORHMHomePageUrlAddress="orangehrm-4.2.0.1";

		System.out.println("The expected Url of the OHRMHomePage is:-"+expected_ORHMHomePageUrlAddress);

		String actual_ORHMHomePageUrlAddress=OHRMHomePageUrlAddress;

		System.out.println("The actual Url of the OHRMHomePage is:-"+OHRMHomePageUrlAddress);

		

		if(actual_ORHMHomePageUrlAddress.contains(expected_ORHMHomePageUrlAddress))

		{

			System.out.println("The Url of the OHRMHomePage is matched:-Pass");

		}

		else

		{

			System.out.println("The Url of the OHRMHomePage is Not matched:-Fail");

		}

		

		By LoginPanelLocator=By.id("logInPanelHeading");

		WebElement LoginPanel=driver.findElement(LoginPanelLocator);

		//String LoginPanelText=LoginPanel.getText();

		//System.out.println("The text of the WebElement Login on OHRMHomePage is:-"+LoginPanelText);

		

		

		String expected_OHRMHomePageLogInPanelText="LOGIN Panel";

		System.out.println("The expected Text of the OHRMHomePageLogInPanel is:-"+expected_OHRMHomePageLogInPanelText);

		String actual_OHRMHomePageLogInPanelText=LoginPanel.getText();

		System.out.println("The actual Text of the OHRMHomePageLogInPanel is:-"+actual_OHRMHomePageLogInPanelText);



	    if(actual_OHRMHomePageLogInPanelText.equals(expected_OHRMHomePageLogInPanelText))

	    {

	    	System.out.println("The Text of the OHRMHomePageLogInPanel is matched :-Pass");

	    }

	    else

	    {

	    	System.out.println("The Text of the OHRMHomePageLogInPanel is Not matched :-Fail");

	    }

		

		

		

		
	   
	}

	@Then("^User should close the Browser along with the Application$")
	public void user_should_close_the_Browser_along_with_the_Application()  {
		driver.close();
		System.out.println("Chrome Browser along with Application closed Sucussfully");
	    
	}



	}




	
	 


