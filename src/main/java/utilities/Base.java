package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	static WebDriver driver ;
	
public static WebDriver getWebBrowser() {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\Chrome\\chromedriver.exe");

	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");

	driver = new ChromeDriver(options);
	return driver;
	
}
}
