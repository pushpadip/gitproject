package failed_test_case_screenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_CaptureScreenshot extends A_MainTest {

	@Test
	public void CaptureScreenshot() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		//Facebook – log in or sign up
		Assert.assertEquals("Facebook – log in or sign up", title);
		
		Thread.sleep(6000);
	
	}
}
