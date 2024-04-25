package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginSteps {
	
	private WebDriver driver;
	
	public loginSteps() {
		driver = new ChromeDriver();
	}

	@Given("User has launched the url {string}")
	public void launchURL(String url) {
		driver.get(url);
	}

	@When("User entered following credentials")
	public void enterCredentials(DataTable dataTable) {
		List<Map<String,String>> credentials = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.cssSelector("input#user-name")).sendKeys(credentials.get(0).get("Username"));
		driver.findElement(By.cssSelector("input#password")).sendKeys(credentials.get(0).get("password"));
	}

	@When("User has clicked on the login button")
	public void clickLoginBtn() {
		driver.findElement(By.cssSelector("input#login-button")).click();
	}

	@Then("User should see {string} in homepage")
	public void homePageValidation(String string) {
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed());
		driver.quit();
	}

}
