package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethod {
	@Test
	public void b(){
		Reporter.log("execute b",true);
	}
	@Test(dependsOnMethods={"b","m","c"})
	public void a(){
		Reporter.log("execute a",true);
	}
	@Test
	public void m(){
		Reporter.log("execute m",true);
	}
	@Test
	public void c(){
		Reporter.log("execute c",true);
	}

}
