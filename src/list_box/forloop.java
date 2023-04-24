package list_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class forloop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/Softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.id("multiselect"));
		
		Select s = new Select(a);
		
		List<WebElement> b=s.getOptions();
		
		for (int i=0; i<b.size(); i++)
		{
			b.get(i).click();
			Thread.sleep(2000);
			
		}
		driver.close();
	}

}
