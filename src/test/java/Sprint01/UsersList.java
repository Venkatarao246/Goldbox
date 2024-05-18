package Sprint01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.UserListPage;
import ObjectRepository.UsersPage;

public class UsersList {

	@Test
	public void sample3() throws Exception
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String  name ="naresh";
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://stg-fms.goldbox.gold/signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		LoginPage lpage=new LoginPage(driver);
		lpage.loginToApplication(email, password);
//		lpage.getEmailEdt().sendKeys(email);
//		lpage.getPasswordEdt().sendKeys(password);
//		lpage.getSignInBtn().click();
		Thread.sleep(4000);
		UsersPage upage = new UsersPage(driver);
		upage.ClickOnUsers();
//		upage.getUsersLink().click();
		Thread.sleep(2000);
		UserListPage ulpage = new UserListPage(driver);
		ulpage.UserList(name);
//		ulpage.getUserListLink().click();
//		ulpage.getSearchEdt().sendKeys(name);
//		ulpage.getInfoLink().click();			
   }
}