package firstt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depend2 {
	
	@Test
	public void m1() {
		Reporter.log("from m1",true);
		Assert.fail();
	}
	@Test(dependsOnMethods="m1")
	public void m2()
	{
		Reporter.log("from m2",true);
	}

}
