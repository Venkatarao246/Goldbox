package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

   @FindBy(xpath = "//span[text()='Users']")private WebElement UsersLink;
	
	@FindBy(xpath = "//span[text()='Schemes']")private WebElement SchemesLink;
	
	@FindBy(xpath = "//span[text()='Ecommerce']")private WebElement EcommerceLink;
	
	@FindBy(xpath = "//span[text()='Banners']")private WebElement BannersLink;
	
	@FindBy(xpath = "//span[text()='Coupons']")private WebElement CouponsLink;
	
	@FindBy(xpath = "//span[text()='Gift Cards']")private WebElement GiftCardsLink;
	
	@FindBy(xpath = "//span[text()='Notifications']")private WebElement NotificationsLink;
	
	@FindBy(xpath = "//span[text()='Transactions']")private WebElement TransactionsLink;
	
	@FindBy(xpath = "//span[text()='Trading']")private WebElement TradingLink;
	
	@FindBy(xpath = "//span[text()='Events']")private WebElement EventsLink;
	
	@FindBy(xpath = "//span[text()='Ledger reports']")private WebElement LedgerReportsLink;
	
	@FindBy(xpath = "//span[text()='Settings']")private WebElement SettingsLink;
	
	@FindBy(xpath = "//span[@class='mat-mdc-button-touch-target']")private WebElement MatDatepickerLink;
	
	@FindBy(xpath = "//span[text()='Soumya']")private WebElement ProfileLink;
	
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsersLink() {
		return UsersLink;
	}

	public WebElement getSchemesLink() {
		return SchemesLink;
	}

	public WebElement getEcommerceLink() {
		return EcommerceLink;
	}

	public WebElement getBannersLink() {
		return BannersLink;
	}

	public WebElement getCouponsLink() {
		return CouponsLink;
	}

	public WebElement getGiftCardsLink() {
		return GiftCardsLink;
	}

	public WebElement getNotificationsLink() {
		return NotificationsLink;
	}

	public WebElement getTransactionsLink() {
		return TransactionsLink;
	}

	public WebElement getTradingLink() {
		return TradingLink;
	}

	public WebElement getEventsLink() {
		return EventsLink;
	}

	public WebElement getLedgerReportsLink() {
		return LedgerReportsLink;
	}

	public WebElement getSettingsLink() {
		return SettingsLink;
	}

	public WebElement getMatDatepickerLink() {
		return MatDatepickerLink;
	}

	public WebElement getProfileLink() {
		return ProfileLink;
	}
}
