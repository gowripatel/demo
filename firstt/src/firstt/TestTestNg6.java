package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestTestNg6 {
	@Test
	public void a()
	{
		Reporter.log("a", true);
	}
	@Test(dependsOnMethods= {"d"})
	public void b()
	{
		Reporter.log("b", true);
	}
	@Test
	public void c()
	{
		Reporter.log("c", true);
	}
	@Test
	public void d()
	{
		Reporter.log("d", true);
	}
	@Test
	public void e()
	{
		Reporter.log("e", true);
	}
}
