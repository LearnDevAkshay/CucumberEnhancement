package cucumberOptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;


@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features",
glue="StepDefinations",
dryRun=false,
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}
        )


public class TestRunner {
	@AfterClass
    public static void writeExtentReport() throws IOException {
		FileReader reader=new FileReader("$BASE_DIR\\configs\\Configuration.properties");
		 
		 Properties properties=new Properties(); 
		 properties.load(reader);
		 String reportConfigPath = properties.getProperty("reportConfigPath");
		
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", "AJ");
        Reporter.setSystemInfo("Application Name", "Test App ");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }

}
