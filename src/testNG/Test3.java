package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
	@BeforeTest
	public void btest() {
		System.out.println("I am before test method");
	}
	
	@AfterTest
	public void atest() {
		System.out.println("I am after test method");
	}
 
	@Test
  public void e() {
	 System.out.println("I am e method");
  }
	
	@Test
	  public void f() {
		 System.out.println("I am f method");
	  }
}
