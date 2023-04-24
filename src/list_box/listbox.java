package list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.id("multiselect"));
		
		Select s = new Select(a);
		
		s.selectByIndex(0);
		
		Thread.sleep(2000);
		
		s.deselectByIndex(0);
		
		s.selectByValue("hyundai");
		
		Thread.sleep(2000);
		
		s.deselectByValue("hyundai");
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		s.deselectByVisibleText("Audi");
		
		driver.close();

	}

}
