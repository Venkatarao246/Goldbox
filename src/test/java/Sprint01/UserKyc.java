package Sprint01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.UserKycPage;
import ObjectRepository.UsersPage;

public class UserKyc {

	@Test
	public void sample4() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String name ="Naresh";
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://stg-fms.goldbox.gold/signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		LoginPage lpage=new LoginPage(driver);
		lpage.loginToApplication(email, password);
//		lpage.getEmailEdt().sendKeys(email);
//		lpage.getPasswordEdt().sendKeys(password);
//		lpage.getSignInBtn().click();
		
		Thread.sleep(5000);
		UsersPage upage = new UsersPage(driver);
		upage.ClickOnUsers();
//		upage.getUsersLink().click();
		Thread.sleep(2000);
		UserKycPage ukpage =new UserKycPage(driver);
		ukpage.userkyc(name);
//		ukpage.getUserKycLink().click();
//		Thread.sleep(2000);
//		ukpage.getAadharViewLink().click();
//		Thread.sleep(3000);
//		ukpage.getAadharCloseBtn().click();
//		Thread.sleep(2000);
//		ukpage.getPanViewLink().click();
//		Thread.sleep(2000);
//		ukpage.getPanCloseBtn().click();
//		Thread.sleep(2000);
//		ukpage.getSearchEdt().sendKeys(name);
   }
}