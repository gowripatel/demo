package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depend {
	@Test(dependsOnMethods= {"d","a"})
	public void b()
	{
		Reporter.log("from b",true);
	}
	
	@Test()
	public void a()
	{
		Reporter.log("from a",true);
	}

	@Test()
	public void c()
	{
		Reporter.log("from c",true);
	}
	
	@Test()
	public void d()
	{
		Reporter.log("from d",true);
	}
	

}
