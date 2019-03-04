package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Listnesr1 extends TestListner {

	@Test
	public void test()
	{
		Assert.fail();
	}
	@Test
	public void test2()
	{

	}
	@Test(invocationCount=0)
	public void test3()
	{
		
	}
}
