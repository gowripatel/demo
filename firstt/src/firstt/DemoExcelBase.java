package firstt;

import org.testng.annotations.Test;

public class DemoExcelBase {

	@Test(dataProviderClass=firstt.DemoExcel.class, dataProvider="data")
	public void databank(String un,String pwd)
	{
		System.out.println(un+" and "+pwd);
	}
}
