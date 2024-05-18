package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentManagementPage {

	@FindBy(xpath ="//a[@href='/payment-management']")private WebElement PaymentManagementLink;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddPaymentMethodBtn;
	
	@FindBy(xpath ="//input[@formcontrolname='title']")private WebElement TitleEdt;
	
	@FindBy(xpath ="(//div[@class='mdc-switch__icons'])[3]")private WebElement DefaultAppStatusBootstrapBtn;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
	@FindBy(xpath ="(//div[@class='mdc-switch__ripple'])[1]")private WebElement PaymentStatusBootstrapBtn;
	
	public PaymentManagementPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPaymentManagementLink() {
		return PaymentManagementLink;
	}

	public WebElement getAddPaymentMethodBtn() {
		return AddPaymentMethodBtn;
	}

	public WebElement getTitleEdt() {
		return TitleEdt;
	}

	public WebElement getDefaultAppStatusBootstrapBtn() {
		return DefaultAppStatusBootstrapBtn;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getPaymentStatusBootstrapBtn() {
		return PaymentStatusBootstrapBtn;
	}
	
	
	public void PaymentManagement(String title) throws Exception
	{
		PaymentManagementLink.click();
		Thread.sleep(2000);
		AddPaymentMethodBtn.click();
		Thread.sleep(2000);
		TitleEdt.sendKeys(title);
		Thread.sleep(2000);
		DefaultAppStatusBootstrapBtn.click();
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		PaymentStatusBootstrapBtn.click();
	}
}
