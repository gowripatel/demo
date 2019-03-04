package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority=1)
	public void createUser()
	{
		Reporter.log("Create User",true);
	}
	@Test(priority=2)
	public void editUser()
	{
		Reporter.log("Edit User",true);
	}
	@Test(priority=3)
	public void deleteUser()
	{
		Reporter.log("Delete User",true);
	}
}
