package dependsOnGroups;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {
	@Test(groups="bhahubhali2",dependsOnGroups="bhahubhali1")
	public void normaltestcase()
	{
		Reporter.log("running",true);
	}

	@Test(groups="bhahubhali1")
	public void smoketestcase()
	{
		Reporter.log("running 2",true);
		Assert.fail();
	}
}
