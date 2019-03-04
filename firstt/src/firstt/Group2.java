package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group2 {
	

	@Test(groups="smoke")
	public void m1()
	{
		Reporter.log("from m1()",true);
		
	}
	@Test
	public void m2()
	{
		Reporter.log("from m2()",true);
		
	}
	@Test
	public void m3()
	{
		Reporter.log("from m3()",true);
		
	}

}
