package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3a {
	
	@Test
	public void run()
	{
		Assert.assertTrue(false);// we intentionally failing this method
		System.out.println("test 3 is running");
	}
	
	@Test
	public void run2()
	{
		System.out.println("run2");
	}

}
