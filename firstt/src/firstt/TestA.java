package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestA extends Testng1 {
	@Test
	public void test(){
		Reporter.log("my test a",true);
	}
}
