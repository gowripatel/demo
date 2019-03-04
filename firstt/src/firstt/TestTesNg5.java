package firstt;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestTesNg5 {

	@Test
	public void test1()
	{
		Reporter.log("1st", true);
	}
	@Test(enabled=false)
	public void test2()
	{
		Reporter.log("2st", true);
	}
	@Ignore
	@Test
	public void test3()
	{
		Reporter.log("3rd", true);
	}
	@Test(dependsOnMethods= {"test5","test1"})
	public void test4()
	{
		Reporter.log("4th", true);
	}
	@Test(invocationCount=3,priority=1)
	public void test5()
	{
		Reporter.log("5th", true);
		
	}
	
}
