package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestInvocation extends TestDemo2
{
	@Test(invocationCount = 2)
	public void test()
	{
		Reporter.log("hiiii", true);
	}

}
