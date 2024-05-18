package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponsListPage {

	@FindBy(xpath ="//a[@href='/coupons/festival-coupons-list']")private WebElement CouponsListLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddCouponBtn;
	
	@FindBy(xpath ="(//input[@formcontrolname='amount'])[1]")private WebElement CouponAmountEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='from_date'])[1]")private WebElement FromDateEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='to_date'])[1]")private WebElement ToDateEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='minimum_transaction_amount'])[1]")private WebElement MinimumTransactionAmountEdt;
	
	@FindBy(xpath ="(//textarea[@formcontrolname='description'])[1]")private WebElement  DescriptionEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
	public CouponsListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCouponsListLink() {
		return CouponsListLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddCouponBtn() {
		return AddCouponBtn;
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

	public WebElement getDescriptionEdt() {
		return DescriptionEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	
	public void CouponsList(String couponamount,String fromdate,String todate,String minimumtransactionamount,String description,String search) throws Exception
	{
		CouponsListLink.click();
		Thread.sleep(2000);
		AddCouponBtn.click();
		Thread.sleep(2000);
		CouponAmountEdt.sendKeys(couponamount);
		Thread.sleep(2000);
		FromDateEdt.sendKeys(fromdate);
		Thread.sleep(2000);
		ToDateEdt.sendKeys(todate);
		Thread.sleep(2000);
		MinimumTransactionAmountEdt.sendKeys(minimumtransactionamount);
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(description);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
