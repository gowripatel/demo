package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestTestNG2
{
	
	
@Test
public void a()
{
Reporter.log("test A",true);
}


@Test(dependsOnMethods= {"c"})
public void b()
{
Reporter.log("test B",true);
}


@Test(invocationCount=3)
public void c()
{
Reporter.log("test C",true);
}
@Test
public void d()
{
Reporter.log("test D",true);
}

}
