package Sprint02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginPage;
import ObjectRepository.SchemeListPage;
import ObjectRepository.SchemesPage;

public class SchemeList {

	@Test
	public void sample7() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String search ="Silver Chain";
		String name ="necklece";
		String country ="India";
		String calculationtype ="my gold";
		String description ="chain is very unique";
		
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
		SchemesPage spage =new SchemesPage(driver);
		spage.ClickOnSchemeList();
//		spage.getSchemesLink().click();	
		Thread.sleep(3000);
		SchemeListPage slpage =new SchemeListPage(driver);
		slpage.ShemesList(name, country, calculationtype, description, search);
//		slpage.getSchemeListLink().click();
//		slpage.getSearchEdt().sendKeys(search);
//		Thread.sleep(2000);
//		slpage.getAddSchemeBtn().click();
//		Thread.sleep(2000);
//		slpage.getSchemeNameEdt().sendKeys(name);
//		slpage.getCountryEdt().sendKeys(country);
//		slpage.getCalculationTypeEdt().sendKeys(calculationtype);
//		slpage.getDescriptionEdt().sendKeys(description);
//		slpage.getAddBtn().click();
     }
}

