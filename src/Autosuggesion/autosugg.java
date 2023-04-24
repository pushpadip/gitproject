package Autosuggesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autosugg {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "G:/dss class/Softwere/crome/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("realme");
		
		List<WebElement> a = driver.findElements(By.tagName("li"));
		
		int b = a.size();
		
		for(int i=0; i<b; i++)
		{
			String c = a.get(i).getText();
			System.out.println(c);
		}
		
		Actions as = new Actions(driver);
		for(int i=0; i<8; i++)
		{
			as.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);		
		}
		as.sendKeys(Keys.ENTER).build().perform();
	}
}
