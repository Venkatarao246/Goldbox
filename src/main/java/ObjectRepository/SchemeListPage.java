package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchemeListPage {

	@FindBy(xpath ="//a[@href='/schemes/list']")private WebElement SchemeListLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//h6[@class='btn btn-added']")private WebElement AddSchemeBtn;
	
	@FindBy(xpath ="(//input[@placeholder='Enter Scheme Name'])[1]")private WebElement SchemeNameEdt;
	
	@FindBy(xpath ="(//select[@formcontrolname='country'])[1]")private WebElement CountryEdt;
	
	@FindBy(xpath ="(//select[@formcontrolname='scheme_calculation_type'])[1]")private WebElement CalculationTypeEdt;
	
	@FindBy(xpath ="(//input[@placeholder='Enter Description'])[1]")private  WebElement DescriptionEdt;
	
	@FindBy(xpath ="(//button[text()='Add'])[1]")private WebElement AddBtn;
	
	public SchemeListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSchemeListLink() {
		return SchemeListLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddSchemeBtn() {
		return AddSchemeBtn;
	}

	public WebElement getSchemeNameEdt() {
		return SchemeNameEdt;
	}

	public WebElement getCountryEdt() {
		return CountryEdt;
	}

	public WebElement getCalculationTypeEdt() {
		return CalculationTypeEdt;
	}

	public WebElement getDescriptionEdt() {
		return DescriptionEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	public void ShemesList(String name,String country,String calculationtype,String description,String search) throws Exception
	{
		SchemeListLink.click();
		Thread.sleep(2000);
		AddSchemeBtn.click();
		Thread.sleep(2000);
		SchemeNameEdt.sendKeys(name);
		Thread.sleep(2000);
		CountryEdt.sendKeys(country);
		Thread.sleep(2000);
		CalculationTypeEdt.sendKeys(calculationtype);
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(description);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
