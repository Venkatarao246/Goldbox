package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchemesPage {

	@FindBy(xpath ="//span[text()='Schemes']")private WebElement SchemesLink;
	
	@FindBy(xpath ="//a[@href='/schemes/list']")private WebElement SchemeListLink;
	
	@FindBy(xpath ="//a[@href='/schemes/users']")private WebElement SchemeUsersLink;
	
	@FindBy(xpath ="//a[@href='/schemes/buygold']")private WebElement BuyGoldLink;
	
	public SchemesPage (WebDriver driver)  
	
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSchemesLink() {
		return SchemesLink;
	}

	public WebElement getSchemeListLink() {
		return SchemeListLink;
	}

	public WebElement getSchemeUsersLink() {
		return SchemeUsersLink;
	}

	public WebElement getBuyGoldLink() {
		return BuyGoldLink;
	}
	
	public void Schemes() throws Exception
	{
		SchemesLink.click();
		Thread.sleep(2000);
		SchemeListLink.click();
		Thread.sleep(2000);
		SchemeUsersLink.click();
		Thread.sleep(2000);
		BuyGoldLink.click();
	}
	
	public void ClickOnSchemes()
	{
		SchemesLink.click();
	}
	
	public void ClickOnSchemeList()
	{
		SchemeListLink.click();
	}
	
	public void ClickOnSchemeUsers()
	{
		SchemeUsersLink.click();
	}
	
	public void ClickOnBuyGold()
	{
		BuyGoldLink.click();
	}
}
