package cucumberOptions;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;


@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features",
glue="StepDefinations",
dryRun=false,
tags = {"@smokeTest"},
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}
        )


public class TestRunner {


	@BeforeClass
	public static void writeExtentReport() throws IOException {

		System.out.println("Before Class");
		
	
}
	@AfterClass
	public static void tearDown() throws IOException {
		System.out.println("After Class");
		FileReader reader = new FileReader("C:\\Users\\AKSHAY\\eclipse-workspace\\Cucumber_Framework_Design\\configs\\Configuration.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String reportConfigPath = properties.getProperty("reportConfigPath");
		Reporter.loadXMLConfig(reportConfigPath);
		Reporter.setSystemInfo("User Name", "Akshay");
		Reporter.setSystemInfo("Application Name", "Cucumber Framework");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "QA");
		Reporter.setTestRunnerOutput("Report in HTML Format");
		System.out.println("End After Class");
	}
}
