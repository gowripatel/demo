package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority=1)
	public void a()
	{
		Reporter.log("c", true);
	}
	@Test(priority=3)
	public void b()
	{
		Reporter.log("b", true);
	}

}
