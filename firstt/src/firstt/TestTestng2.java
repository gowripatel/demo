package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestTestng2  extends TestTestNg{
	@Test(invocationCount=2)
	public void testTestNg2()
	{
		Reporter.log("From 3rd Class Test", true);
	}
	

}
