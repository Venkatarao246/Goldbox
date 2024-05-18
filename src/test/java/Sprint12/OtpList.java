package Sprint12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.OtpListPage;
import ObjectRepository.SettingsPage;

public class OtpList {

	@Test
	public void sample32() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String otp ="722374";
		
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
		SettingsPage spage =new SettingsPage(driver);
		spage.ClickOnSettings();
//		spage.getSettingsLink().click();
		Thread.sleep(2000);
		OtpListPage olpage =new OtpListPage(driver);
		olpage.otpList(otp);
//		olpage.getOtpListLink().click();
//		Thread.sleep(2000);
//		olpage.getSearchEdt().sendKeys(otp);
   }
}