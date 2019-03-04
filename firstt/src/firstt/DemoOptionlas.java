package firstt;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoOptionlas {
	
	@Parameters("city")
	@Test
	public void  run(@Optional("chennai") String s)
	{
		
		System.out.println(s);
	}
	

}
