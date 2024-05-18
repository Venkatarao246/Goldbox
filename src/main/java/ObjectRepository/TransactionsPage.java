package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionsPage {

	@FindBy(xpath ="//span[text()='Transactions']")private WebElement TransactionsLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[text()='Export to Excel']")private WebElement ExportToExcelBtn;
	
	public TransactionsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTransactionsLink() {
		return TransactionsLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getExportToExcelBtn() {
		return ExportToExcelBtn;
	}
	
	
	public void Transactions(String search) throws Exception
	{
		TransactionsLink.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
		Thread.sleep(2000);
		ExportToExcelBtn.click();
	}
}
