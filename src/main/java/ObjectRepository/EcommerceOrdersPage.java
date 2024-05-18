package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommerceOrdersPage {

	@FindBy(xpath ="//a[@href='/ecommerce/ecommerce-orders']")private WebElement EcommerceOrdersLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="(//button[@type='button'])[1]")private WebElement ViewBtn;
	
	@FindBy(xpath ="(//button[@class='btn-close'])[9]")private WebElement ViewCloseBtn;
	
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit mr-2'])[1]")private WebElement StatusBtn;
	
	@FindBy(xpath ="(//button[@aria-label='Close'])[1]")private WebElement StatusCloseBtn;
	
	@FindBy(xpath ="//button[text()='Export to Excel']")private WebElement ExportToExcelBtn;
	
	public EcommerceOrdersPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEcommerceOrdersLink() {
		return EcommerceOrdersLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getViewBtn() {
		return ViewBtn;
	}

	public WebElement getViewCloseBtn() {
		return ViewCloseBtn;
	}

	public WebElement getStatusBtn() {
		return StatusBtn;
	}

	public WebElement getStatusCloseBtn() {
		return StatusCloseBtn;
	}

	public WebElement getExportToExcelBtn() {
		return ExportToExcelBtn;
	}
	
	public void EcommerceOrders(String search) throws Exception
	{
		EcommerceOrdersLink.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
		Thread.sleep(2000);
		ViewBtn.click();
		Thread.sleep(2000);
		ViewCloseBtn.click();
		Thread.sleep(2000);
		StatusBtn.click();
		Thread.sleep(2000);
		StatusCloseBtn.click();
		Thread.sleep(2000);
		ExportToExcelBtn.click();
	}
}
