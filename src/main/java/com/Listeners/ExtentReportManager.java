package com.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentReports extentReport;
	public static ExtentTest test;
	public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	public static void initializeExtentReport() {
		// extentSparkReporter = new
		// ExtentSparkReporter(System.getProperty("user.dir")+"/Report/"+"MyReport"+commonUtil.getCurrentTime()+".html");
		extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/Report/" + "MyReport.html");
		extentSparkReporter.config().setTheme(Theme.STANDARD);
		extentSparkReporter.config().setDocumentTitle("HealthPredictor Test Report");
		extentSparkReporter.config().setReportName("HealthPredictor Test Execution Report");
		extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd,yyyy, hh:mm a");
		extentReport = new ExtentReports();
		extentReport.attachReporter(extentSparkReporter);
	}

	public static void flush() {
		extentReport.flush();
	}
}
