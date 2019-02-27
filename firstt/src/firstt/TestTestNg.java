package firstt;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTestNg {
	
	@Test(priority=1)
	public void test()
	{
		
	Reporter.log("first test method", true);
	}
	
	@BeforeSuite
	public void test1()
	{
		
		Reporter.log("Before Suite", true);
	}
	
	@BeforeTest
	public void test2()
	{
		
		Reporter.log("Before test", true);	
	}
	@BeforeClass
	public void test3()
	{
		Reporter.log("Before class", true);
	}
	
	@BeforeMethod
	public void test4()
	{
		
	Reporter.log("Before method", true);
	}
	@AfterMethod
	public void test5()
	{
		Reporter.log("After Method", true);
	}
	@AfterClass
	public void test6()
	{
		Reporter.log("After Class", true);
	}
	@AfterTest
	public void test7()
	{
		Reporter.log("After Test", true);
	}
	@AfterSuite
	public void test8()
	{
		Reporter.log("After Suite", true);
	}
	
	

}
