package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before("@RegTest")
	public void beforeHooks() {
		System.out.println("Hook before @RegTest");
	}

	@After("@RegTest")
	public void AfterHooks() {
		System.out.println("Hook after @RegTest");
	}

}
