package total_links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class total_no_broken_links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> a = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are " + a.size());
		
		for(int i=0; i<a.size(); i++)
		{
			WebElement b = a.get(i);
			String url = b.getAttribute("href");
			verifyLinkActive(url);	
		}
	}

	private static void verifyLinkActive(String linkurl) {
		try
		{
			URL url = new URL (linkurl);
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()==200)
			{
				System.out.println(linkurl+" - "+httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) 
			{
				System.out.println(linkurl+"-"+httpURLConnect.getResponseMessage() + " - " +HttpURLConnection.HTTP_NOT_FOUND);
			}
			
		}
		
		catch(Exception e){
			
		}
	}

}
