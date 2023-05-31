package com.titlecheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;

public class google_gettitle {
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationsadress="https://www.google.com/";
		System.setProperty("webdrives.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get(applicationsadress);
		String googleHomePageTitle =driver.getTitle();
		System.out.println("the title is of the homepage is :-" +googleHomePageTitle);
		driver.close();
		
	}

}
