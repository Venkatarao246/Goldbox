package Sprint01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.RedeemGoldUsersPage;
import ObjectRepository.UsersPage;

public class RedeemGoldUsers {
	
	@Test
	public void sample5() throws Exception 
	 {
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String search ="kondalu";
		
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://stg-fms.goldbox.gold/signin");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    LoginPage lpage=new LoginPage(driver);
	    lpage.loginToApplication(email, password);
//	    lpage.getEmailEdt().sendKeys(email);
//	    lpage.getPasswordEdt().sendKeys(password);
//	    lpage.getSignInBtn().click();
	    Thread.sleep(5000);
	    UsersPage upage = new UsersPage(driver);
	    upage.ClickOnUsers();
//	    upage.getUsersLink().click();
	    Thread.sleep(2000);
	    RedeemGoldUsersPage rgupage =new RedeemGoldUsersPage(driver);
	    rgupage.RedeemGoldUsers(search);
//	    rgupage.getRedeemGoldUsersLink().click();
//	    rgupage.getActionViewLink().click();
//	    rgupage.getSearchEdt().sendKeys(search);
//	    rgupage.getExportToExcelBtn().click();
	
  }
}
