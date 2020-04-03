package SeleniumCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	//How to read excel file
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("C:/Users/n/Desktop/SeleniumInterviewStuffs/Questions.xlsx");  //fetch the file
		
		XSSFWorkbook workbook  = new XSSFWorkbook(fs);  //read file .xlsx hence XSSFWorkbook
														//XSSF ----   .xlsx
														//HSSF ----	  .Xls
		XSSFSheet sheet = workbook.getSheetAt(0); //Read the file at 0 location 
		
		XSSFRow  row = sheet.getRow(0); //read Row 0
		
		XSSFCell cell = row.getCell(0); //read Column 0
		
		System.out.println(cell);
		System.out.println(sheet.getRow(2).getCell(1));
		
		
		
		
		
	}
	
	

}
