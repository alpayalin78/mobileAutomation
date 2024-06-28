package org.mobileautomationalpay.TestUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
//	ExtentTest test;
//	ExtentReports extent = ExtentReporterNG.getReporterObject();
//	AppiumDriver driver;
	
	
//	@Override
//	public void onTestStart(ITestResult result) {
//		// TODO Auto-generated method stub
//		 test= extent.createTest(result.getMethod().getMethodName());
//	}

//	@Override
//	public void onTestSuccess(ITestResult result) {
//		// TODO Auto-generated method stub
//		test.log(Status.PASS, "Test Passed");
//
//	}

//	@Override
//	public void onTestFailure(ITestResult result) {
//		// TODO Auto-generated method stub
//		//screenshot code
//		test.fail(result.getThrowable());
//
//		try {
//			driver = (AppiumDriver) result.getTestClass().getRealClass().getField("driver")
//					.get(result.getInstance());
//
//
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			test.addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

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
		
	}

//	@Override
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		extent.flush();
//	}
//
	
}
