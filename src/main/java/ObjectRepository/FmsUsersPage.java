package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FmsUsersPage {

    @FindBy(xpath ="//a[@href='/fms-users']")private WebElement FmsUsersLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddFmsUserBtn;
	
	@FindBy(xpath ="(//input[@formcontrolname='name'])[1]")private WebElement FullNameEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='mobile'])[1]")private WebElement PhoneNumberEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='email'])[1]")private WebElement EmailEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='password'])[1]")private WebElement PasswordEdt;
	
	@FindBy(xpath ="(//select[@formcontrolname='role'])[1]")private WebElement SelectRoleEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
    @FindBy(xpath ="(//button[text()=' Edit '])[1]")private WebElement EditBtn;
	
	@FindBy(xpath ="(//button[@class='mr-2 btn-danger'])[1]")private WebElement DeleteBtn;
	
	public FmsUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFmsUsersLink() {
		return FmsUsersLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddFmsUserBtn() {
		return AddFmsUserBtn;
	}

	public WebElement getFullNameEdt() {
		return FullNameEdt;
	}

	public WebElement getPhoneNumberEdt() {
		return PhoneNumberEdt;
	}

	public WebElement getEmailEdt() {
		return EmailEdt;
	}

	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}

	public WebElement getSelectRoleEdt() {
		return SelectRoleEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getEditBtn() {
		return EditBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}
	
	
	public void FmsUsers(String fullname,String phonenumber,String email1,String password1,String selectrole,String search) throws Exception
	{
		FmsUsersLink.click();
		Thread.sleep(2000);
		AddFmsUserBtn.click();
		Thread.sleep(2000);
		FullNameEdt.sendKeys(fullname);
		Thread.sleep(2000);
		PhoneNumberEdt.sendKeys(phonenumber);
		Thread.sleep(2000);
		EmailEdt.sendKeys(email1);
		Thread.sleep(2000);
		PasswordEdt.sendKeys(password1);
		Thread.sleep(2000);
		SelectRoleEdt.sendKeys(selectrole);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
