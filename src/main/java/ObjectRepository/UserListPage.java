package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {

	@FindBy(xpath = "//a[@href='/users/users-list']")private WebElement UserListLink;
	
	@FindBy(xpath = "//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath = "(//button[text()='Info'])[1]")private WebElement InfoLink;
	
	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserListLink() {
		return UserListLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getInfoLink() {
		return InfoLink;
	}
	
	public void UserList(String name) throws Exception
	{
		UserListLink.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(name);
		Thread.sleep(2000);
		InfoLink.click();
	}
}
