package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	@FindBy(xpath = "//span[text()='Users']")private WebElement UsersLink;
	
	@FindBy(xpath = "//a[@href='/users/users-list']")private WebElement UserListLink;
	
	@FindBy(xpath = "//a[@href='/users/userkyc']")private WebElement UserKycLink;
	
	@FindBy(xpath = "//a[@href='/users/redeem-users']")private WebElement RedeemGoldUsersLink;
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsersLink() {
		return UsersLink;
	}

	public WebElement getUserListLink() {
		return UserListLink;
	}

	public WebElement getUserKycLink() {
		return UserKycLink;
	}

	public WebElement getRedeemGoldUsersLink() {
		return RedeemGoldUsersLink;
	}
	
	
	public void Users() throws Exception
	{
		UsersLink.click();
		Thread.sleep(2000);
		UserListLink.click();
		Thread.sleep(2000);
		UserKycLink.click();
		Thread.sleep(2000);
		RedeemGoldUsersLink.click();
	}
	
	public void ClickOnUsers()
	{
		UsersLink.click();
	}
	
	public void ClickOnUsersList()
	{
		UserListLink.click();
	}
	
	public void ClickOnUserKyc()
	{
		UserKycLink.click();
	}
	
	public void ClickOnRedeemGoldUsers()
	{
		RedeemGoldUsersLink.click();
	}
}
