package OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utility.Log;

public class OrangeHRMHomePage extends OrangeHRMLoginPage
{
	public OrangeHRMHomePage()
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b ")
	WebElement orangeHRMHomePageAdmin;
	@FindBy(xpath="menu_pim_viewPimModule")
	WebElement orangeHRMHomePagePIM;
	@FindBy(xpath="//*[@id=\"menu_leave_viewLeaveModule\"]")
	WebElement orangeHRMHomePageLeave;
	@FindBy (xpath=" //*[@id=\"menu_time_viewTimeModule\"]")
	WebElement orangeHRMHomePageTime;
	@FindBy(xpath=" //*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b")
	WebElement orangeHRMHomePageRecruitment;
	@FindBy(xpath=" //*[@id=\"menu__Performance\"]")
	WebElement orangeHRMHomePagePerformance;
	@FindBy(xpath=" //*[@id=\"menu_dashboard_index\"]")
	WebElement orangeHRMHomePageDashboard;
	@FindBy(xpath=" //*[@id=\"menu_directory_viewDirectory\"]")
	WebElement orangeHRMHomePageDirectory;
	@FindBy (xpath=" //*[@id=\"menu_maintenance_purgeEmployee\"]")
	WebElement orangeHRMHomePageMaintenance;
	
	
	
	public void validatingHomePageAdminText()
	{
		String actual_OrangeHRMHomePageAdmintext=orangeHRMHomePageAdmin.getText();
		Log.info("the actual text of the OrangeHRMApplication HomePage Admin is:-"+actual_OrangeHRMHomePageAdmintext);
		
		String expected_OrangeHRMHomePageAdmintext="Admin";
		Log.info("The Expected Text Of The OrangeHRM Application Home Page Admin is:-"+expected_OrangeHRMHomePageAdmintext);
		
		Assert.assertEquals(actual_OrangeHRMHomePageAdmintext,expected_OrangeHRMHomePageAdmintext,"the text Of The Admin is Not Matched:-FAIL");
		Log.info("the text of the OrangeHRMApplication HomePage Admin is Matched:-PASS");
		
		Actions adminAction=new Actions(driver);
		adminAction.moveToElement(orangeHRMHomePageAdmin).build().perform();
		
	}
	public void validatingHomePagePIMText()
	{
		String actual_orangeHRMHomePagePIMtext=orangeHRMHomePagePIM.getText();
		Log.info("the actual text of the orangeHRMHomePagePIM  is:-"+actual_orangeHRMHomePagePIMtext);
		
		String expected_orangeHRMHomePagePIMtext="PIM";
		Log.info("The Expected Text Of The orangeHRMHomePagePIM is:-"+expected_orangeHRMHomePagePIMtext);
		
		Assert.assertEquals(actual_orangeHRMHomePagePIMtext,expected_orangeHRMHomePagePIMtext,"the text Of The Admin is Not Matched:-FAIL");
		Log.info("the text of the  OrangeHRMHomePageAdmin text is Matched:-PASS");
		
		Actions adminAction=new Actions(driver);
		adminAction.moveToElement(orangeHRMHomePagePIM).build().perform();
		
	}
	
	
	
	
	

}
