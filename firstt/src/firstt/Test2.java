package firstt;

import org.testng.annotations.Test;

public class Test2 {

	@Test(dataProviderClass=firstt.Testxl.class,dataProvider="testxl")
	public void test11(String s1,String s2)
	{
		System.out.println(s1);
		System.out.println(s2);
	}
}
