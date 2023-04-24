package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.uitestpractice.com/Students/Actions");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement ab = driver.findElement(By.id("draggable"));
		
		WebElement ac = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(ab, ac).build().perform();
		
		
	}

}
