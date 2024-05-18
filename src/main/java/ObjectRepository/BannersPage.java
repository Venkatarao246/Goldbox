package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BannersPage {

	@FindBy(xpath ="//span[text()='Banners']")private WebElement BannersLink;
	
	@FindBy(xpath ="//a[@href='/banners/main-banner']")private WebElement MainBannersLink;
	
	@FindBy(xpath ="//a[@href='/banners/splash-banner']")private WebElement SplashBannersLink;
	
	@FindBy(xpath ="//a[@href='/banners/ecom-banner']")private WebElement EcomBannersLink;
	
	public BannersPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getBannersLink() {
		return BannersLink;
	}

	public WebElement getMainBannersLink() {
		return MainBannersLink;
	}

	public WebElement getSplashBannersLink() {
		return SplashBannersLink;
	}

	public WebElement getEcomBannersLink() {
		return EcomBannersLink;
	}
	
	public void ClickOnBanners()
	{
		BannersLink.click();
	}
	
	public void ClickOnMainBanners()
	{
		MainBannersLink.click();
	}
	
	public void ClickOnSplashBanners()
	{
		SplashBannersLink.click();
	}
	
	public void ClickOnEcomBanners()
	{
		EcomBannersLink.click();
	}
}
