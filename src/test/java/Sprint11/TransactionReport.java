package Sprint11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LedgerReportsPage;
import ObjectRepository.LoginPage;
import ObjectRepository.TransactionReportPage;

public class TransactionReport {

	@Test
	public void sample30() throws Exception 
	{
		String email="soumya@gmail.com";
		String password="goldsikka@2024";
		String Startdate ="18-05-2024";
		String EndDate ="30-05-2024";
		String mobile ="9063685857";
		
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
		LedgerReportsPage lrpage =new LedgerReportsPage(driver);
		lrpage.ClickOnLedgerReports();
//		lrpage.getLedgerReportsLink().click();
		Thread.sleep(2000);
		TransactionReportPage trpage = new TransactionReportPage(driver);
		trpage.TransactionReport(Startdate, EndDate, mobile);
//		trpage.getTransactionReportLink().click();
//		Thread.sleep(2000);
//		trpage.getStartDateEdt().sendKeys(Startdate, Keys.TAB, EndDate);
//		Thread.sleep(2000);
//		trpage.getMobileNumberEdt().sendKeys(mobile);
//		Thread.sleep(2000);
//		trpage.getGetReportBtn().click();
//		Thread.sleep(2000);
//		driver.quit();
   }
}