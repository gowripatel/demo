package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups {
@Test(groups = {"Smoke","functional"})
	
	public void logIn()
	
	{
		Reporter.log("hii",true);
	}
	
	@Test(groups = "Smoke")
	public void logOut()
	{
		Reporter.log("hello",true);
	}
	
	@Test(groups = "functional")
	public void update()
	{
		Reporter.log("bye",true);
	}
	@Test(groups = "functional")
	public void delete()
	{
		Reporter.log("bye bye",true);
	}
	@Test(groups = "system")
	public void modify()
	{
		Reporter.log("bye",true);
	}
}
