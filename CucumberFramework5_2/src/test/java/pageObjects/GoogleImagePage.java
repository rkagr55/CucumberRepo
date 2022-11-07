package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleImagePage {
	
	 WebDriver driver;
	
	@FindBy(xpath="//input[@name='q']") WebElement ImageSearchBar;

	public GoogleImagePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterText_ImageSearchBar() {
		ImageSearchBar.sendKeys("acc");
	}



}
