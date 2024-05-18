package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppManagementPage {

	@FindBy(xpath ="//a[@href='/app-management']")private WebElement AppManagementLink;
	
	@FindBy(xpath ="(//div[@class='mdc-switch__icons'])[1]")private WebElement BootstrapBtn;
	
	public AppManagementPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAppManagementLink() {
		return AppManagementLink;
	}

	public WebElement getBootstrapBtn() {
		return BootstrapBtn;
	}
	
	
	public void AppManagement() throws Exception
	{
		AppManagementLink.click();
		Thread.sleep(2000);
		BootstrapBtn.click();
	}
}
