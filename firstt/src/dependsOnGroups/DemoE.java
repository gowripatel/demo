package dependsOnGroups;

import org.testng.annotations.Test;

public class DemoE {
  
	@Test
	public void normaltestclass(String s) {
		if(s.equals("chrome"))
		{
			System.out.println("running chrome");
		}
		else if(s.equalsIgnoreCase("firefox"))
		{
			System.out.println("running firefox");
		}
		
	}


}
