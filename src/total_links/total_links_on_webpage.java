package total_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class total_links_on_webpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> a = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<a.size(); i++)
		{
			String b = a.get(i).getText();
			System.out.println(b);
			Thread.sleep(1000);
		}

	}

}
