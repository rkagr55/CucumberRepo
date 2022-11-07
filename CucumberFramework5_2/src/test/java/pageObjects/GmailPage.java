package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPage {
	
	 WebDriver driver;
	
	@FindBy(linkText = "Sign in") WebElement SigninLink;

	public GmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignInLink() {
		SigninLink.click();
	}



}
