package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TradingPage {

    @FindBy(xpath ="//span[text()='Trading']")private WebElement TradingLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[text()='Export to Excel']")private WebElement ExportToExcelBtn;
	
	public TradingPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTradingLink() {
		return TradingLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getExportToExcelBtn() {
		return ExportToExcelBtn;
	}
	
	
	public void Trading(String search) throws Exception
	{
		TradingLink.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
		Thread.sleep(2000);
		ExportToExcelBtn.click();
	}
}
