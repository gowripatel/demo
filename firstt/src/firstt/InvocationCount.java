package firstt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(priority=1)
	public void createUser()
	{
		Reporter.log("Create User",true);
	Assert.fail();
	}
	@Test(priority=2, invocationCount=2,enabled=true)
	public void editUser()
	{
		Reporter.log("Edit User",true);
	}
	@Test(dependsOnMethods="createUser")
	public void deleteUser()
	{
		Reporter.log("Delete User",true);
	}
}
