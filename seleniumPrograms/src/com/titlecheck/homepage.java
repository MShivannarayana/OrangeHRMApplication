package com.titlecheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {
	/*public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.instagram.com/");
		driver.close();			//closing the browser */
		public static void main(String[] args) {
		WebDriver driver;
		String applicationsURLAddress ="https://www.google.com/";
		//String applicationsURLAddress ="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(applicationsURLAddress);
		
		String googlehomepageTitle=driver.getTitle();
		System.out.println("the url adress of googlehomepageTitle  is ::-" +googlehomepageTitle );
		
		
		//System.out.println("the title of the googlehomepage:" + facebookHomePageTitle );
		String facebookhomepageURLAddress = driver.getCurrentUrl();
		System.out.println("the url adress of facebook homepage is ::-"+facebookhomepageURLAddress );
		
		driver.quit();  
	}
}

