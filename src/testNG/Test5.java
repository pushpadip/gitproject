package testNG;

import org.testng.annotations.Test;

public class Test5 {
  @Test(groups= {"sanity"})
  public void a() {
	  System.out.println("i am a method");
  }
  
  @Test(groups= {"sanity","regression"})
  public void b() {
	  System.out.println("i am b method");
  }
  
  @Test
  public void c() {
	  System.out.println("i am c method");
  }
  
  @Test(groups= {"regression"})
  public void d() {
	  System.out.println("i am d method");
  }
  
  @Test(groups= {"regression"})
  public void e() {
	  System.out.println("i am e method");
  }
}
