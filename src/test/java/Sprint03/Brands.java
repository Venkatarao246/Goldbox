package Sprint03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.BrandsPage;
import ObjectRepository.EcommercePage;
import ObjectRepository.LoginPage;

public class Brands {

	@Test
	public void sample14() throws Exception
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String brandname ="Gold";
		String uploadimage ="D:\\\\X Yug Technologies\\\\V Buy Gold Project\\\\Necklece images\\\\download 3.jpg";
		String search ="Goldbox";
		
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
		EcommercePage epage =new EcommercePage(driver);
		epage.ClickOnEcommerce();
//		epage.getEcommerceLink().click();
		Thread.sleep(8000);
		BrandsPage bpage =new BrandsPage(driver);
		bpage.Brands(brandname, uploadimage, search);
//		bpage.getBrandsLink().click();
//		Thread.sleep(2000);
//		bpage.getAddBrandBtn().click();
//		Thread.sleep(2000);
//		bpage.getBrandNameEdt().sendKeys(brandname);
//		Thread.sleep(2000);
//		bpage.getUploadImageEdt().sendKeys(uploadimage);
//		Thread.sleep(2000);
//		bpage.getAddBtn().click();
//		Thread.sleep(2000);
//		bpage.getSearchEdt().sendKeys(search);
    }
}