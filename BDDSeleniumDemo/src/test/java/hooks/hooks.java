package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import driverManager.CreateDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class hooks {
	
	public WebDriver driver;
	
	@Before(value = "@Chrome")
	public void chromeSetUp(Scenario scenario) {
		System.out.println("I am in before scenario");
		//Singleton design
		CreateDriver.getInstance().setDriver("firefox");
		driver = CreateDriver.getInstance().getDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Before(value = "@Firefox")
	public void firefoxSetUp(Scenario scenario) {
		System.out.println("I am in before scenario");
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("I am in after scenario");
		driver.quit();
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("I am in before step");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("I am in after step");
		
	}

}
