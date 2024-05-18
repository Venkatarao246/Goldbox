package Sprint12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.RolesPage;
import ObjectRepository.SettingsPage;

public class Roles {

	@Test
	public void sample35() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String roletitle ="Testing22";
		String search ="Testing22";
		String updateroletitle ="Testing44";
				
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
		RolesPage rpage =new RolesPage(driver);
		rpage.Roles(roletitle, search, updateroletitle);
//		rpage.getRolesLink().click();
//		Thread.sleep(2000);
//		rpage.getAddRoleBtn().click();
//		Thread.sleep(2000);
//		rpage.getRoleTitleEdt().sendKeys(roletitle);
//		Thread.sleep(5000);
//		rpage.getAddBtn().click();
//		Thread.sleep(2000);
//		rpage.getSearchEdt().sendKeys(search);
//		Thread.sleep(3000);
//		rpage.getEditBtn().click();
//		Thread.sleep(5000);
//		rpage.getUpdateRoleTitleEdt().sendKeys(updateroletitle);
//		Thread.sleep(2000);
//		rpage.getUpdateBtn().click();
//		Thread.sleep(2000);
//		rpage.getDeleteBtn().click();
//		Thread.sleep(2000);
//		rpage.getYesdeleteBtn().click();
   }
}