package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommercePage {

	@FindBy(xpath ="//span[text()='Ecommerce']")private WebElement EcommerceLink;
	
	@FindBy(xpath ="//a[@href='/ecommerce/category']")private WebElement CategoryLink;
	
	@FindBy(xpath ="//a[@href='/ecommerce/sub-category']")private WebElement SubCategoryLink;
	
	@FindBy(xpath ="//a[@href='/ecommerce/products']")private WebElement ProductsLink;
	
	@FindBy(xpath ="//a[@href='/ecommerce/brands']")private WebElement BrandsLink;
	
	@FindBy(xpath ="//a[@href='/ecommerce/ecommerce-orders']")private WebElement EcommerceOrdersLink;
	
	@FindBy(xpath ="//a[@href='/ecommerce/ecom-transactions']")private WebElement EcomTransactionsLink;
	
	public EcommercePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEcommerceLink() {
		return EcommerceLink;
	}

	public WebElement getCategoryLink() {
		return CategoryLink;
	}

	public WebElement getSubCategoryLink() {
		return SubCategoryLink;
	}

	public WebElement getProductsLink() {
		return ProductsLink;
	}

	public WebElement getBrandsLink() {
		return BrandsLink;
	}

	public WebElement getEcommerceOrdersLink() {
		return EcommerceOrdersLink;
	}

	public WebElement getEcomTransactionsLink() {
		return EcomTransactionsLink;
	}
	
	public void Ecommerce() throws Exception
	{
		EcommerceLink.click();
		Thread.sleep(2000);
		CategoryLink.click();
		Thread.sleep(2000);
		SubCategoryLink.click();
		Thread.sleep(2000);
		ProductsLink.click();
		Thread.sleep(2000);
		BrandsLink.click();
		Thread.sleep(2000);
		EcommerceOrdersLink.click();
		Thread.sleep(2000);
		EcomTransactionsLink.click();
	}
	
	public void ClickOnEcommerce()
	{
		EcommerceLink.click();
	}
	
	public void ClickOnCategory()
	{
		CategoryLink.click();
	}
	
	public void ClickOnSubCategory()
	{
		SubCategoryLink.click();
	}
	
	public void ClickOnProducts()
	{
		ProductsLink.click();
	}
	
	public void ClickOnBrands()
	{
		BrandsLink.click();
	}
	
	public void ClickOnEcomOrders()
	{
		EcommerceOrdersLink.click();
	}
	
	public void ClickOnEcomTransactions()
	{
		EcomTransactionsLink.click();
	}
	
}
