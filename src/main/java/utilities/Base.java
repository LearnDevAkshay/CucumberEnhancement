package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.cucumber.listener.Reporter;

public class Base {

	static WebDriver driver;
	public ExtentReports extent;
	public ExtentTest logger;

	public static WebDriver getWebBrowser() {
		System.setProperty("webdriver.chrome.driver", "Webdriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		driver = new ChromeDriver(options);
		return driver;

	}

	@After
	public void tearDown(Scenario scenario) {
		
		

	}

	@BeforeClass
	public void writeExtentReport() throws IOException {
		FileReader reader = new FileReader("$BASE_DIR\\configs\\Configuration.properties");

		Properties properties = new Properties();
		properties.load(reader);
		String reportConfigPath = properties.getProperty("reportConfigPath");
		Reporter.loadXMLConfig(reportConfigPath);
		Reporter.setSystemInfo("User Name", "AJ");
		Reporter.setSystemInfo("Application Name", "Test App ");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}

	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		// below line is just to append the date format with the screenshot name to
		// avoid duplicate names
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		// Returns the captured file path
		return destination;
	}
}
