package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtpListPage {

	@FindBy(xpath ="//a[@href='/otp']")private WebElement OtpListLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	public OtpListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOtpListLink() {
		return OtpListLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}	
	
	
	public void otpList(String search) throws Exception
	{
		OtpListLink.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
