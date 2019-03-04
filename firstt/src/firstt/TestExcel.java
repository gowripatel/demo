package firstt;

import org.testng.annotations.Test;

public class TestExcel {

	@Test(dataProviderClass=firstt.Excel.class, dataProvider = "method" )
	public void runn(String s1, String s2)
	{
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
