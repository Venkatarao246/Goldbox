package Sprint03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.CategoryPage;
import ObjectRepository.EcommercePage;
import ObjectRepository.LoginPage;

public class Category {

	@Test
	public void sample11() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String categoryname ="SilverGold";
		String uploadimage ="D:\\X Yug Technologies\\V Buy Gold Project\\Necklece images\\download 3.jpg";
		String search ="Silver";
		
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
		EcommercePage epage =new EcommercePage(driver);
		epage.ClickOnEcommerce();
//		epage.getEcommerceLink().click();
		Thread.sleep(2000);
		CategoryPage cpage =new CategoryPage(driver);
		cpage.Category(categoryname, uploadimage, search);
//		cpage.getCategoryLink().click();
//		Thread.sleep(2000);
//		cpage.getAddCategoryBtn().click();
//		Thread.sleep(2000);
//		cpage.getCategoryNameEdt().sendKeys(categoryname);
//		Thread.sleep(2000);
//		cpage.getUploadImageEdt().sendKeys(uploadimage);
//		Thread.sleep(2000);
//		cpage.getAddBtn().click();
//		Thread.sleep(2000);
//		cpage.getSearchEdt().sendKeys(search);	
    }
}
