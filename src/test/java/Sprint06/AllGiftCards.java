package Sprint06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.AllGiftCardsPage;
import ObjectRepository.GiftCardsPage;
import ObjectRepository.LoginPage;

public class AllGiftCards {

	@Test
	public void sample24() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String merchant ="Matrika";
		String amount ="1000";
		String secretkey ="JawyvLMBWlr7HflOw";
		String quantity ="4";
		String search ="amazon";
		
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
		GiftCardsPage gcpage =new GiftCardsPage(driver);
		gcpage.Giftcards();
//		gcpage.getGiftCardsLink().click();
		Thread.sleep(2000);
		AllGiftCardsPage agcpage =new AllGiftCardsPage(driver);
		agcpage.AllGiftCards(merchant, amount, secretkey, quantity, search);
//		agcpage.getAllGiftCardsLink().click();
//		Thread.sleep(3000);
//		agcpage.getAddGiftCardBtn().click();
//		Thread.sleep(3000);
//		agcpage.getMerchantEdt().sendKeys(merchant);
//		Thread.sleep(3000);
//		agcpage.getAmountEdt().sendKeys(amount);
//		Thread.sleep(3000);
//		agcpage.getSecretKeyEdt().sendKeys(secretkey);
//		Thread.sleep(3000);
//		agcpage.getQuantityEdt().sendKeys(quantity);
//		Thread.sleep(3000);
//		agcpage.getAddBtn().click();
//		Thread.sleep(3000);
//		agcpage.getSearchEdt().sendKeys(search);	
   }
}