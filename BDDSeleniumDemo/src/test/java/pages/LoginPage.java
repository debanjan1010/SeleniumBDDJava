package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(css = "input#user-name")
	public WebElement username;
	
	@FindBy(css = "input#password")
	public WebElement password;
	
	@FindBy(css = "input#login-button")
	public WebElement login_btn;
	

}
