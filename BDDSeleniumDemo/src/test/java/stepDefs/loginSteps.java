package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverManager.CreateDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.LoginPage;

public class loginSteps {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	
	
	public loginSteps() {
		driver = CreateDriver.getInstance().getDriver();
		driver.manage().window().maximize();
	}

	@Given("User has launched the url {string}")
	public void launchURL(String url) {
		driver.get(url);
	}

	@When("User entered following credentials")
	public void enterCredentials(DataTable dataTable) {
		List<Map<String,String>> credentials = dataTable.asMaps(String.class, String.class);
		
		loginPage = new LoginPage(driver);
		loginPage.username.sendKeys(credentials.get(0).get("Username"));
		loginPage.password.sendKeys(credentials.get(0).get("password"));
	}
	
	@When("User entered {string} and {string}")
	public void enterCredentials(String username, String password) {
		loginPage = new LoginPage(driver);
		loginPage.username.sendKeys(username);
		loginPage.password.sendKeys(password);
	}


	@When("User has clicked on the login button")
	public void clickLoginBtn() {
		loginPage = new LoginPage(driver);
		loginPage.login_btn.click();
	}

	@Then("User should see {string} in homepage")
	public void homePageValidation(String string) {
		
		dashboardPage = new DashboardPage(driver);
		
		if(string.equals("Products")) {
			Assert.assertTrue(dashboardPage.products.isDisplayed());
		} else {
			Assert.assertTrue(dashboardPage.swagLabs.isDisplayed());
		}
	}
	

}
