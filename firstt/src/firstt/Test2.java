package firstt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 
{
	
	
	
	@Test(priority = 1)
	public void abc()
	{
		Reporter.log("method abc", true);
	}
	
	@Test(priority = 2)
	public void abc1()
	{
		Reporter.log("method abc1", true);
	}
	@Test(priority = 2,enabled = false)
	public void abcde()
	{
		Reporter.log("method abcde", true);
	}
	
	@Test(priority = 3)
	public void abcd()
	{
		Reporter.log("method abcd", true);
		Assert.fail();
	}
	
	@Test(priority = 4, dependsOnMethods = {"abcd"})
	public void abcdf()
	{
		Reporter.log("method abcdf", true);
	
	}
	
	
	
	
	
}
