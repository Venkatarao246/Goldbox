package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponsPage {

	@FindBy(xpath ="//span[text()='Coupons']")private WebElement CouponsLink;
	
	@FindBy(xpath ="//a[@href='/coupons/festival-coupons-list']")private WebElement CouponsListLink;
	
	@FindBy(xpath ="//a[@href='/coupons/admin-coupons']")private WebElement AdminCouponsLink;
	
	public CouponsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCouponsLink() {
		return CouponsLink;
	}

	public WebElement getCouponsListLink() {
		return CouponsListLink;
	}

	public WebElement getAdminCouponsLink() {
		return AdminCouponsLink;
	}
	
	public void ClickOnCoupons()
	{
		CouponsLink.click();
	}
	
	public void ClickOnAdminCoupons()
	{
		CouponsListLink.click();
	}
	
	public void ClickOnCouponsList()
	{
		AdminCouponsLink.click();
	}
}
