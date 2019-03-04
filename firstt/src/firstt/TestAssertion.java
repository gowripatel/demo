package firstt;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion {
	
	@Test
	public void asser()
	{
		String expectedTitle="Alia";
		String actualTitle="Alia";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("actual is matching with expected tittle");
		
		
		boolean actual=true;
		boolean expected=true;
		Assert.assertEquals(actual, expected);
		System.out.println("actual is matching the expected");
		
		Set <String> s=new HashSet<>();
		Collections.addAll(s, "abs","xyz","def");
		
		Set <String> s2=new HashSet<>();
		Collections.addAll(s2, "abs","xyz","def");
		
		
		
		Assert.assertNotEqualsDeep(s, s2,"not matching");
		
		SoftAssert sa=new SoftAssert();
		boolean a=true;
		boolean b=false;
		sa.assertEquals(a, b, "not matching");
		System.out.println("helo");
		
		sa.assertTrue(true);
		System.out.println("helo1");
		sa.assertAll();
		
		
	
		
	}

}
