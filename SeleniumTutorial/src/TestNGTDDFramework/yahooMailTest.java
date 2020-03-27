package TestNGTDDFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class yahooMailTest {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch browser");
	}
	
	
	
	@BeforeMethod
	public void loginApp() {
		System.out.println("login to App");
	}
	
	
	@Test
	public void composeMailTest() {
		System.out.println("compose mail test");
	}
	
	@Test
	public void deleteMail() {
		System.out.println("delete mail test");
	}
	
	
	
	@AfterMethod
	public void logoutApp() {
		System.out.println("logout from App");
	}
	
	
	@AfterClass
	public void closeBroswer() {
		System.out.println("close broswer");
	}
	

}
