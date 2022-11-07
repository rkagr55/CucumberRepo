package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.*;
import pageObjects.GoogleImagePage;

public class GoogleImageSteps{

	GoogleImagePage imagePage;
	TestContext testContext;
	
	public GoogleImageSteps(TestContext context) {
		testContext = context;
		imagePage = testContext.getPageObjectManager().getGoogleImagePage();
	}
	
	@Then("user enter some data in imagesearch bar")
	public void user_enter_some_data_in_imagesearch_bar() throws InterruptedException {
		
		imagePage.EnterText_ImageSearchBar();
		Thread.sleep(5000);
		//testContext.getWebDriverManager().closeDriver();
	}
}