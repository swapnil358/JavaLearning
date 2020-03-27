/*
 * package com.datadriven.test;
 * 
 * import java.util.ArrayList;
 * 
 * public class TestUtil {
 * 
 * Xls_Reader reader;
 * 
 * 
 * 
 * public ArrayList<Object[]> getDataFromExcel() {
 * 
									 *To read XLS files, an HSSF implementation is provided by POI library.
									
									To read XLSX, XSSF implementation of POI library  
 *
 * 
		 * ArrayList<Object[]> myData = new ArrayList<Object[]>();
		 * 
		 * try { 
		 * 
		 * Xls_Reader reader = new Xls_Reader ("D:\\HalfEbayTestData.xlsx");
		 * 
		 * 
		 * 
		 * }catch (Exception e) {
		 * 
		 *  e.printStackTrace(); 
		 *  
		 *  }
		 * 
		 * 
		 * for(int i=2; i<=reader.getRowCount("RegTestData"); rowNum++) {
		 * 
		 * 
		 * String firstName=reader.getCellData("RegTestData", "firstname", rowNum);
		 * String lastname=reader.getCellData("RegTestData", "lastname", rowNum);
		 * String address1=reader.getCellData("RegTestData", "address1", rowNum);
		 * String address2=reader.getCellData("RegTestData", "address2", rowNum);
		 * String city=reader.getCellData("RegTestData", "city", rowNum);
		 * String zipcode=reader.getCellData("RegTestData", "zipcode", rowNum);
		 * String emailadddress=reader.getCellData("RegTestData", "emailaddress", rowNum);
 * 
 * }
 * 
 * return myData;
 * 
 * 
 * } 
 */