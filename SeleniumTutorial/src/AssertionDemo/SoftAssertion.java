package AssertionDemo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void testSoft() {

		SoftAssert assertion= new SoftAssert();
		System.out.println("Soft assert Test 1 started");
		assertion.assertEquals(12, 13, "count doesn't match");
		System.out.println("Soft assert Test 1 completes");
		assertion.assertAll();
	}
	
	
	@Test
	public void testHardAssert() {
		System.out.println("Hard assert Test 1 started");
		Assert.assertEquals(12, 13);
		System.out.println("Hard assert Test 1 completes");
		
	}
	
	
}
