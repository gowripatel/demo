package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=4)
	public void createlogin(){
		Reporter.log("login create",true);
	}
	@Test(priority=2)
	public void createun(){
		Reporter.log("un create",true);
	}
	@Test(priority=3)
	public void createpw(){
		Reporter.log("pw create",true);
	}
	@Test(priority=1)
	public void createhomepage(){
		Reporter.log(" create homepage",true);
	}

}
