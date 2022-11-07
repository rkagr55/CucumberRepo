package utils;

import org.openqa.selenium.*;
import io.cucumber.java.Scenario;

public class Utility{

	public static void getScreenshot(WebDriver driver, Scenario sc) {
		
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    sc.attach(screenshot, "image/png", "Screenshot attached");
	}
}