package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleHomePage {

	WebDriver driver;
	
	@FindBy(linkText = "Gmail") WebElement gmailLink;
	@FindBy(linkText = "Images") WebElement ImagesLink;


	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickGmailLink() {
		gmailLink.click();
	}
	
	public void clickImagesLink() {
		ImagesLink.click();
	}
}
