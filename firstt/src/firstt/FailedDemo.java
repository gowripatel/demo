package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedDemo {

//	@Test(retryAnalyzer=firstt.FailedtestCasesdemo.class)
//	public void demo1() {
//	Assert.fail();
//	}
	
	@Test
	public void demo2() {
		System.out.println("demo2 passed");
//		Assert.fail();
	}
}
