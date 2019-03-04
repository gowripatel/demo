package firstt;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestGroup {
	@BeforeMethod
	public void login()
	{
		Reporter.log("login", true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout", true);	
	}

}
