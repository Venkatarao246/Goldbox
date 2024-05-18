package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomTransactionsPage {

	@FindBy(xpath ="//a[@href='/ecommerce/ecom-transactions']")private WebElement EcomTransactionsLink;
	
	@FindBy(xpath ="//input[@placeholder='Search']")private WebElement SearchEdt;
	
	public EcomTransactionsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEcomTransactionsLink() {
		return EcomTransactionsLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}
	
	public void EcomTransactions(String search) throws Exception
	{
		EcomTransactionsLink.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
