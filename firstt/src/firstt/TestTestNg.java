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

	@Test
	public void testMethod()
	{
		Reporter.log("From Test Method 1", true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("From Before Method",true);
	}
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("From Before Suite", true);
	}
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("From Before Test", true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("From Before class", true);
	}
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("From After Suit", true);
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("From After Test", true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("From After Class", true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("From After Method", true);
	}
}
