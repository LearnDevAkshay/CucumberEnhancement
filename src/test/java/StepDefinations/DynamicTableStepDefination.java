package StepDefinations;

import Setup.Base;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.DynamicTableHomePage;


public class DynamicTableStepDefination {
	
	public WebDriver driver;
	public Properties pro ;
	public DynamicTableHomePage dHomePage ;
	

	@Given("^User is on Home Page of Dynamic Table$")
	public void user_is_on_Home_Page_of_Dynamic_Table() throws Throwable {
		pro = new Properties() ;
		FileInputStream  file = new FileInputStream("C:\\Users\\AKSHAY\\eclipse-workspace\\Cucumber_Framework_Design\\src\\test\\java\\Setup\\global.properties") ;
		pro.load(file);
		driver = Base.getWebBrowser() ;
		driver.get(pro.getProperty("dynamicPageUrl"));
		
	}

	@Then("^Get the Details$")
	public void get_the_Details() throws Throwable {
		dHomePage = new DynamicTableHomePage(driver) ;
		
		WebElement table = dHomePage.getTable();
		
		List <WebElement> row = table.findElements(By.tagName("tr")) ;
		
		for(int i=0;i<row.size();i++) {
			
		List <WebElement> col = row.get(i).findElements(By.tagName("td")) ;
		
		for(int j=0;j<col.size();j++) {
			System.out.println("Col Started--" + col.get(j).getText());
		}
		
		
}
}
}
