package action_class;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bandhan {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://bandhanbank.com/");
		
		driver.findElement(By.xpath("(//*[@class='img-fluid gg'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"block-toprightmenu\"]/ul/li[4]/div/a[1]")).click();
		
		String parenthandle = driver.getWindowHandle();
		
		System.out.println("Parent window = " + parenthandle);
		
		Set<String>handles =driver.getWindowHandles();
				
		Iterator<String> it =handles.iterator();
		
		String Parent = it.next();
		
		System.out.println(Parent);
	
		String child = it.next();
		
		System.out.println(child);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
