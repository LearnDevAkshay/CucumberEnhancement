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
	

}
