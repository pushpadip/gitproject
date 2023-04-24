package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Image_tab_validation {
	
	@FindBy (linkText="Images")
	private WebElement Image_tab;
	
	public Image_tab_validation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Image() {
		Image_tab.click();
	}

}
