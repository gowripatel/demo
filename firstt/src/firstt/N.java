package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class N {
	
	@Test(priority=1)
	public void createuser(){
		
		Reporter.log("create user",true);

}
	
	@Test(priority=3)
	public void loginuser(){
		
		Reporter.log("login user",true);
	
	
}
	
	
	
	
	
	}