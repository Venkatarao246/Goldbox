package Sprint03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.EcommercePage;
import ObjectRepository.LoginPage;
import ObjectRepository.SubCategoryPage;

public class SubCategory {

	@Test
	public void sample12() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String categoryname ="Chains";
		String subcategoryname ="Stone Chain";
		String selecttype ="Goldcolour";
		String uploadimage ="D:\\\\X Yug Technologies\\\\V Buy Gold Project\\\\Necklece images\\\\download 3.jpg";
		String search ="Stone Chain";
		
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
		SubCategoryPage scpage =new SubCategoryPage(driver);
		scpage.SubCategory(categoryname, subcategoryname, selecttype, uploadimage, search);
//		scpage.getSubCategoryLink().click();
//		Thread.sleep(2000);
//		scpage.getAddSubCategoryBtn().click();
//		Thread.sleep(2000);
//		scpage.getCategoryNameEdt().sendKeys(categoryname);
//		Thread.sleep(2000);
//		scpage.getSubCategoryNameEdt().sendKeys(subcategoryname);
//		Thread.sleep(2000);
//		scpage.getSelectTypeEdt().sendKeys(selecttype);
//		Thread.sleep(2000);
//		scpage.getUploadImageEdt().sendKeys(uploadimage);
//		Thread.sleep(2000);
//		scpage.getAddBtn().click();
//		Thread.sleep(2000);
//		scpage.getSearchEdt().sendKeys(search);	
     }
  }