package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {

	@FindBy(xpath ="//a[@href='/ecommerce/category']")private WebElement CategoryLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddCategoryBtn;
	
	@FindBy(xpath ="(//input[@formcontrolname='name'])[1]")private WebElement CategoryNameEdt;
	
	@FindBy(xpath ="//input[@accept='image/jpeg, image/png, image/gif']")private WebElement UploadImageEdt;
	
	@FindBy(xpath ="//button[@class='add-btn']")private WebElement AddBtn;
	
	public CategoryPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCategoryLink() {
		return CategoryLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddCategoryBtn() {
		return AddCategoryBtn;
	}

	public WebElement getCategoryNameEdt() {
		return CategoryNameEdt;
	}

	public WebElement getUploadImageEdt() {
		return UploadImageEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}	
	
	public void Category(String categoryname,String uploadimage,String search) throws Exception
	{
		CategoryLink.click();
		Thread.sleep(2000);
		AddCategoryBtn.click();
		Thread.sleep(2000);
		CategoryNameEdt.sendKeys(categoryname);
		Thread.sleep(2000);
		UploadImageEdt.sendKeys(uploadimage);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
