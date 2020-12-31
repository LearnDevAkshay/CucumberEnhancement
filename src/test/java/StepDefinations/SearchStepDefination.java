package StepDefinations;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cucumber.listener.Reporter;

import Setup.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SearchHomePage;


public class SearchStepDefination {
	WebDriver driver;
	public Properties pro ;
	public SearchHomePage SHomePage ;
	

	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		pro = new Properties() ;
		FileInputStream  file = new FileInputStream("C:\\Users\\AKSHAY\\eclipse-workspace\\Cucumber_Framework_Design\\src\\test\\java\\Setup\\global.properties") ;
		pro.load(file);
		driver = Base.getWebBrowser() ;
		driver.get(pro.getProperty("SearchPageUrl"));
		 

	}

	@When("^User enter the \"([^\"]*)\" in search box$")
	public void user_enter_the_in_search_box(String vegName) throws Throwable {
		SHomePage = new SearchHomePage(driver) ;
		SHomePage.getsearch().sendKeys(vegName);
		SHomePage.ClicksearchButton().click() ;
		Thread.sleep(1000);
		String path = Base.getScreenshot(driver, "TestScreenShot") ;
		Reporter.addScreenCaptureFromPath(path);

	}

	@Then("^\"([^\"]*)\" result should be dispalyed$")
	public void result_should_be_dispalyed(String expectedName) throws Throwable {
		
		String actualName = SHomePage.searchProduct().getText() ;
		System.out.println(actualName + " " + expectedName);
		Assert.assertTrue(actualName.contains(expectedName));
	

		
	}
		
		
		
	  
	}


