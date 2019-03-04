package firstt;

import org.testng.IClassListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoIsuteListner implements ISuiteListener,ITestListener,IClassListener,IInvokedMethodListener{

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Before starting of suite");
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("After ending of suite");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("Before every test method Sgtart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" After every test method pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("before test method start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("After test method finish");
		
	}

	@Override
	public void onBeforeClass(ITestClass testClass) {
		// TODO Auto-generated method stub
		
		System.out.println("Before every class");
	}

	@Override
	public void onAfterClass(ITestClass testClass) {
		// TODO Auto-generated method stub
		System.out.println("After every class");
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
		System.out.println("Before every method ");
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("After every method");
		
	}

	

}
