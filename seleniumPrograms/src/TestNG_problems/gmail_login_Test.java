package TestNG_problems;

import org.testng.annotations.Test;

public class gmail_login_Test {
	@Test(priority=1,description="gmail login test")
	public void gmailapplicationlaunch()
	{
		System.out.println("**Sucessfully Navigated to gmail login page**");
	}
	@Test(priority=2,description="Gmail inbox test")
	public void gmailBoxtest()
	{
		System.out.println("**Inbox functionality test is sucessfully**");
	}
	@Test(enabled=false,description="gmail Draft test")
	public void gmailDrafttest()
	{
		System.out.println("**Draft functionality test is sucessfully**");
	}
	@Test(priority=5,description="gmail sent mail test")
	public void gmailsentmailtest()
	{
		System.out.println("**gmailsentmailtest functionality test is sucessfully**");
	}
	@Test(priority=3,description="gmail compose mail test")
	public void gmailcomposemailtest()
	{
		System.out.println("**gmailcomposemail functionality test is sucessfully**");
	}
	@Test(priority=6,description="gmail applications close")
	public void gmailapplicationsclose()
	{
		System.out.println("**gmail applicatioins close "
				+ "test is sucessfully**");
	}
}
