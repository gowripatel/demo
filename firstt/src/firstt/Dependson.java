package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependson
{
	@Test()
	
	public void method1()
	
	{
		Reporter.log("hii",true);
	}
	
	@Test(dependsOnMethods = "method1")
	public void method2()
	{
		Reporter.log("hello",true);
	}
	
	@Test(dependsOnMethods = "method1")
	public void method3()
	{
		Reporter.log("bye",true);
	}
	@Test(priority = 2, dependsOnMethods = "method1")
	public void method4()
	{
		Reporter.log("bye bye",true);
	}
}
