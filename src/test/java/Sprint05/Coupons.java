package Sprint05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.CouponsPage;
import ObjectRepository.LoginPage;

public class Coupons {

	@Test
	public void sample20() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		
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
   }
}
