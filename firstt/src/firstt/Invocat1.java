package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocat1 {
	@Test(priority=0,invocationCount=2)
	public void m1()
	{
		Reporter.log("from m1()",true);
	}
   
	@Test(priority=-1,invocationCount=3)
	public void m2()
	{
		Reporter.log("from m2()",true);
	}

	@Test(priority=2,invocationCount=2)
	public void m3()
	{
		Reporter.log("from m3()",true);
	}
}
