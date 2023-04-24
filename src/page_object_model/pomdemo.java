package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomdemo {

	@FindBy(name="q")
	private WebElement SEARCH;
	
	public pomdemo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void search() throws InterruptedException
	{
		SEARCH.sendKeys("Selenium");
	}
}
