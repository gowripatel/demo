package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skip3 {

	
	@Test
	public void m1()
	{
		Reporter.log("from m1()",true);
	}
	@Test(invocationCount=0)
	public void m2()
	{
		Reporter.log("from m2()",true);
	}
}
