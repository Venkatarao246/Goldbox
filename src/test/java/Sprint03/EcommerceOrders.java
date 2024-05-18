package Sprint03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.EcommerceOrdersPage;
import ObjectRepository.EcommercePage;
import ObjectRepository.LoginPage;

public class EcommerceOrders {

	@Test
	public void sample15() throws Exception 
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
		EcommerceOrdersPage eopage =new EcommerceOrdersPage(driver);
		eopage.EcommerceOrders(search);
//		eopage.getEcommerceOrdersLink().click();
//		Thread.sleep(2000);
//		eopage.getSearchEdt().sendKeys(search);
//		eopage.getViewBtn().click();
//		Thread.sleep(2000);
//		eopage.getViewCloseBtn().click();
//		Thread.sleep(2000);
//		eopage.getStatusBtn().click();
//		Thread.sleep(2000);
//		eopage.getStatusCloseBtn().click();
//		Thread.sleep(2000);
//		eopage.getExportToExcelBtn().click();	
    }
}