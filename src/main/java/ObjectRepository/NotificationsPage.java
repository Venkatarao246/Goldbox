package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationsPage {

	@FindBy(xpath ="//span[text()='Notifications']")private WebElement NotificationsLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-added']")private WebElement AddNotificationBtn;
	
	@FindBy(xpath ="(//input[@formcontrolname='title'])[1]")private WebElement TitleEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='message'])[1]")private WebElement MessageEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='type'])[1]")private WebElement TypeEdt;
	
	@FindBy(xpath ="//button[text()='Add']")private WebElement AddBtn;
	
	
	public NotificationsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNotificationsLink() {
		return NotificationsLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddNotificationBtn() {
		return AddNotificationBtn;
	}

	public WebElement getTitleEdt() {
		return TitleEdt;
	}

	public WebElement getMessageEdt() {
		return MessageEdt;
	}

	public WebElement getTypeEdt() {
		return TypeEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	
	public void Notifications(String title,String message,String type,String search) throws Exception
	{
		NotificationsLink.click();
		Thread.sleep(2000);
		AddNotificationBtn.click();
		Thread.sleep(2000);
		TitleEdt.sendKeys(title);
		Thread.sleep(2000);
		MessageEdt.sendKeys(message);
		Thread.sleep(2000);
		TypeEdt.sendKeys(type);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
