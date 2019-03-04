package firstt;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(firstt.listners.class)

public class runningfailedtest
{
	@Test(retryAnalyzer=firstt.iretryanalizer.class)
	public void b1()
	{
		Assert.assertTrue(false);
		System.out.println("b1");
	}
	
	@Test
	public void b2()
	{
//		Assert.assertTrue(false);
		System.out.println("b2");
	}

}
