package window_popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> a = driver.getWindowHandles();
		Iterator<String> b = a.iterator();
		b.next();
		String c = b.next();
		
		driver.switchTo().window(c);
		
		driver.findElement(By.name("emailid")).sendKeys("abcd@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
	}
}
