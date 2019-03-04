package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mixed {
	@Test(dependsOnMethods="d")
	public void b(){
		Reporter.log("execute b",true);    //last
	
	}
	@Test
	public void a(){
		Reporter.log("execute a",true);   //sec

}
	
	
	@Test
	public void d(){
		Reporter.log("execute d",true);   //first
	}
	
	
	@Test
	public void c(){
		Reporter.log("execute c",true);   //thi
}}