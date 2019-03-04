package firstt;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups {
	@BeforeMethod(alwaysRun=true)
	 public void login(){
		Reporter.log("alwaysrun",true);
		
		
	}
	@Test(priority=1,groups={"smoke"})
	public void homepage(){
		Reporter.log("homepage",true);

}
	@Test(priority=2,groups={"smoke"})
	public void createproduct(){
		Reporter.log("createproduct",true);
	
}
	@Test(priority=4,groups={"smoke","product"})
	public void addeproduct(){
		Reporter.log("addeproduct",true);
	
}
	@Test(priority=3,groups={"smoke","product"})
	public void byproduct(){
		Reporter.log("byproduct",true);
	
}
	@Test(priority=5,groups={"product"})
	public void logoutproduct(){
		Reporter.log("logoutproduct",true);
	
}}