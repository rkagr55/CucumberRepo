package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.SignInPage;

public class SignInSteps{

	SignInPage signInPage;
	TestContext testContext;
	
	public SignInSteps(TestContext context) {
		testContext = context;
		signInPage = testContext.getPageObjectManager().getSignInPage();
	}
	
	@Then("enter signIn details")
	public void enter_sign_in_details() throws InterruptedException {

		signInPage.enterSignInDetails();
		Thread.sleep(5000);
		//testContext.getWebDriverManager().closeDriver();
	}
	

}


