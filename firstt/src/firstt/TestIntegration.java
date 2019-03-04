package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestIntegration extends TestTestNgBase{
	
	@Test(groups="Integration")
	public void fIntegration()
	{
		Reporter.log("First Integration", true);
	}
	
	@Test(groups="Integration")
	public void sIntegration()
	{
		Reporter.log("Second Integration", true);
	}
	@Test(groups="smoke")
	public void smoke()
	{
		Reporter.log("smoke", true);
	}
}
