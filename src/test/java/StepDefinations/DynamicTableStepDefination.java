package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.Base;

public class DynamicTableStepDefination {
	
	WebDriver driver;
	

	@Given("^User is on Home Page of Dynamic Table$")
	public void user_is_on_Home_Page_of_Dynamic_Table() throws Throwable {
		driver  = Base.getWebBrowser() ;
		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
	}

	@Then("^Get the Details$")
	public void get_the_Details() throws Throwable {
		WebElement table = driver.findElement(By.xpath("(//table)[2]"));
		
		List <WebElement> row = table.findElements(By.tagName("tr")) ;
		
		for(int i=0;i<row.size();i++) {
			
		List <WebElement> col = row.get(i).findElements(By.tagName("td")) ;
		
		for(int j=0;j<col.size();j++) {
			System.out.println("Col Started--" + col.get(j).getText());
		}
		
		
}
}
}
