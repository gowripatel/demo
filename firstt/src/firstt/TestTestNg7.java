package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestTestNg7 {

	@Test(groups="Integration")
	public void test1()
	{
		Reporter.log("First Integration", true);
	}
	@Test(groups="Integration")
	public void test2()
	{
		Reporter.log("Second Integration", true);
	}
	@Test(groups="Functional")
	public void test3()
	{
		Reporter.log("First Functional", true);
	}
}
