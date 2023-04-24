package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		String as = driver.getCurrentUrl();
		
		System.out.println(as);
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		String a = driver.switchTo().alert().getText();
		
		System.out.println(a);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
