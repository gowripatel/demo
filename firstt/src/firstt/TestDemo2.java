package firstt;

	
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestDemo2
	{
		@BeforeMethod
		public void m1()
		{
			Reporter.log("before method", true);
		}
		
		
		@BeforeClass
		public void m2()
		{
			Reporter.log("before class", true);
		}
		
		@BeforeSuite
		public void m3()
		{
			Reporter.log("before suite", true);
		}
		
		@BeforeTest
		public void m4()
		{
			Reporter.log("before test", true);
		}
		
		
		
		@AfterMethod
		public void m5()
		{
			Reporter.log("after method", true);
		}
		
		@AfterClass
		public void m6()
		{
			Reporter.log("after class", true);
		}
		
		@AfterTest
		public void m7()
		{
			Reporter.log("after test", true);
		}
		@AfterSuite
		public void m8()
		{
			Reporter.log("after suuite", true);
		}
	}



