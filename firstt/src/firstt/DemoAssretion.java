package firstt;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssretion {
	@Test
	public void asser()
	{
	String exp="pushpendra.fb.com";
	String act="pushpendra.fb.com";
	Assert.assertEquals(act, exp);
	System.out.println("hiiii");
		
	}
	@Test
	public void asser1()
	{
       boolean exp = true;
	 boolean act = true;
	Assert.assertEquals(act, exp);
	System.out.println("bye ");
	
	Set<String> s=new HashSet<>();
	Collections.addAll(s, "abc","xyz");
	
	Set<String> s1=new HashSet<>();
	Collections.addAll(s1, "abc","xyz");
	
	Assert.assertEqualsDeep(s, s1, "pass");
	
	//===============================================================================================
			SoftAssert ass=new SoftAssert();
	         String s2="pushpendra Singh";
	         String s3="pushpendra Singh";
	         
	        ass.assertEquals(s2, s3);
	        ass.assertAll();
	        
	        
		
	}
	

}
