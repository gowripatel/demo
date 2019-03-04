package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount=3)
	public void m1(){
		Reporter.log("my 1st method",true);

}
	@Test(invocationCount=2)
	
	public void m2(){
		Reporter.log("my 2nd method",true);
	}
}