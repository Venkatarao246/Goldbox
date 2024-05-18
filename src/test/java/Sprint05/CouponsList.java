package Sprint05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.CouponsListPage;
import ObjectRepository.CouponsPage;
import ObjectRepository.LoginPage;

public class CouponsList {

	@Test
	public void sample21() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String couponamount ="100";
		String fromdate ="17-05-2024";
		String todate ="19-06-2024";
		String minimumtransactionamount ="1000";
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
		Thread.sleep(10000); 
		CouponsPage copage =new CouponsPage(driver);
		copage.ClickOnCoupons();
//		copage.getCouponsLink().click();
		Thread.sleep(3000);
		CouponsListPage clpage =new CouponsListPage(driver);
		clpage.CouponsList(couponamount, fromdate, todate, minimumtransactionamount, description, description);
//		clpage.getCouponsListLink().click();
//		Thread.sleep(3000);
//		clpage.getAddCouponBtn().click();
//		Thread.sleep(3000);
//		clpage.getCouponAmountEdt().sendKeys(couponamount);
//		Thread.sleep(3000);
//		clpage.getFromDateEdt().sendKeys(fromdate);
//		Thread.sleep(3000);
//		clpage.getToDateEdt().sendKeys(todate);
//		Thread.sleep(3000);
//		clpage.getMinimumTransactionAmountEdt().sendKeys(minimumtransactionamount);
//		Thread.sleep(3000);
//		clpage.getDescriptionEdt().sendKeys(description);
//		Thread.sleep(3000);
//		clpage.getAddBtn().click();
    }
}