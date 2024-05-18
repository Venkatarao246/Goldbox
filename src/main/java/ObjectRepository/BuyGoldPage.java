package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyGoldPage {

	@FindBy(xpath ="//a[@href='/schemes/buygold']")private WebElement BuyGoldLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddContentBtn;
	
	@FindBy(xpath ="(//select[@formcontrolname='wallet_type'])[1]")private WebElement ContentTypeEdt;
	
	@FindBy(xpath ="(//textarea[@formcontrolname='content'])[1]")private WebElement ContentEdt;
	
	@FindBy(xpath ="(//textarea[@formcontrolname='explanation'])[1]")private WebElement ExplanationEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
	
	public BuyGoldPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getBuyGoldLink() {
		return BuyGoldLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddContentBtn() {
		return AddContentBtn;
	}

	public WebElement getContentTypeEdt() {
		return ContentTypeEdt;
	}

	public WebElement getContentEdt() {
		return ContentEdt;
	}

	public WebElement getExplanationEdt() {
		return ExplanationEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}	
	
	public void BuyGold(String contenttype,String content,String explanation,String search) throws Exception
	{
		BuyGoldLink.click();
		Thread.sleep(2000);
		AddContentBtn.click();
		Thread.sleep(2000);
		ContentTypeEdt.sendKeys(contenttype);
		Thread.sleep(2000);
		ContentEdt.sendKeys(content);
		Thread.sleep(2000);
		ExplanationEdt.sendKeys(explanation);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
