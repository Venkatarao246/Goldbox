package Sprint04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.BannersPage;
import ObjectRepository.EcomBannersPage;
import ObjectRepository.LoginPage;

public class EcomBanners {

	@Test
	public void sample19() throws Exception
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String fromdate ="11-05-2024";
		String todate ="11-06-2024";
		String uploadbannerimage ="D:\\\\X Yug Technologies\\\\V Buy Gold Project\\\\Necklece images\\\\download 3.jpg";
		String sequence ="4";
		String search ="Banner";
		
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
		BannersPage bpage =new BannersPage(driver);
		bpage.ClickOnBanners();
//		bpage.getBannersLink().click();
		Thread.sleep(2000);
		EcomBannersPage ebpage =new EcomBannersPage(driver);
		ebpage.EcomBanners(fromdate, todate, uploadbannerimage, sequence, search);
//		ebpage.getEcomBannersLink().click();
//		Thread.sleep(2000);
//		ebpage.getAddEcomBannersbtn().click();
//		Thread.sleep(2000);
//		ebpage.getFromDateEdt().sendKeys(fromdate);
//		Thread.sleep(2000);
//		ebpage.getToDateEdt().sendKeys(todate);
//		Thread.sleep(2000);
//		ebpage.getUploadBannerImageEdt().sendKeys(uploadbannerimage);
//		Thread.sleep(2000);
//		ebpage.getSequenceEdt().sendKeys(sequence);
//		Thread.sleep(2000);
//		ebpage.getAddBtn().click();
//		Thread.sleep(2000);
//		ebpage.getBannerImageViewBtn().click();
//		Thread.sleep(2000);
//		ebpage.getBannerImageCloseBtn().click();
//		Thread.sleep(2000);
//		ebpage.getEditBtn().click();
//		Thread.sleep(2000);
//		ebpage.getEditCloseBtn().click();
//		Thread.sleep(2000);
//		ebpage.getSearchEdt().sendKeys(search);
    }
}