package Sprint09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.TradingPage;

public class Trading {

	@Test
	public void sample27() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String search ="frog";
		
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
		TradingPage tpage=new TradingPage(driver);
		tpage.Trading(search);
//		tpage.getTradingLink().click();
//		Thread.sleep(2000);
//		tpage.getSearchEdt().sendKeys(search);
//		Thread.sleep(2000);
//		tpage.getExportToExcelBtn().click();
   }
}