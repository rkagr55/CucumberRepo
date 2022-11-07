package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import pageObjects.Page1;

public class Page1Steps {

	TestContext testContext;
	  Page1 page1;

		public Page1Steps(TestContext context) {
			testContext = context;
			page1 = testContext.getPageObjectManager().getPage1();
		}
		
		
	@Given("^user is on Google Home Page$")
	public void user_is_on_Google_Home_Page(){
		page1.navigateTo_Google();	
	
	}
	
}
