package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchHomePage {
	
	
	public WebDriver driver;
	
	public SearchHomePage(WebDriver driver)
	{
		this.driver = driver ;
	}
	
	By searchInputBox = By.xpath("//input[@type=\"search\"]") ;
	By searchButton =   By.xpath("//button[@type=\"submit\"]") ;
	By searchProduct = By.cssSelector("h4.product-name") ;
	
	public WebElement getsearch() {
		
		return driver.findElement(searchInputBox) ;
		
	}
	
	public WebElement ClicksearchButton() {
		
		return driver.findElement(searchButton) ;
	}
	
	public WebElement searchProduct() {
		
		return driver.findElement(searchProduct) ;
	}
	
	

}
