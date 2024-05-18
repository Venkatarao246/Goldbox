package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsPage {

    @FindBy(xpath ="//span[text()='Events']")private WebElement EventsLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	public EventsPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEventsLink() {
		return EventsLink;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
	}
	
	
	public void Events(String search) throws Exception
	{
		EventsLink.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(search);
	}
}
