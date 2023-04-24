package testNG;

import org.testng.annotations.Test;

public class Test6 {
 
	@Test
  public void a() {
		long a1 = Thread.currentThread().getId();
		System.out.println("a method is executed on id::" +a1);
  }
	
	@Test
	  public void b() {
			long b1 = Thread.currentThread().getId();
			System.out.println("b method is executed on id::" +b1);
	}		
	@Test
	  public void c() {
			long c1 = Thread.currentThread().getId();
			System.out.println("c method is executed on id::" +c1);
	}
}
