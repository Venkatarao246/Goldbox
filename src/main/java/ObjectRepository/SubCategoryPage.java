package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubCategoryPage {

	@FindBy(xpath ="//a[@href='/ecommerce/sub-category']")private WebElement SubCategoryLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddSubCategoryBtn;
	
	@FindBy(xpath ="//select[@placeholder='Select Category']")private WebElement CategoryNameEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='subcatname'])[1]")private WebElement SubCategoryNameEdt;
	
	@FindBy(xpath ="//select[@placeholder='Select Type']")private WebElement SelectTypeEdt;
	
	@FindBy(xpath ="//input[@accept='image/jpeg, image/png, image/gif']")private WebElement UploadImageEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
	public SubCategoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubCategoryLink() {
		return SubCategoryLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddSubCategoryBtn() {
		return AddSubCategoryBtn;
	}

	public WebElement getCategoryNameEdt() {
		return CategoryNameEdt;
	}

	public WebElement getSubCategoryNameEdt() {
		return SubCategoryNameEdt;
	}

	public WebElement getSelectTypeEdt() {
		return SelectTypeEdt;
	}

	public WebElement getUploadImageEdt() {
		return UploadImageEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}	
	
	public void SubCategory(String categoryname,String subcategoryname,String selecttype,String uploadimage,String search) throws Exception
	{
		SubCategoryLink.click();
		Thread.sleep(2000);
		AddSubCategoryBtn.click();
		Thread.sleep(2000);
		CategoryNameEdt.sendKeys(categoryname);
		Thread.sleep(2000);
		SubCategoryNameEdt.sendKeys(subcategoryname);
		Thread.sleep(2000);
		SelectTypeEdt.sendKeys(selecttype);
		Thread.sleep(2000);
		UploadImageEdt.sendKeys(uploadimage);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
