package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void a() {
		System.out.println("I am a method");
	}
	@Test
	public void b() {
		System.out.println("I am b method");
	  }	  
	@Test(dependsOnMethods= {"d"},alwaysRun=true)
	public void c() {
		System.out.println("I am c method");	
	}
	@Test
		public void d() {
		Assert.assertEquals("asd","asd1");
	}
		
  }

