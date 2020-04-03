package AssertionDemo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void testSoft() {

		SoftAssert assertion= new SoftAssert();   //Soft asset doesn't halt the execution even though exception occurred
		System.out.println("Soft assert Test 1 started");
		assertion.assertEquals(12, 13, "count doesn't match");
		System.out.println("Soft assert Test 1 completes");
		assertion.assertAll();
	}
	
	
	@Test
	public void testHardAssert() {    //Hard assert halt the execution if exception occurred
		System.out.println("Hard assert Test 1 started");
		Assert.assertEquals(12, 13);
		System.out.println("Hard assert Test 1 completes");
		
	}
	
	
}
