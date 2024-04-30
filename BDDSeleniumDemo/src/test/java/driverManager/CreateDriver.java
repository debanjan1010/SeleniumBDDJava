package driverManager;

import org.openqa.selenium.WebDriver;

public class CreateDriver {
	
	private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private static CreateDriver INSTANCE;
	
	private CreateDriver() {
		
	}
	
	public static synchronized CreateDriver getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new CreateDriver();
		}
		
		return INSTANCE;
	}
	
	public void setDriver(String browser) {
//		switch (browser.toLowerCase()) {
//		case "chrome":
//			driver = new ChromeDriver();
//			break;
//			
//		case "firefox":
//			driver = new FirefoxDriver();
//			break;
//
//		default:
//			break;
//		}
//		
		driver.set(DriverManager.getBrowserManager(browser).getDriver());
	}
	
	public WebDriver getDriver() {
		return driver.get();
	}
	

}
