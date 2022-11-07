package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.Utility;


public class Hooks {
	
	TestContext testContext;
	
	public Hooks(TestContext context) {
		testContext = context;
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		Utility.getScreenshot(testContext.getWebDriverManager().getDriver(), scenario);
	}
	
	
	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}

}