package TestNG_problems;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation3 {
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println("***gmail application launch sucessful***");
	}
	@AfterTest
	public void gmailApplicationBoxTest()
	{
		System.out.println("***gmail application Test sucessful***");
	}
	@Test(priority=1,description="testing inbox functionality of gmail ")
	public void gmailApplicationboxtest()
	{
		System.out.println("inbox functionality test sucessfully");
	}
	@Test(priority=4,description="testing sent mail functionality  ")
	public void gmailapplicationssentmailtest()
	{
		System.out.println(" sentmailtest functionality sucessfully");
	}
	@Test(priority=2,description="testing compose functionality of gmail ")
	public void gmailApplicationcomposemailtest()
	{
		System.out.println("compose functionality test sucessfully");
	}
	@Test(enabled=false,description="testing draft functionality of gmail ")
	public void gmailApplicationsDraftstest()
	{
		System.out.println("Draft functionality test sucessfully");
	}




}
