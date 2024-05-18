package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage {

	@FindBy(xpath ="//span[text()='Gift Cards']")private WebElement GiftCardsLink;
	
	@FindBy(xpath ="//a[@href='/giftcard/all-gift-cards']")private WebElement AllGiftCardsLink;
	
	public GiftCardsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getGiftCardsLink() {
		return GiftCardsLink;
	}

	public WebElement getAllGiftCardsLink() {
		return AllGiftCardsLink;
	}
	
	public void Giftcards()
	{
		GiftCardsLink.click();
	}
	
	public void AllGiftcards()
	{
		AllGiftCardsLink.click();
	}
}
