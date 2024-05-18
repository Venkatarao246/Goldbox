package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LedgerReportsPage {

	@FindBy(xpath ="//span[text()='Ledger reports']")private WebElement LedgerReportsLink;
	
	@FindBy(xpath ="//a[@href='/report/transaction']")private WebElement TransactionReportLink;
	
	public LedgerReportsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLedgerReportsLink() {
		return LedgerReportsLink;
	}

	public WebElement getTransactionReportLink() {
		return TransactionReportLink;
	}
	
	
	public void ClickOnLedgerReports()
	{
		LedgerReportsLink.click();
	}
	
	
	public void ClickOnTransactionReport()
	{
		TransactionReportLink.click();
	}
}
