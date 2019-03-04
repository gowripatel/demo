package firstt;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Skip1 {

	@Test
	public void m1()
	{
		Reporter.log("from m1()",true);
	}
	
	@Test
   @Ignore     // to skip this method we use @Ignore
	public void m2()
	{
		Reporter.log("from m2()",true);
	}
	
}
