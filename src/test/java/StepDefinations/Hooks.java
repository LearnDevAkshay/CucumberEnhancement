package StepDefinations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Base;

public class Hooks extends Base {

	

	@After
	public void tearDown(Scenario scenario) throws Exception {

		System.out.println("After Scenaio--before Fail Loop");

		if (scenario.isFailed()) {
			
		// String path = Base.getScreenshot(driver, "FailScreenshot") ;
		 //Reporter.addScreenCaptureFromPath(path);

		}

	}
	@Before
	public void setup() throws IOException {
		
	}

}
