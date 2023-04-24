package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {
	
	@FindBy(linkText="Gmail")
	private WebElement gmail;

	public Gmail(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void search() {
		
		gmail.click();
	}
}
