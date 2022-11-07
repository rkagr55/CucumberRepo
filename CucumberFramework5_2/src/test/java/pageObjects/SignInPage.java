package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {
	
	WebDriver driver;
	
@FindBy(xpath = "//*[@id=\"identifierId\"]") WebElement SignIn_InputBox;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterSignInDetails() {
		SignIn_InputBox.sendKeys("rkagr55");
	}



}
