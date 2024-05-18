package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@id='email']")private WebElement EmailEdt;
	
	@FindBy(xpath = "//input[@id='password']")private WebElement PasswordEdt;
	
	@FindBy(xpath = "//button[text()=' Sign In ']")private WebElement SignInBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailEdt() {
		return EmailEdt;
	}

	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}

	public WebElement getSignInBtn() {
		return SignInBtn;
	}
	
	
	public void loginToApplication(String Email, String Password) throws Exception
	{
		EmailEdt.sendKeys(Email);
		Thread.sleep(2000);
		PasswordEdt.sendKeys(Password);
		Thread.sleep(2000);
		SignInBtn.click();
	}
	
}
