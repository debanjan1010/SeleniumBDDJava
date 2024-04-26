package driverManager;

import browserManager.BrowserManager;
import browserManager.ChromeManager;
import browserManager.FirefoxManager;

public class DriverManager {

	public static BrowserManager getBrowserManager(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			return new ChromeManager();

		case "firefox":
			return new FirefoxManager();

		default:
			throw new IllegalArgumentException("no valid browser type");

		}
	}

}
