package firstt;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(firstt.DemoListner.class)
public class Listdemo {
	@Test
	public void test1()
	{
		
		Assert.assertFalse(true);
	}
	@Test
	public void test2()
	{
		
	}

}
