package StepDefinations;

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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Base;

public class SearchStepDefination extends Base{
	WebDriver driver;
	
	

	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		driver = Base.getWebBrowser() ;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 

	}

	@When("^User enter the \"([^\"]*)\" in search box$")
	public void user_enter_the_in_search_box(String vegName) throws Throwable {
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(vegName);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click() ;
		Thread.sleep(1000);
		String path = Base.getScreenshot(driver, "TestScreenShot") ;
		Reporter.addScreenCaptureFromPath(path);

	}

	@Then("^\"([^\"]*)\" result should be dispalyed$")
	public void result_should_be_dispalyed(String expectedName) throws Throwable {
		
		String actualName = driver.findElement(By.cssSelector("h4.product-name")).getText() ;
		System.out.println(actualName + " " + expectedName);
		Assert.assertTrue(actualName.contains(expectedName));
	

		
	}
		
		
		
	  
	}


