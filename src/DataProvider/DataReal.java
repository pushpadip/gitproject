package DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class DataReal {
	public RemoteWebDriver driver;
 
  @BeforeMethod
	public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }
  
  @DataProvider(name="TestData")
	 public Object getData1(){
		  Object[][] data=new Object[1][2];
		  
		  data[0][0]="user1";
		  data[0][1]="password1";
		  return data;
  }
 
  @Test(dataProvider="TestData")
  public void login(String username,String password) throws InterruptedException
  {
	  driver.findElement(By.name("email")).clear();
	  driver.findElement(By.name("email")).sendKeys(username);
	  driver.findElement(By.name("pass")).clear();
	  driver.findElement(By.name("pass")).sendKeys(password);
	  
	  Thread.sleep(5000);
	  driver.findElement(By.name("login")).click();
  
  }

}
