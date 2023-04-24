package POM;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class main1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();

//		Gmail p3 = new Gmail(driver);
//		p3.search();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		
//		Searchbar p4 = new Searchbar(driver);
//		p4.enter_data();
//		p4.enter_click();
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
		
		Image_tab_validation p5 = new Image_tab_validation(driver);
		p5.Image();
		
		String ExpectedTitle = "Google Images";
		String ActualTitle = driver.getTitle();
		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
		
		System.out.println("test complete");
		
		Thread.sleep(3000);
		driver.close();

	}

}
