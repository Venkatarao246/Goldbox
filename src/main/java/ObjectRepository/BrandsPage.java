package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandsPage {

	@FindBy(xpath ="//a[@href='/ecommerce/brands']")private WebElement BrandsLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddBrandBtn;
	
	@FindBy(xpath ="(//input[@formcontrolname='name'])[1]")private WebElement BrandNameEdt;
	
	@FindBy(xpath ="//input[@accept='image/jpeg, image/png, image/gif']")private WebElement UploadImageEdt;
	
	@FindBy(xpath ="(//button[@class='add-btn'])[1]")private WebElement AddBtn;
	
	public BrandsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getBrandsLink() {
		return BrandsLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddBrandBtn() {
		return AddBrandBtn;
	}

	public WebElement getBrandNameEdt() {
		return BrandNameEdt;
	}

	public WebElement getUploadImageEdt() {
		return UploadImageEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	public void Brands(String brandname,String uploadimage,String search) throws Exception
	{
		BrandsLink.click();
		Thread.sleep(2000);
		AddBrandBtn.click();
		Thread.sleep(2000);
		BrandNameEdt.sendKeys(brandname);
		Thread.sleep(2000);
		UploadImageEdt.sendKeys(uploadimage);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
