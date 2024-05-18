package Sprint10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.EventsPage;
import ObjectRepository.LoginPage;

public class Events {
	
	@Test
	public void sample28() throws Exception 
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
		Thread.sleep(10000);
		EventsPage epage = new EventsPage(driver);
		epage.Events(search);
//		epage.getEventsLink().click();
//		Thread.sleep(2000);
//		epage.getSearchEdt().sendKeys(search);
    }
}