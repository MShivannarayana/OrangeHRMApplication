package TestNG_problems;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println("***gmail application launch sucessful***");
	}
	@AfterTest
	public void gmailapplicationsClose()
	{
		System.out.println("gmail applications close is sucessfully");
	}
	@Test(priority=1,description="Testing inbox functionlity of gmail applicatioins")
	public void gmailapplicationsentmailtest()
	{
		System.out.println("sent mail functionlity test sucessfully");
	}
	@Test(priority=2,description="Testing compose  mail functionlity")
	public void gmailapplicationcomparemailtest()
	{
		System.out.println("compose mail functionlity test sucessfully");
	}
	@Test(enabled=false,description="Testing Draft functionlity")
	public void gmailapplicationdraftsTest()
	{
		System.out.println("Draft functionlity test sucessfully");
	}
	
	

}
