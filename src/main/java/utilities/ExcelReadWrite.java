package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExcelReadWrite {
	
	
	static Workbook workbook ;
	
	
	public static void setupExcel() throws IOException {
		
		System.out.println("Inside Setup----------------Before Loop");
		
		File file = new File("C:\\Users\\AKSHAY\\eclipse-workspace\\Cucumber_Framework_Design\\TestData\\TestData.xlsx");
		
		FileInputStream fileinput = new FileInputStream(file);
		
		workbook = new XSSFWorkbook(fileinput);		
		
		System.out.println("Inside Setup----------------After Loop");
			
	}
	
	
	public static String getValue(String sheetName , int row, int col) {
			
		Sheet sh = workbook.getSheet("S1") ;
		
		String value = sh.getRow(row).getCell(col).getStringCellValue() ;
		
		System.out.println("Value Fetched" + value);
		
		return value;
		
	}
	

}
