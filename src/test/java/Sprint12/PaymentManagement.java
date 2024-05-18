package Sprint12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.PaymentManagementPage;
import ObjectRepository.SettingsPage;

public class PaymentManagement {

	@Test
	public void sample34() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String title ="Paytm";
		
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
		Thread.sleep(5000);
		PaymentManagementPage pmpage =new PaymentManagementPage(driver);
		pmpage.PaymentManagement(title);
//		pmpage.getPaymentManagementLink().click();
//		Thread.sleep(2000);
//		pmpage.getAddPaymentMethodBtn().click();
//		Thread.sleep(2000);
//		pmpage.getTitleEdt().sendKeys(title);
//		Thread.sleep(5000);
//		pmpage.getDefaultAppStatusBootstrapBtn().click();
//		Thread.sleep(2000);
//		pmpage.getAddBtn().click();
//		Thread.sleep(5000);
//		pmpage.getPaymentStatusBootstrapBtn().click();
    }
}