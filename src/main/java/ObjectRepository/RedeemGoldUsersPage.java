package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedeemGoldUsersPage {

	@FindBy(xpath ="//a[@href='/users/redeem-users']")private WebElement RedeemGoldUsersLink;
	
	@FindBy(xpath = "(//button[text()='View'])[1]")private WebElement ActionViewLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath = "//button[text()='Export to Excel']")private WebElement ExportToExcelBtn;
	
	public RedeemGoldUsersPage(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getRedeemGoldUsersLink() {
		return RedeemGoldUsersLink;
	}

	public WebElement getActionViewLink() {
		return ActionViewLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getExportToExcelBtn() {
		return ExportToExcelBtn;
	}	
	
	public void RedeemGoldUsers(String search) throws Exception
	{
		RedeemGoldUsersLink.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
		Thread.sleep(2000);
		ExportToExcelBtn.click();
		Thread.sleep(2000);
		ActionViewLink.click();	
	}
}
