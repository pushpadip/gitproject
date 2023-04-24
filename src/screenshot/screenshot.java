package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","G:/dss class/Softwere/crome/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Gmail")).click();
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File a = new File("G:/dss class/screenshot/abc.bmp");
		
		FileUtils.copyFile(s,a);
		
	}

}
