package Tsrtcproblem;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tsrtchomepagelimk {
private static int tsrtcHomePageLinksIndex;

public static void main(String[] args) {
	WebDriver driver;
	String ApplicationsUrlAddress="https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva nnarayana\\eclipse-workspace\\seleniumPrograms\\driverfiles\\chromedriver.exe " );
    driver=new ChromeDriver();
    driver.get(ApplicationsUrlAddress);

    By linksLocator =By.tagName("a");
    List<WebElement>tsrtcHomePageLinks=driver.findElements(linksLocator);
    int tsrtcHomePageLinksCount=tsrtcHomePageLinks.size();
    System.out.println("the number of links in the applications"+ "----" +tsrtcHomePageLinksCount);
    for(int tsrtcHomePageLinksIndex=0;tsrtcHomePageLinksIndex<tsrtcHomePageLinksCount;tsrtcHomePageLinksIndex++)
    {
    	String tsrtcHomePageLinkName=tsrtcHomePageLinks.get(tsrtcHomePageLinksIndex).getText();
    	System.out.println(tsrtcHomePageLinksIndex +"-"+tsrtcHomePageLinkName);
    	
    }
   // driver.close();
}
}



/*the number of links in the applications----34
0-eTicket Login
1-ATB/OPR Login
2-Home
3-Bus on Contract
4-Enquiry
5-Cancel Tickets
6-Cancelled Services
7-About Us
8-Tourism
9-Driver Info
10-Hyderabad - Bangalore
11-Bangalore - Hyderabad
12-Hyderabad - Vijayawada
13-Vijayawada - Hyderabad
14-Hyderabad - Chennai
15-Chennai - Hyderabad
16-Hyderabad - Srisailam
17-Srisailam - Hyderabad
18-Hyderabad - Bhadrachalam
19-Bhadrachalam - Hyderabad
20-Hyderabad - Shiridi
21-Shiridi - Hyderabad
22-Hyderabad - Tirupati
23-Tirupati - Hyderabad
24-Hyderabad - Karimnagar
25-Karimnagar - Hyderabad
26-FAQs
27-Privacy Policy
28-Terms & Conditions
29-Contact Us
30-About Us
31-www.tsrtc.telangana.gov.in
32-www.tsrtcparcel.in
33-online.tsrtcpass.in*/

