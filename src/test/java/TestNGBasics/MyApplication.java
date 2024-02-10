package TestNGBasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class MyApplication {
	
	@Test
	@Parameters({"passcode1"})
	public void dolin(String passcode)
	{
		System.out.println("enter passcode : "+passcode);
		System.out.println("Login done");
	}
	
	
	
	
	
	

}
