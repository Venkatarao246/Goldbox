package Sprint07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.NotificationsPage;

public class Notifications {

	@Test
	public void sample25() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String title ="Order pickup";
		String message ="The jewelry order is redy to pick up";
		String type ="ECOP";
		String search ="Order pickup";
		
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
		NotificationsPage npage=new NotificationsPage(driver);
		npage.Notifications(title, message, type, search);
//		npage.getNotificationsLink().click();
//		Thread.sleep(2000);
//		npage.getAddNotificationBtn().click();
//		Thread.sleep(2000);
//		npage.getTitleEdt().sendKeys(title);
//		Thread.sleep(2000);
//		npage.getMessageEdt().sendKeys(message);
//		Thread.sleep(2000);
//		npage.getTypeEdt().sendKeys(type);
//		Thread.sleep(2000);
//		npage.getAddBtn().click();
//		Thread.sleep(2000);
//		npage.getSearchEdt().sendKeys(search);
    }
}