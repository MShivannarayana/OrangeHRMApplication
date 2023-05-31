package com.xpathmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import XXLoperations.BaseTest;

public class GmailApplicationTest extends BaseTest{
	
	@Test
	public void LoginTest()
	{
		/*<input type="email" autocomplete="username"
		 * aria -label="Email or phone" data-intial-value=" ">
		 
		 */
	//Relative Xpath-the expression of the xpath is created based on the available properties(attributes and there corresponding values)
		// aria -label="Email or phone " -property of Email Element
		
	// // tagname="Email or phone"-property of Email Element 
	// // *[@attribute="attributeValue"]
		// - means search on the complete WebPage
	// * means search for all the tag's
		
	//Xpath expresion creating based on Single Property
	// //input[@aria -label="Email or phone"]-xpath expression for Email Element 
	// //*[@aria-label="Email or phone"]-xpath expression for Email Element
	// //Xpath expression creating based on Multiple Property 
		
		By emailLocator=By.xpath("//*[@aria-label='Email or phone' and @autocomplete='username']");
		
		WebElement email=driver.findElement(emailLocator);
		email.sendKeys("shiva.nnarayana");
		
		/*Xpath using text():
			1.//tagname[text()="textvalue"]
		
		*/
		//Xpath expression creation based on text method
		//span[text()="Next"]
	/*
		By nextButtonLocator=By.xpath("//span[text()='Next']");
		 WebElement nextButton=driver.findElement(nextButtonLocator);
		 nextButton.click();
		 */
	}	
	}