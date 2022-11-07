package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GoogleHomePage;

public class GoogleHomePageSteps {
	

	TestContext testContext;
	GoogleHomePage googleHomePage;
	public GoogleHomePageSteps(TestContext context){
		testContext = context;
		 googleHomePage = testContext.getPageObjectManager().getGoogleHomePage();
	}
	
	@Then("user click on Images Link")
	public void user_click_on_images_link() {
		googleHomePage.clickImagesLink();
	}
		
	@When("user click on Gmail Link")
	public void user_click_on_gmail_link() {

		googleHomePage.clickGmailLink();
	}

}
