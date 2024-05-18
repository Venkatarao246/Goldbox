package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RolesPage {

	@FindBy(xpath ="//a[@href='/roles']")private WebElement RolesLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddRoleBtn;
	
	@FindBy(xpath ="(//input[@formcontrolname='title'])[1]")private WebElement RoleTitleEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
	@FindBy(xpath ="(//button[text()=' Edit '])[1]")private WebElement EditBtn;
	
	@FindBy(xpath ="(//input[@formcontrolname='title'])[2]")private WebElement UpdateRoleTitleEdt;
	
	@FindBy(xpath ="//button[text()='Update']")private WebElement UpdateBtn;
	
	@FindBy(xpath ="(//button[@class='mr-2 btn-danger'])[1]")private WebElement DeleteBtn;
	
	@FindBy(xpath ="//button[text()='Yes, Delete!']")private WebElement YesdeleteBtn;
	
	public RolesPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getRolesLink() {
		return RolesLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddRoleBtn() {
		return AddRoleBtn;
	}

	public WebElement getRoleTitleEdt() {
		return RoleTitleEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getEditBtn() {
		return EditBtn;
	}

	public WebElement getUpdateRoleTitleEdt() {
		return UpdateRoleTitleEdt;
	}

	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	public WebElement getYesdeleteBtn() {
		return YesdeleteBtn;
	}
	
	
	public void Roles(String roletitle,String search,String updateroletitle) throws Exception
	{
		RolesLink.click();
		Thread.sleep(2000);
		AddRoleBtn.click();
		Thread.sleep(2000);
		RoleTitleEdt.sendKeys(roletitle);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		UpdateRoleTitleEdt.sendKeys(updateroletitle);
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(2000);
		DeleteBtn.click();
		Thread.sleep(2000);
		YesdeleteBtn.click();
	}
}
