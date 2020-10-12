package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExtentReport {

	public String getReportConfigPath() throws IOException{
		 FileReader reader=new FileReader("C:\\Users\\AKSHAY\\eclipse-workspace\\Cucumber_Framework_Design\\configs\\db.properties");  
	      
		    Properties properties=new Properties();  
		    properties.load(reader); 
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	
	

}
}

