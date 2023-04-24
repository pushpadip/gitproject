package failed_test_case_screenshot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class D_ListenerTest implements ITestListener{

	public void onTestFailure(ITestResult result) {
		
		try {
			C_GetScreenshot.capture(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
