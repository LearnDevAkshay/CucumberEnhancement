package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.ExcelReadWrite;

public class ExcelReadWriteCheckStepDefination {
	
	@Given("^Setup the excel$")
	public void setup_the_excel() throws Throwable {
	   ExcelReadWrite.setupExcel(); 
	   System.out.println("----------------Setup The Excel-----------------------------");
	}

	@Then("^read the value$")
	public void read_the_value() throws Throwable {
		System.out.println("Return Value--- " + ExcelReadWrite.getValue("S1", 1, 1)) ;
	   
	}

}
