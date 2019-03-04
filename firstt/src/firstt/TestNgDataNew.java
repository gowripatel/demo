package firstt;

import org.testng.annotations.Test;

public class TestNgDataNew {

	@Test(dataProviderClass=firstt.Testxl.class,dataProvider="testxl")
	public void test(String s1,String s2)
	{
		System.out.println(s1);
		System.out.println(s2);
	}
}
