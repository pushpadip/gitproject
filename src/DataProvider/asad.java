package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class asad {

@DataProvider(name="TestData")
	 public Object[][]getData1(){
		  Object[][] data=new Object[1][2];
		  
		  data[0][0]="user1";
		  data[0][1]="password1";
		  return data;
	  }
	  
	  @Test(dataProvider="TestData")
	  public void login(String username,String password)
	  {
		  System.out.println("Username is:: " +username);
		  System.out.println("Password is:: " +password);
		  
	  }
	}

