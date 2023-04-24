package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();

		pomdemo a1 = new pomdemo(driver);
		a1.search();
		
		Thread.sleep(2000);
		
		pomdemo2 a2 = new pomdemo2(driver);
		a2.gmail();
	}
}
