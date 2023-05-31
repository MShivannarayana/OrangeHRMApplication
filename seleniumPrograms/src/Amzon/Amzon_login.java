package Amzon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amzon_login {
	public static void main(String[] args) {
		

	WebDriver driver;
	String applicationsurlAddress="https://www.amazon.in/";
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationsurlAddress);
	//driver.findElement(By.linkText("SignIn")).click();
	
	By accountsAndListLocator=By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span");
	WebElement accountsAndList=driver.findElement(accountsAndListLocator);
	
	Actions accountsAction=new Actions(driver);
	accountsAction.moveToElement(accountsAndList).build().perform();
	
	By signInLocator=By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[1]/div/a/span");
	WebElement signIn=driver.findElement(signInLocator);
	signIn.click();
	
	/*By emailTextBoxLocator=By.id("ap_email");
	WebElement emailTextBox=driver.findElement(emailTextBoxLocator);
	emailTextBox.sendKeys("siva.siva222222@gmail.com");
	
	By continueLocator=By.id("continue");
	WebElement continu=driver.findElement(continueLocator);
	continu.click();
	
	By passwordLocator=By.id("ap_password");
	WebElement password=driver.findElement(passwordLocator);
	password.sendKeys("shiva@321");
	
	By signInSubmitLocator=By.id("signInSubmit");
	WebElement signInSubmit=driver.findElement(signInSubmitLocator);
	signInSubmit.click();
	By searchbook=By.id("twotabsearchtextbox");
	WebElement bookname=driver.findElement(searchbook);
	bookname.sendKeys("rgvbook"); 
	Actions booknameaction=new Actions(driver);
	booknameaction.sendKeys(Keys.ENTER).build().perform();
	By rgvbooknamelocator=By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div[4]/div[4]/div/div[1]/div/div/div/form/div/div");
	WebElement rgvbookname =driver.findElement(rgvbooknamelocator);
	rgvbookname.click();
	By presstoaddtocart=By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div[4]/div[4]/div/div[1]/div/div/div/form/div/div/div");
	WebElement presstoadd=driver.findElement(presstoaddtocart);
	driver.switchTo().frame(presstoadd);
    By addtocartlocator=By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div[4]/div[4]/div/div[1]/div/div/div/form/div/div/div/div/div[3]/div/div[41]/div[1]/span/span/span/input");
	WebElement addtocart=driver.findElement(addtocartlocator);
	addtocart.click();*/
	
	//driver.close();
	}
}
