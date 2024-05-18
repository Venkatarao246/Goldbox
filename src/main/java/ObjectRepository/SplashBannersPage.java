package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SplashBannersPage {

	@FindBy(xpath ="//a[@href='/banners/splash-banner']")private WebElement splashBannersLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddSplashBannersBtn;
	
	@FindBy(xpath ="(//input[@formcontrolname='fromdate'])[1]")private WebElement FromDateEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='todate'])[1]")private WebElement ToDateEdt;
	
	@FindBy(xpath ="(//input[@accept='image/jpeg, image/png, image/gif'])[1]")private WebElement UploadBannerImageEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='sequence'])[1]")private WebElement SquenceEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
    @FindBy(xpath ="//button[text()='View']")private WebElement BannerImageViewBtn;
	
	@FindBy(xpath ="(//button[@aria-label='Close'])[2]")private WebElement BannerImageCloseBtn;
	
	@FindBy(xpath ="//button[@class='btn-sm btn-edit mr-2']")private WebElement EditBtn;
	
	@FindBy(xpath ="(//button[@class='btn-close'])[3]")private WebElement EditCloseBtn;
	
	public SplashBannersPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSplashBannersLink() {
		return splashBannersLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddSplashBannersBtn() {
		return AddSplashBannersBtn;
	}

	public WebElement getFromDateEdt() {
		return FromDateEdt;
	}

	public WebElement getToDateEdt() {
		return ToDateEdt;
	}

	public WebElement getUploadBannerImageEdt() {
		return UploadBannerImageEdt;
	}

	public WebElement getSquenceEdt() {
		return SquenceEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getBannerImageViewBtn() {
		return BannerImageViewBtn;
	}

	public WebElement getBannerImageCloseBtn() {
		return BannerImageCloseBtn;
	}

	public WebElement getEditBtn() {
		return EditBtn;
	}

	public WebElement getEditCloseBtn() {
		return EditCloseBtn;
	}
	
	public void SplashBanners(String fromdate,String todate,String uploadbannerimage,String sequence,String search) throws Exception

	{
		splashBannersLink.click();
		Thread.sleep(2000);
		AddSplashBannersBtn.click();
		Thread.sleep(2000);
		FromDateEdt.sendKeys(fromdate);
		Thread.sleep(2000);
		ToDateEdt.sendKeys(todate);
		Thread.sleep(2000);
		UploadBannerImageEdt.sendKeys(uploadbannerimage);
		Thread.sleep(2000);
		SquenceEdt.sendKeys(sequence);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(4000);
		BannerImageViewBtn.click();
		Thread.sleep(2000);
		BannerImageCloseBtn.click();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		EditCloseBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
