package Sprint03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.EcomTransactionsPage;
import ObjectRepository.EcommercePage;
import ObjectRepository.LoginPage;

public class EcomTransactions {

	@Test
	public void sample16() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String search ="naresh";
		
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
		EcommercePage epage =new EcommercePage(driver);
		epage.ClickOnEcommerce();
//		epage.getEcommerceLink().click();
		Thread.sleep(8000);
		EcomTransactionsPage etpage =new EcomTransactionsPage(driver);
		etpage.EcomTransactions(search);
//		etpage.getEcomTransactionsLink().click();
//		etpage.getSearchEdt().sendKeys(search);
    }
}