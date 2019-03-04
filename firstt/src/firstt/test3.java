package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test3 extends TestDemo2
{
	@Test
	public void apple()
	{
		Reporter.log("hiii", true);
	}
	@Test()
	public void apple1()
	{
		Reporter.log("bye", true);
	}
}
