package Base_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import XXLoperations.driver;

public class webtable_firstRowofFirstCell extends Base_Test_problem {
	public void firstrowoffirstcelltest()
	{
		for(int index=1;index<=36;index++)
		{
		By citynamelocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
		
		//FileInputStream testdatafile=new FileInputStream()
		WebElement cityname=driver.findElement(citynamelocator);
		String citynametext=cityname.getText();
		System.out.println(index+"-->"+citynametext);
		}
		
	}
	public static void main(String[] args) {
		webtable_firstRowofFirstCell firstRowofFirstCell =  new webtable_firstRowofFirstCell();
		
		firstRowofFirstCell.setup();
		firstRowofFirstCell.firstrowoffirstcelltest();
		firstRowofFirstCell.teardown();
		
	}
}