package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class depend1 {
	@Test
	public void b1()
	{
		Reporter.log("from b1",true);
	}
	
	@Test(dependsOnMethods="b1")
	public void b2()
	{
		Reporter.log("from b2",true);
	}
	

}
