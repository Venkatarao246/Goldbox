package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	@FindBy(xpath ="//a[@href='/ecommerce/products']")private WebElement ProductsLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddProductsBtn;
	
	@FindBy(xpath ="(//select[@formcontrolname='categoryname'])[1]")private WebElement CategoryNameEdt;
	
	@FindBy(xpath ="(//select[@formcontrolname='subcategoryname'])[1]")private WebElement SubCategoryNameEdt;
	
	@FindBy(xpath ="(//select[@formcontrolname='brandname'])[1]")private WebElement BrandNameEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='productname'])[1]")private WebElement ProductNameEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='va'])[1]")private WebElement EnterVaEdt;
	
	@FindBy(xpath ="(//select[@formcontrolname='carat'])[1]")private WebElement SelectCaratEdt;
	
	@FindBy(xpath ="(//select[@formcontrolname='type'])[1]")private WebElement SelectTypeEdt;
	
	@FindBy(xpath ="(//select[@formcontrolname='isshown'])[1]")private WebElement IsshownEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='price'])[1]")private WebElement EnterPriceEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='sizes'])[1]")private WebElement EnterSizeEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='weight'])[1]")private WebElement EnterWeightEdt;
	
	@FindBy(xpath ="(//textarea[@formcontrolname='description'])[1]")private WebElement DescriptionEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='image'])[1]")private WebElement UploadImageEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
	
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductsLink() {
		return ProductsLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddProductsBtn() {
		return AddProductsBtn;
	}

	public WebElement getCategoryNameEdt() {
		return CategoryNameEdt;
	}

	public WebElement getSubCategoryNameEdt() {
		return SubCategoryNameEdt;
	}

	public WebElement getBrandNameEdt() {
		return BrandNameEdt;
	}

	public WebElement getProductNameEdt() {
		return ProductNameEdt;
	}

	public WebElement getEnterVaEdt() {
		return EnterVaEdt;
	}

	public WebElement getSelectCaratEdt() {
		return SelectCaratEdt;
	}

	public WebElement getSelectTypeEdt() {
		return SelectTypeEdt;
	}

	public WebElement getIsshownEdt() {
		return IsshownEdt;
	}

	public WebElement getEnterPriceEdt() {
		return EnterPriceEdt;
	}

	public WebElement getEnterSizeEdt() {
		return EnterSizeEdt;
	}

	public WebElement getEnterWeightEdt() {
		return EnterWeightEdt;
	}

	public WebElement getDescriptionEdt() {
		return DescriptionEdt;
	}

	public WebElement getUploadImageEdt() {
		return UploadImageEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}	
	
	public void Products(String categoryname,String subcategoryname,String brandname,String productname,String va,String carat,String selecttype,String isshown,String price,String size,String weight,String description,String uploadimage,String search) throws Exception
	{
		ProductsLink.click();
		Thread.sleep(2000);
		AddProductsBtn.click();
		Thread.sleep(2000);
		CategoryNameEdt.sendKeys(categoryname);
		Thread.sleep(2000);
		SubCategoryNameEdt.sendKeys(subcategoryname);
		Thread.sleep(2000);
		BrandNameEdt.sendKeys(brandname);
		Thread.sleep(2000);
		ProductNameEdt.sendKeys(productname);
		Thread.sleep(2000);
		EnterVaEdt.sendKeys(va);
		Thread.sleep(2000);
		SelectCaratEdt.sendKeys(carat);
		Thread.sleep(2000);
		SelectTypeEdt.sendKeys(selecttype);
		Thread.sleep(2000);
		IsshownEdt.sendKeys(isshown);
		Thread.sleep(2000);
		EnterPriceEdt.sendKeys(price);
		Thread.sleep(2000);
		EnterSizeEdt.sendKeys(size);
		Thread.sleep(2000);
		EnterWeightEdt.sendKeys(weight);
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(description);
		Thread.sleep(2000);
		UploadImageEdt.sendKeys(uploadimage);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
