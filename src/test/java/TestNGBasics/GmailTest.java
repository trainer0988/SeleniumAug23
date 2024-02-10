package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailTest {
	
	@Test(groups = {"HR"})
	public void test1()
	{
		System.out.println("Test - test case 1");
	}
	
	
	@Test(groups = {"HR", "Admin"})
	public void test2()
	{
	
		System.out.println("Test - test case 2");
	
	}
	
	@BeforeMethod
	public void test3()
	{
		System.out.println("BeforeMethod - open browser");
	}
	@AfterMethod
	public void test4()
	{
		System.out.println("AfterMethod - close browser");
	}
	
	@BeforeClass
	public void test5()
	{
		System.out.println("BeforeClass - creating bd connection");
	}
	
	@AfterClass
	public void test6()
	{
		System.out.println("AfterClass - close db connection");
	}
	
	@BeforeTest
	public void test7()
	{
		System.out.println("BeforeTest- read property file");
	}
	
	@AfterTest
	public void test8()
	{
		System.out.println("AfterTest- close propert file");
	}
	
	
	@BeforeSuite
	public void test9()
	{
		System.out.println("BeforeSuite- read excel file");
	}
	
	@AfterSuite
	public void test10()
	{
		System.out.println("AfterSuite- close excel file");
	}
	
	
	
	
	
	

}
