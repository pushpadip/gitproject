package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test4 {
	@BeforeSuite
	public void bsuite() {
	System.out.println("I am before suite method");
	 }
	
	@AfterSuite
	public void asuite() {
	System.out.println("I am after suite method");
	 }
	
	@Test
	public void g() {
	System.out.println("I am g method");
	 }
		
	@Test
	public void h() {
	System.out.println("I am h method");
	}
}
