package TestngfrmeBasic2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEmp {
   
	@DataProvider(name = "logindata")
	public Object[][] testcase()
	{
		return new Object[][]
		{
			{"user1","password1"},
			{"user2","password2"}
		};
		
		
	}

	@Test
	public void load(String username, String Password)
	{
		System.out.println("UserName : "+username +"Password : "+Password);
	}
}
