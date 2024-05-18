package Sprint12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.FmsUsersPage;
import ObjectRepository.LoginPage;
import ObjectRepository.SettingsPage;

public class FmsUsers {

	@Test
	public void sample36() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String fullname ="kiran";
		String phone ="8008675670";
		String Email ="kiran458@gmail.com";
		String PassWord ="string4589";
		String selectrole ="Testng1";
		String search ="Testng1";
		
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
		FmsUsersPage fupage =new FmsUsersPage(driver);
		fupage.FmsUsers(fullname, phone, Email, PassWord, selectrole, search);
//		fupage.getFmsUsersLink().click();
//		Thread.sleep(2000);
//		fupage.getAddFmsUserBtn().click();
//		Thread.sleep(2000);
//		fupage.getFullNameEdt().sendKeys(fullname);
//		Thread.sleep(2000);
//		fupage.getPhoneNumberEdt().sendKeys(phone);
//		Thread.sleep(2000);
//		fupage.getEmailEdt().sendKeys(Email);
//		Thread.sleep(2000);
//		fupage.getPasswordEdt().sendKeys(PassWord);
//		Thread.sleep(2000);
//		fupage.getSelectRoleEdt().sendKeys(selectrole);
//		Thread.sleep(2000);
//		fupage.getAddBtn().click();
//		Thread.sleep(2000);
//		fupage.getEditBtn().click();
//		Thread.sleep(2000);
//		fupage.getSearchEdt().sendKeys(search);
//		Thread.sleep(2000);
//		fupage.getDeleteBtn().click();
    }
}