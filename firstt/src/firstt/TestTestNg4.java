package firstt;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestTestNg4 {

	@Test(invocationCount=2,priority=1)
	public void testTest1()
	{
		Reporter.log("1st test Method", true);
	}
	
	@Test(dependsOnMethods= {"testTest1", "test3"},priority=2)
	public void testTest2()
	{
		Reporter.log("2nd Test Method", true);
	}
	
	@Test(priority=3)
	public void test3()
	{
		Reporter.log("3 rd Test Method", true);
	}
	
}
