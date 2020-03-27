package HashMapConceptInSelenium;

import java.util.HashMap;
import java.util.Hashtable;

public class Data {
	
	
	/*
	 * Interview Question--> where have you used HashMap in your peoject
	 * Supposer I have application where there are multiple Username and Password with which i need to login to App
	 * So, I will create Credentials HashMap and maintails username and Password with Key and Value pair format
	 * and i will pass the vlues from hashmap
	 */
	
	
	/* Customer user ----> Buy , Place orfer
	 * Admin User ---> Can see all orfer
	 * Seller User -----> See those item which are relevent s 
	 */
	public HashMap<String, String> userData() {
		
		HashMap <String, String> UserMap = new HashMap<String, String>();
		UserMap.put("Customer", "naveenk_test@123" );
		UserMap.put("Admin", "adminuser_test@123");
		
		return UserMap;
		
	}
	
	public void monthMap() {
		
		Hashtable<Integer, String> monthMap = new Hashtable<Integer, String>();
		monthMap.put(1, "January");
		monthMap.put(2, "February");
		monthMap.put(3, "March");
		monthMap.put(4, "April");
		monthMap.put(5, "May");
		monthMap.put(6, "June");
		monthMap.put(7, "July");
		monthMap.put(8, "August");
		monthMap.put(9, "September");
		monthMap.put(10, "October");
		monthMap.put(11, "November");
		monthMap.put(12, "December");
		
	}
	
	
	

}
