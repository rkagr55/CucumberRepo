package managers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerClass {

	private WebDriver driver;
	public static WebDriverWait wait;

	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() {    
           driver = createLocalDriver();
		   return driver;
	}


	private WebDriver createLocalDriver() {

		    WebDriverManager.chromedriver().setup();
        	driver = new ChromeDriver();
        	wait = new WebDriverWait(driver,20);
        	return driver;
	}	

	public void closeDriver() {
		driver.close();
		//driver.quit();
	}
}
