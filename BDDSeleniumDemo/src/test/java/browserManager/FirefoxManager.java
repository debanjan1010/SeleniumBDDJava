package browserManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxManager implements BrowserManager{

	@Override
	public WebDriver getDriver() {
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
