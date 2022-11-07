package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;
import managers.WebDriverManagerClass;

public class Page1 {
	
	WebDriver driver;
	
	public Page1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateTo_Google() {
		driver.get("https://google.com");
		WebDriverManagerClass.wait.until(ExpectedConditions.titleContains("Google"));
		Assert.assertTrue("Google page is launched successfully", driver.getTitle().contains("Google"));
		
	}

}
