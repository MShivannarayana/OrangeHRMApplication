package OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utility.Log;

public class OrangeHRMAddEmployeePage extends OrangeHRMLoginPage{
	
	public OrangeHRMAddEmployeePage()
	{
		PageFactory.initElements(driver,addEmployee);
	}
	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmployee;
	
	@FindBy (id="//*[@id=\"content\"]/div/div[1]/h1")
	WebElement addEmployeeHeader;
	public void validtingAddEmployeeHeaderText()
	{
		addEmployee.click();
		
		String Actual_addEmployeeHeaderText=addEmployeeHeader.getText();
		Log.info("the actual Text of the AddEmployee HearText is:-"+Actual_addEmployeeHeaderText);

		String Expected_addEmployeeheaderText="Add Employee";
		Log.info("The Expected_ text of the addEmployeeheader Text"+Expected_addEmployeeheaderText);
		
		Assert.assertEquals(Actual_addEmployeeHeaderText,Expected_addEmployeeheaderText,"the text of the AddEmployee Header Text is NOT matched-FAIl");
		Log.info("the text of the AddEmployee header text is Matched-PASS");
	}
}
