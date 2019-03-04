package firstt;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ProductGroup extends BaseTestGroup 
{
@Test(groups= {"product","smoke"})
public void createProduct()
{
	Reporter.log("createProduct", true);
}
@Test(groups= {"product"})
public void editProduct()
{
	Reporter.log("editProduct", true);
}

@Test(groups= {"product"},enabled=false)

public void exportProduct()

{
	Reporter.log("exportProduct", true);	
}
}
