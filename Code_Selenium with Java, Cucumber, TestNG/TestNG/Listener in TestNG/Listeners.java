package com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println(" ");
		System.out.println("Test Is Started : ");
		System.out.println(" ");
	
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(" ");
		System.out.println("Test is Succeed  : ");
		System.out.println(" ");
		}

	public void onTestFailure(ITestResult result) {
	
		System.out.println("Captured Fail Screenshot : ");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(" ");
		System.out.println("Test Is Skipped");
		System.out.println(" ");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
