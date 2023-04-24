package action_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
			
//			System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
			
			WebDriverManager.chromedriver().setup();	
		
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(op);
			
			driver.get("https://www.amazon.in/ref=nav_logo");
			
			driver.manage().window().maximize();
			
			try {
			
			driver.switchTo().alert().dismiss();
			
			}
			
			catch(NoAlertPresentException e) {
				
				System.out.println("Alert is not present");
				
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Headphones");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			System.out.println("headphone search complete");
			
			driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click();
			
			System.out.println("rating complete");
			
			driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("1000");
			
			driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("2000");
			
			driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
			
			System.out.println("price inserted");
			
//			driver.findElement(By.xpath("//*[@id=\"p_89/boAt\"]/span/a/div/label/i")).click();
//			
//			System.out.println("boat selected");
			
			List<WebElement> all = driver.findElements(By.xpath("//*[@class='a-icon a-icon-checkbox']"));
			
			System.out.println(all.size());
			
			for(WebElement single:all) {
				
				System.out.println(single);
				
			}
			
			
			driver.close();
		}


	}

