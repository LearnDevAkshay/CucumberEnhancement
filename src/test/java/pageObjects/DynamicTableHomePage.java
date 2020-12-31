package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTableHomePage {
	
public WebDriver driver;
	
		

	public DynamicTableHomePage(WebDriver driver) {
		{
			this.driver = driver ;
		}
	}




	By HomePageTable = By.xpath("(//table)[2]") ;
	
	
	public WebElement getTable() {
		return  driver.findElement(HomePageTable) ;
	}
}
