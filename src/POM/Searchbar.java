package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchbar {
	
	@FindBy(name="q")
	private WebElement searchbar;
	
	@FindBy(xpath="(//input[@value='Google Search'])[2]")
	private WebElement search;
	
	public Searchbar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enter_data() {
		searchbar.sendKeys("amazon");
	}
	
	public void enter_click() {
		search.click();
	}

}
