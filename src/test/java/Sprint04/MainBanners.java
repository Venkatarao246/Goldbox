package Sprint04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.BannersPage;
import ObjectRepository.LoginPage;
import ObjectRepository.MainBannersPage;

public class MainBanners {

	@Test
	public void sample17() throws Exception 
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
		MainBannersPage mbpage = new MainBannersPage(driver);
		mbpage.MainBanners(fromdate, todate, uploadbannerimage, sequence, search);
//		mbpage.getMainBannersLink().click();
//		Thread.sleep(2000);
//		mbpage.getAddMainBannersBtn().click();
//		Thread.sleep(2000);
//		mbpage.getFromDateEdt().sendKeys(fromdate);
//		Thread.sleep(2000);
//		mbpage.getToDateEdt().sendKeys(todate);
//		Thread.sleep(2000);
//		mbpage.getUploadBannerImageEdt().sendKeys(uploadbannerimage);
//		Thread.sleep(2000);
//		mbpage.getSequenceEdt().sendKeys(sequence);
//		Thread.sleep(2000);
//		mbpage.getAddBtn().click();
//		Thread.sleep(2000);
//		mbpage.getBannerImageViewBtn().click();
//		Thread.sleep(2000);
//		mbpage.getBannerImageCloseBtn().click();
//		Thread.sleep(2000);
//		mbpage.getEditBtn().click();
//		Thread.sleep(2000);
//		mbpage.getEditCloseBtn().click();
//		Thread.sleep(2000);
//		mbpage.getSearchEdt().sendKeys(search);	
    }
}