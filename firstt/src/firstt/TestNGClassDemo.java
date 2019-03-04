package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGClassDemo {
	@Test(groups="name")
	public void run() {
		Assert.fail();
		System.out.println("run");
		
	}
	
	@Test(groups="place")
	public void run2() {
		System.out.println("run2");
	}
	
}
