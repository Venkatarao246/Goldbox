package Sprint03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.EcommercePage;
import ObjectRepository.LoginPage;
import ObjectRepository.ProductsPage;

public class Products {

	@Test
	public void sample13() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String categoryname ="Nosepin";
		String subcategoryname ="Stone Nose pin";
		String brandname ="Matrika";
		String productname ="Chains";
		String Va ="8";
		String selectcarat ="22 carat";
		String selecttype ="Gold";
		String isshown ="Goldbox";
		String price ="1000";
		String size ="7";
		String weight ="12";
		String description ="Nosepins are very good";
		String uploadimage ="D:\\\\X Yug Technologies\\\\V Buy Gold Project\\\\Necklece images\\\\download 3.jpg";
		String search ="Nosepin";
		
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
		ProductsPage ppage =new ProductsPage(driver);
		ppage.Products(categoryname, subcategoryname, brandname, productname, Va, selectcarat, selecttype, isshown, price, size, weight, description, uploadimage, search);
//		ppage.getProductsLink().click();
//		Thread.sleep(2000);
//		ppage.getAddProductsBtn().click();
//		Thread.sleep(2000);
//		ppage.getCategoryNameEdt().sendKeys(categoryname);
//		Thread.sleep(2000);
//		ppage.getSubCategoryNameEdt().sendKeys(subcategoryname);
//		Thread.sleep(2000);
//		ppage.getBrandNameEdt().sendKeys(brandname);
//		Thread.sleep(2000);
//		ppage.getProductNameEdt().sendKeys(productname);
//		Thread.sleep(2000);
//		ppage.getEnterVaEdt().sendKeys(Va);
//		Thread.sleep(2000);
//		ppage.getSelectCaratEdt().sendKeys(selectcarat);
//		Thread.sleep(2000);
//		ppage.getSelectTypeEdt().sendKeys(selecttype);
//		Thread.sleep(2000);
//		ppage.getIsshownEdt().sendKeys(isshown);
//		Thread.sleep(2000);
//		ppage.getEnterPriceEdt().sendKeys(price);
//		Thread.sleep(2000);
//		ppage.getEnterSizeEdt().sendKeys(size);
//		Thread.sleep(2000);
//		ppage.getEnterWeightEdt().sendKeys(weight);
//		Thread.sleep(2000);
//		ppage.getDescriptionEdt().sendKeys(description);
//		Thread.sleep(2000);
//		ppage.getUploadImageEdt().sendKeys(uploadimage);
//		Thread.sleep(2000);
//		ppage.getAddBtn().click();
//		Thread.sleep(2000);
//		ppage.getSearchEdt().sendKeys(search);	
   }
}