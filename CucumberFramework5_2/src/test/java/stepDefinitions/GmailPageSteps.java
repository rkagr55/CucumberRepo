package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.GmailPage;

public class GmailPageSteps{
	
	GmailPage gmailPage;
	TestContext testContext;
	
	public GmailPageSteps(TestContext context){
		testContext = context;
		gmailPage = testContext.getPageObjectManager().getGmailPage();
	}
	
	@Then("user click on Sign Link")
	public void user_click_on_sign_link() {
		gmailPage.clickSignInLink();
	}

}
