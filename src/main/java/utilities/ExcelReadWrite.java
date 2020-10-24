package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public void readExcel() throws IOException {

		// Create an object of File class to open xlsx file

		File file = new File(
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Cucumber_Framework_Design\\TestData\\TestData.xlsx");

		// Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook guru99Workbook = null;

		// Find the file extension by splitting file name in substring and getting only
		// extension name

		// Check condition if the file is xlsx file

		// If it is xlsx file then create object of XSSFWorkbook class

		guru99Workbook = new XSSFWorkbook(inputStream);

		Sheet guru99Sheet = guru99Workbook.getSheet("S1");

		// Find number of rows in excel file

		int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();

		// Create a loop over all the rows of excel file to read it

		Row row = guru99Sheet.getRow(1);
		
		 DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
		 

		Cell value = row.getCell(1);
		
		 String j_username = formatter.formatCellValue(value);

	}

	// Main function is calling readExcel function to read data from excel file

	public static void main(String str[]) throws IOException {

		// Create an object of ReadGuru99ExcelFile class
		System.out.println("Inside Main Class1");
		System.out.println("Inside Main Class2");
		System.out.println("Inside Main Class3");
		System.out.println("Inside Main Class4");

		ExcelReadWrite objExcelFile = new ExcelReadWrite();

		objExcelFile.readExcel();

	}

}
