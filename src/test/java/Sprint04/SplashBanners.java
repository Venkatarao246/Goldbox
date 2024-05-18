package Sprint04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.BannersPage;
import ObjectRepository.LoginPage;
import ObjectRepository.SplashBannersPage;

public class SplashBanners {

	@Test
	public void sample18() throws Exception 
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
		SplashBannersPage sbpage =new SplashBannersPage(driver);
		sbpage.SplashBanners(fromdate, todate, uploadbannerimage, sequence, search);
//		sbpage.getSplashBannersLink().click();
//		Thread.sleep(2000);
//		sbpage.getAddSplashBannersBtn().click();
//		Thread.sleep(2000);
//		sbpage.getFromDateEdt().sendKeys(fromdate);
//		Thread.sleep(2000);
//		sbpage.getToDateEdt().sendKeys(todate);
//		Thread.sleep(2000);
//		sbpage.getUploadBannerImageEdt().sendKeys(uploadbannerimage);
//		Thread.sleep(2000);
//		sbpage.getSquenceEdt().sendKeys(sequence);
//		Thread.sleep(2000);
//		sbpage.getAddBtn().click();
//		Thread.sleep(2000);
//		sbpage.getBannerImageViewBtn().click();
//		Thread.sleep(2000);
//		sbpage.getBannerImageCloseBtn().click();
//		Thread.sleep(2000);
//		sbpage.getEditBtn().click();
//		Thread.sleep(2000);
//		sbpage.getEditCloseBtn().click();
//		Thread.sleep(2000);
//		sbpage.getSearchEdt().sendKeys(search);
    }
}