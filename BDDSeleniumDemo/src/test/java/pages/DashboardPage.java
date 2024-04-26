package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//span[text()='Products']")
	public WebElement products;
	
	@FindBy(xpath = "//div[text()='Swag Labs']")
	public WebElement swagLabs;

}
