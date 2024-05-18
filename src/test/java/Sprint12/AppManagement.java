package Sprint12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.AppManagementPage;
import ObjectRepository.LoginPage;
import ObjectRepository.SettingsPage;

public class AppManagement {

	@Test
	public void sample33() throws Exception 
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
		Thread.sleep(10000);
		SettingsPage spage =new SettingsPage(driver);
		spage.ClickOnSettings();
//		spage.getSettingsLink().click();
		Thread.sleep(2000);
		AppManagementPage ampage =new AppManagementPage(driver);
		ampage.AppManagement();
//		ampage.getAppManagementLink().click();
//		Thread.sleep(5000);
//		ampage.getBootstrapBtn().click();
   }
}