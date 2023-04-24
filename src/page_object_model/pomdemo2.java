package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomdemo2 {
	
	@FindBy(linkText="Gmail")
	private WebElement gmail;
	
	public pomdemo2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gmail()
	{
		gmail.click();
	}

}
