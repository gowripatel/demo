package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserGroup extends BaseTestGroup 
{
@Test(groups= {"user","smoke"})
public void createUser()
{
	Reporter.log("createUser", true);
}
@Test(groups= {"user"})
public void editUser()
{
	Reporter.log("editUser", true);
}

@Test(groups= {"user"})
public void exportUser()

{
	Reporter.log("exportUser", true);	
}
@Test(groups= {"user","smoke"})
public void removeUser()
{
	Reporter.log("removeUser", true);
}
}
