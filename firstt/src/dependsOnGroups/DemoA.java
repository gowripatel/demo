package dependsOnGroups;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoA {

	@Test(dependsOnGroups="name")

	public void run()
	{
//		Assert.fail();
		Reporter.log("running 1",true);
	}
	@Test(groups="name")

	public void run2()
	{
		
		Reporter.log("running 2",true);
		Assert.fail();
	}
}
