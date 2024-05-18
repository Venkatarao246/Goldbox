package Sprint02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.BuyGoldPage;
import ObjectRepository.LoginPage;
import ObjectRepository.SchemesPage;

public class BuyGold {

	@Test
	public void sample9() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String contenttype ="Main Content";
		String content ="Silver chain";
		String explanation  ="Silver is good";
		String search ="Main Content";
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg-fms.goldbox.gold/signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		LoginPage lpage=new LoginPage(driver);
		lpage.loginToApplication(email, password);
//		lpage.getEmailEdt().sendKeys(email);
//		lpage.getPasswordEdt().sendKeys(password);
//		lpage.getSignInBtn().click();
		Thread.sleep(5000);
		SchemesPage spage =new SchemesPage(driver);
		spage.ClickOnBuyGold();
//		spage.getSchemesLink().click();
		Thread.sleep(2000);
		BuyGoldPage bgpage =new BuyGoldPage(driver);
		bgpage.BuyGold(contenttype, content, explanation, search);
//		bgpage.getBuyGoldLink().click();
//		Thread.sleep(2000);
//		bgpage.getAddContentBtn().click();
//		Thread.sleep(2000);
//		bgpage.getContentTypeEdt().sendKeys(contenttype);
//		Thread.sleep(2000);
//		bgpage.getContentEdt().sendKeys(content);
//		Thread.sleep(2000);
//		bgpage.getExplanationEdt().sendKeys(explanation);
//		Thread.sleep(2000);
//		bgpage.getAddBtn().click();
//		Thread.sleep(2000);
//		bgpage.getSearchEdt().sendKeys(search);
	}
}
