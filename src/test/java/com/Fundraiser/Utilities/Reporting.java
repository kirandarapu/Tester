package com.Fundraiser.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class Reporting {
	
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest et;
	
	public void onStart(ITestContext testcontext){
		
		//to create time stamp
		String ts=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		//create report name
		
		String repName="Test-Report -"+ts+".html";
		
		//to specify the location
		
		
		
		
	}

}
