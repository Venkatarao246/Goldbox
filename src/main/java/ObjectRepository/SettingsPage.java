package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	@FindBy(xpath ="//span[text()='Settings']")private WebElement SettingsLink;
	
	@FindBy(xpath ="//a[@href='/otp']")private WebElement OtpListLink;
	
	@FindBy(xpath ="//a[@href='/app-management']")private WebElement AppManagementLink;
	
	@FindBy(xpath ="//a[@href='/payment-management']")private WebElement PaymentManagementLink;
	
	@FindBy(xpath ="//a[@href='/roles']")private WebElement RolesLink;
	
	@FindBy(xpath ="//a[@href='/fms-users']")private WebElement FmsUsersLink;
	
	public SettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSettingsLink() {
		return SettingsLink;
	}

	public WebElement getOtpListLink() {
		return OtpListLink;
	}

	public WebElement getAppManagementLink() {
		return AppManagementLink;
	}

	public WebElement getPaymentManagementLink() {
		return PaymentManagementLink;
	}

	public WebElement getRolesLink() {
		return RolesLink;
	}

	public WebElement getFmsUsersLink() {
		return FmsUsersLink;
	}
	
	
	public void ClickOnSettings()
	{
		SettingsLink.click();
	}
	
	public void ClickOnOtpList()
	{
		OtpListLink.click();
	}
	
	public void ClickOnAppManagement()
	{
		AppManagementLink.click();
	}
	
	public void ClickOnPaymentManagement()
	{
		PaymentManagementLink.click();
	}
	
	public void ClickOnRoles()
	{
		RolesLink.click();
	}
	
	public void ClickOnFmsUsers()
	{
		FmsUsersLink.click();
	}
}
