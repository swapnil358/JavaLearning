package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/features", 
			glue = "stepDefinations",
			tags="@RegTest,@SmokeTest",	 strict=true, monochrome=true, //dryRun=true,			//dryRun--Check the mapping of feature file with stefDefination and vicevarsa
			plugin= {"pretty","html:target/cucumber",					//monochrome -- Neat and clean console o/p
							  "json:target/cucumber.json",
	   						  "junit:target/cukes.xml"})			//pretty--defines proper color
	public class TestRunner {									//html--defines html format report--default cucumber report

	}

