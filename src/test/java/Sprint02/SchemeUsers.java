package Sprint02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.SchemeUsersPage;
import ObjectRepository.SchemesPage;

public class SchemeUsers {

	@Test
	public void sample8() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String search ="Revathi";
		
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
		spage.ClickOnSchemeUsers();
//		spage.getSchemesLink().click();
		Thread.sleep(2000);
		SchemeUsersPage supage =new SchemeUsersPage(driver);
		supage.SchemeUsers(search);
//		supage.getSchemeUsersLink().click();
//		Thread.sleep(2000);
//		supage.getSearchEdt().sendKeys(search);
//		Thread.sleep(2000);
//		supage.getInfoLink().click();
	}
}
