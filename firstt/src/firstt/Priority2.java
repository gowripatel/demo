package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 {
	@Test(priority=1)
	public void a()
	{
		Reporter.log("a", true);
	}
	@Test(priority=5)
	public void d()
	{
		Reporter.log("d", true);
	}

}
