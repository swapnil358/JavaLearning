package MyRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions

		(features = {"\\FreeCrmBDDFrameworkTestNG\\src\\main\\java\\Features\\loginTest.feature"}, 
		glue = {"stepDefinitions"}, 
		tags = { "~@Ignore" }, 
		format = { "pretty",
				 "html:target/cucumber-reports/cucumber-pretty",
				 "json:target/cucumber-reports/CucumberTestReport.json",
				 "return:target/cucumber-reports/rerun.txt" }, 
		plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {

	private TestNGCucumberRunner TestNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception{
		TestNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		TestNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return TestNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun=true)
	public void tearDownClass() throws Exception{
		TestNGCucumberRunner.finish();
	}
}