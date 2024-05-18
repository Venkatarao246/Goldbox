package ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserKycPage {

	@FindBy(xpath = "//a[@href='/users/userkyc']")private WebElement UserKycLink;
	
	@FindBy(xpath = "(//button[text()='View'])[1]")private WebElement AadharViewLink;
	
	@FindBy(xpath = "(//button[@aria-label='Close'])[1]")private WebElement AadharCloseBtn;
	
	@FindBy(xpath = "(//button[text()='View'])[2]")private WebElement PanViewLink;
	
	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")private WebElement PanCloseBtn;
	
	@FindBy(xpath = "//div[@class='mat-mdc-select-arrow ng-tns-c14-2']")private WebElement StatusBtn;
	                 
	@FindBy(xpath = "//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	public UserKycPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserKycLink() {
		return UserKycLink;
	}

	public WebElement getAadharViewLink() {
		return AadharViewLink;
	}

	public WebElement getAadharCloseBtn() {
		return AadharCloseBtn;
	}

	public WebElement getPanViewLink() {
		return PanViewLink;
	}

	public WebElement getPanCloseBtn() {
		return PanCloseBtn;
	}

	public WebElement getStatusBtn() {
		return StatusBtn;
	}

	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public void setSearchEdt(WebElement searchEdt) {
		SearchEdt = searchEdt;
	}
	
	public void userkyc(String name) throws Exception
	{
		UserKycLink.click();
		Thread.sleep(2000);
		AadharViewLink.click();
		Thread.sleep(2000);
		AadharCloseBtn.click();
		Thread.sleep(2000);
		PanViewLink.click();
		Thread.sleep(2000);
		PanCloseBtn.click();
		Thread.sleep(2000);
		StatusBtn.click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		SearchEdt.sendKeys(name);
	}
}
