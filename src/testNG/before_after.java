package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class before_after {
  @Test
  public void a() {
	  System.out.println("I am a method");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am before method");
  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am after method");
  }
  
  @Test
  public void b() {
	  System.out.println("I am b method");
  }
  
  @Test
  public void c() {
	  System.out.println("I am c method");
  }
  
  @BeforeClass
  public void beforeclass() {
	  System.out.println("I am before class");
  }
  

  @AfterClass
  public void afterclass() {
	  System.out.println("I am after class");
  }

}
