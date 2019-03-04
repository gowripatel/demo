package firstt;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 
{
	@Test
	public void b1()
	{
		Set<String> s = new HashSet<String>();
		Collections.addAll(s, "abc", "efg");
		
		Set<String> s1 = new HashSet<String>();
		Collections.addAll(s1, "ab", "efg");
		
		Assert.assertNotEqualsDeep(s, s1, "matching");
		
		System.out.println("both are not matching");
	}

}
