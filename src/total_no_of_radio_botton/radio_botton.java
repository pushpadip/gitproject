package total_no_of_radio_botton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_botton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> a = driver.findElements(By.name("webform"));
		
		for (int i=0; i<a.size(); i++)
		{
			a.get(i).click();
			Thread.sleep(2000);
		}
	}
}
