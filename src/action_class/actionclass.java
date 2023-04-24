package action_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actionclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement w = driver.findElement(By.id("searchDropdownBox"));
		
//		w.click();
		Thread.sleep(2000);
		
//		Actions a = new Actions(driver);
//		
//		for(int i=1; i<=10; i++)
//		{
//			a.sendKeys(Keys.ARROW_DOWN).build().perform();
//			Thread.sleep(1000);
//		}
//		Thread.sleep(2000);
//		for(int i=1; i<=5; i++)
//		{
//			a.sendKeys(Keys.ARROW_UP).build().perform();
//			Thread.sleep(1000);
//		}
//		
//		a.sendKeys(Keys.ENTER).build().perform();
//		
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Select s = new Select (w);
		
		List<WebElement>list =s.getOptions();
		for(int i=0;i<list.size();i++) {
			String text = list.get(i).getText();
			System.out.println(text);
		}
		boolean book = list.equals("Books");
//		System.out.println(book);
//		s.selectByVisibleText("Books");
//		
//		Thread.sleep(2000);
		
		driver.close();
	
	}

}

