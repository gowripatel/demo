package firstt;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(firstt.TestListner.class)
public class TestFailed {

	@Test(retryAnalyzer=firstt.Retry.class)
	public void run()
	{
		Assert.assertTrue(false);
		System.out.println("Method which is failing");
	}
	
	@Test
	public void run2() {
		System.out.println("Method which is not failing");
	}
}
