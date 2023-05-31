package WebTable.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_getcity_firstrowoffirstcallData {
	WebDriver driver;
	String applicationsurladdress="https://www.timeanddate.com/worldclock/";
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationsurladdress);
	}
	public void getcityNameTest()
	{
		for( int index=1;index<=36;index++)
		{
		By cityNameLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
		WebElement cityName=driver.findElement(cityNameLocator);
		String cityNameText=cityName.getText();
		//System.out.println("the cityName is"+cityNameText);}
		System.out.println(index+"-" +cityNameText);}
		
	}
public static void main(String[] args) {
	webtable_getcity_firstrowoffirstcallData cityname=new webtable_getcity_firstrowoffirstcallData ();
	
	cityname.setup();
	cityname.getcityNameTest();
	cityname.tearDown();
	
}
private void tearDown() {
	// TODO Auto-generated method stub
	
}
}
