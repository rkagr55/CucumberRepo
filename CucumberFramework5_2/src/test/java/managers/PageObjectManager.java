package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.GmailPage;
import pageObjects.GoogleHomePage;
import pageObjects.GoogleImagePage;
import pageObjects.Page1;
import pageObjects.SignInPage;

public class PageObjectManager {

	private WebDriver driver;
	private Page1 page1;
	private GoogleHomePage googleHomePage;
	private GoogleImagePage googleImagesPage;
	private SignInPage signInPage;
	private GmailPage gmailPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public Page1 getPage1(){
		return (page1 == null) ? page1 = new Page1(driver) : page1;
	}
	
	public GoogleHomePage getGoogleHomePage(){
		return (googleHomePage == null) ? googleHomePage = new GoogleHomePage(driver) : googleHomePage;
	}
	
	public GoogleImagePage getGoogleImagePage(){
		return (googleImagesPage == null) ? googleImagesPage = new GoogleImagePage(driver) : googleImagesPage;
	}
	
	public GmailPage getGmailPage(){
		return (gmailPage == null) ? gmailPage = new GmailPage(driver) : gmailPage;
	}
	
	public SignInPage getSignInPage(){
		return (signInPage == null) ? signInPage = new SignInPage(driver) : signInPage;
	}
	
	

}
