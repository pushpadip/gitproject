package POM_CLASS;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM_DEMO {
	
	@FindBy(name="q")
	private WebElement SEARCH;
	
	public POM_DEMO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void search() 
	{
		SEARCH.sendKeys("Selenium");
	}

}
