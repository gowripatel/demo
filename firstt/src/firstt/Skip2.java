package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skip2 {
	
	@Test
	public void m1()
	{
		Reporter.log("from m1()",true);
	}
	@Test(enabled=false)   //to skip this method we use (enabled=false)
	public void m2()
	{
		Reporter.log("from m2()",true);
	}

	
	@Test(enabled=true)
	public void m3()
	{
		Reporter.log("from m3()",true);
	}
}
