package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminCouponsPage {

	@FindBy(xpath ="//a[@href='/coupons/admin-coupons']")private WebElement AdminCouponsLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddAdminCouponBtn;
	
	@FindBy(xpath ="(//input[@formcontrolname='amount'])[1]")private WebElement CouponAmountEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='from_date'])[1]")private WebElement FromDateEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='to_date'])[1]")private WebElement ToDateEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='minimum_transaction_amount'])[1]")private WebElement MinimumTransactionAmountEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='mobile'])[1]")private WebElement UserRegisteredMobileNumberEdt;
	
	@FindBy(xpath ="(//textarea[@formcontrolname='description'])[1]")private WebElement DescriptionEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
	public AdminCouponsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdminCouponsLink() {
		return AdminCouponsLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddAdminCouponBtn() {
		return AddAdminCouponBtn;
	}

	public WebElement getCouponAmountEdt() {
		return CouponAmountEdt;
	}

	public WebElement getFromDateEdt() {
		return FromDateEdt;
	}

	public WebElement getToDateEdt() {
		return ToDateEdt;
	}

	public WebElement getMinimumTransactionAmountEdt() {
		return MinimumTransactionAmountEdt;
	}

	public WebElement getUserRegisteredMobileNumberEdt() {
		return UserRegisteredMobileNumberEdt;
	}

	public WebElement getDescriptionEdt() {
		return DescriptionEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}	
	
	
	public void AdminCoupon(String couponamount,String fromdate,String todate,String minimumtransactionamount,String userregisteredmobilenumber,String description,String search) throws Exception
	{
		AdminCouponsLink.click();
		Thread.sleep(2000);
		AddAdminCouponBtn.click();
		Thread.sleep(2000);
		CouponAmountEdt.sendKeys(couponamount);
		Thread.sleep(2000);
		FromDateEdt.sendKeys(fromdate);
		Thread.sleep(2000);
		ToDateEdt.sendKeys(todate);
		Thread.sleep(2000);
		MinimumTransactionAmountEdt.sendKeys(minimumtransactionamount);
		Thread.sleep(2000);
		UserRegisteredMobileNumberEdt.sendKeys(userregisteredmobilenumber);
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(description);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
