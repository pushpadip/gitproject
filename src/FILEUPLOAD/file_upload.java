package FILEUPLOAD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("G:/dss class/automation/1.Automation Introduction.docx");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();

	}

}
