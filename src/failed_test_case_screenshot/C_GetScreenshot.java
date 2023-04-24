package failed_test_case_screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class C_GetScreenshot extends A_MainTest{
	
	public static String capture(String screenshotName) throws IOException {
		File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File b = new File("G:/dss class/screenshot/qwe.bmp");
		FileUtils.copyFile(a, b);
		return screenshotName;
	}

}
