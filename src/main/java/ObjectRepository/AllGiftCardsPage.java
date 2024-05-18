package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllGiftCardsPage {

	@FindBy(xpath ="//a[@href='/giftcard/all-gift-cards']")private WebElement AllGiftCardsLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[text()='Add Gift Card']")private WebElement AddGiftCardBtn;
	
	@FindBy(xpath ="//select[@formcontrolname='merchant_id']")private WebElement MerchantEdt;
	
	@FindBy(xpath ="//input[@formcontrolname='amount']")private WebElement AmountEdt;
	
	@FindBy(xpath ="//input[@formcontrolname='key']")private WebElement SecretKeyEdt;
	
	@FindBy(xpath ="//input[@formcontrolname='quantity']")private WebElement QuantityEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
	
	public AllGiftCardsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAllGiftCardsLink() {
		return AllGiftCardsLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddGiftCardBtn() {
		return AddGiftCardBtn;
	}

	public WebElement getMerchantEdt() {
		return MerchantEdt;
	}

	public WebElement getAmountEdt() {
		return AmountEdt;
	}

	public WebElement getSecretKeyEdt() {
		return SecretKeyEdt;
	}

	public WebElement getQuantityEdt() {
		return QuantityEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	public void AllGiftCards(String merchant,String amount,String secretkey,String quantity,String search) throws Exception
	{
		AllGiftCardsLink.click();
		Thread.sleep(2000);
		AddGiftCardBtn.click();
		Thread.sleep(2000);
		MerchantEdt.sendKeys(merchant);
		Thread.sleep(2000);
		AmountEdt.sendKeys(amount);
		Thread.sleep(2000);
		SecretKeyEdt.sendKeys(secretkey);
		Thread.sleep(2000);
		QuantityEdt.sendKeys(quantity);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
