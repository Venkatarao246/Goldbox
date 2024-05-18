package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionReportPage {

	@FindBy(xpath ="//a[@href='/report/transaction']")private WebElement TransactionReportLink;
	
	@FindBy(xpath ="//input[@placeholder='Start date']")private WebElement StartDateEdt;
	
	@FindBy(xpath ="//input[@placeholder='End date']")private WebElement EndDateEdt;
	
	@FindBy(xpath ="//input[@placeholder='Mobile number']")private WebElement MobileNumberEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-filters ms-auto p-2']")private WebElement GetReportBtn;
	
	public TransactionReportPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getTransactionReportLink() {
		return TransactionReportLink;
	}

	public WebElement getStartDateEdt() {
		return StartDateEdt;
	}
	
	public WebElement getEndDateEdt() {
		return EndDateEdt;
	}


	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}

	public WebElement getGetReportBtn() {
		return GetReportBtn;
	}
	
	
	public void TransactionReport(String startdate,String enddate,String mobilenumber) throws Exception
	{
		TransactionReportLink.click();
		Thread.sleep(2000);
		StartDateEdt.sendKeys(startdate);
		Thread.sleep(2000);
		EndDateEdt.sendKeys(enddate);
		MobileNumberEdt.sendKeys(mobilenumber);
		Thread.sleep(2000);
		GetReportBtn.click();
	}
}
