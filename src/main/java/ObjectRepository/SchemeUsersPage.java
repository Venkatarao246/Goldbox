package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchemeUsersPage {

	@FindBy(xpath ="//a[@href='/schemes/users']")private WebElement SchemeUsersLink;
	
	@FindBy(xpath ="(//button[text()=' Info '])[1]")private WebElement InfoLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	public SchemeUsersPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSchemeUsersLink() {
		return SchemeUsersLink;
	}

	public WebElement getInfoLink() {
		return InfoLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}
	
	public void SchemeUsers(String search) throws Exception
	{
		SchemeUsersLink.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
		Thread.sleep(2000);
		InfoLink.click();
	}
}
