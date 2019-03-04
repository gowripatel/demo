package firstt;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestTestNgBase {

	@BeforeMethod
	public void testB()
	{
		Reporter.log("From BaseTest", true);
	}
	
	@AfterMethod
	public void testAm()
	{
		Reporter.log("From BaseTest After", true);
	}
}

