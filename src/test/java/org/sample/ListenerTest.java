package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.Utils;

public class ListenerTest implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("completed");
		
	}

	public void onStart(ITestContext arg0) {
	System.out.println("Test Starts.....");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Failure but Success Percentage");
		
	}

	public void onTestFailure(ITestResult result) {
	    String tn = result.getName();
		System.out.println("...The Name Of test case faile is...."+tn);
		Date d= new Date();
		String re = d.toString().replaceAll(":","-");
		TakesScreenshot  t = (TakesScreenshot)Execution.driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\PattonAdmin\\eclipse-workspce selenium task\\MavenProject\\failed_test_screenshot\\"+re+".png"); 
		try {FileUtils.copyFile(src, des);
		
		}
		catch (IOException e){
			e.printStackTrace();}
		
			Execution.driver.quit();
			
			
		}
	

	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped Test Name Is:"+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("The Test Case Started is:"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
        System.out.println("The Test Case Success is:"+result.getName());
		
	}

}
