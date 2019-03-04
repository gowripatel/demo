package firstt;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestertAssert {
@Test
public void test()
{
	String expected = "welcome payal";
	String actual = "welcom payal";
	Assert.assertEquals(actual, expected);
	System.out.println("actual is matching with expected");
	
}	

@Test
public void test1()
{
	Set<String>  s = new HashSet<String>();
	Collections.addAll(s, "abc" ,"def", "fgh");
	
	Set<String> s1 = new HashSet<String>();
	
	Collections.addAll(s1, "abc" ,"df", "fgh");
	
	Assert.assertNotEqualsDeep(s, s1, "matching");
	
}
}
