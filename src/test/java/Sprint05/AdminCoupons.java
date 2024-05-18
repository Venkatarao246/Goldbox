package Sprint05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.AdminCouponsPage;
import ObjectRepository.CouponsPage;
import ObjectRepository.LoginPage;

public class AdminCoupons {

	@Test
	public void sample22() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String couponamount ="100";
		String fromdate ="18-05-2024";
		String todate ="18-06-2024";
		String minimumtransactionamount ="1000";
		String userregisterdmobilenumber ="9063685857";
		String description ="Coupon is very helpful";
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg-fms.goldbox.gold/signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		LoginPage lpage=new LoginPage(driver);
		lpage.loginToApplication(email, password);
//		lpage.getEmailEdt().sendKeys(email);
//		lpage.getPasswordEdt().sendKeys(password);
//		lpage.getSignInBtn().click();
		Thread.sleep(8000); 
		CouponsPage copage =new CouponsPage(driver);
		copage.ClickOnCoupons();
//		copage.getCouponsLink().click();
		Thread.sleep(2000);
		AdminCouponsPage acpage =new AdminCouponsPage(driver);
		acpage.getAdminCouponsLink().click();
		Thread.sleep(2000);
		acpage.getAddAdminCouponBtn().click();
		Thread.sleep(2000);
		acpage.getCouponAmountEdt().sendKeys(couponamount);
		Thread.sleep(3000);
		acpage.getFromDateEdt().sendKeys(fromdate);
		Thread.sleep(3000);
		acpage.getToDateEdt().sendKeys(todate);
		Thread.sleep(3000);
		acpage.getMinimumTransactionAmountEdt().sendKeys(minimumtransactionamount);
		Thread.sleep(3000);
		acpage.getUserRegisteredMobileNumberEdt().sendKeys(userregisterdmobilenumber);
		Thread.sleep(3000);
		acpage.getDescriptionEdt().sendKeys(description);
		Thread.sleep(3000);
		acpage.getAddBtn().click();
   }
}