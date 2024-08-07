package com.TestClass;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.*;

import com.Listeners.ExtentReportManager;
import com.Pages.FillTheFormTestPage;
import com.Pages.UploadYourReportPage;
import com.applitools.eyes.selenium.fluent.Target;
import com.aventstack.extentreports.Status;
import com.deviceConfig.baseClass;

public class UploadYourReportTest  extends baseClass {
	
	UploadYourReportPage uploadReport;	
	FillTheFormTestPage fillForm;
	public static Logger log = Logger.getLogger(UploadYourReportTest.class);
	@BeforeClass
	public void initClassObject() {
		uploadReport = UploadYourReportPage.getUPloadFilePageAccess();
		fillForm =  FillTheFormTestPage.getLandingPageAccess();
	}

	@Test
	public void To_Verify_With_Upload_Valid_PDF_File() throws IOException
	{
		uploadReport.MoveBackUntilHomeScreen();	
		ExtentReportManager.extentTest.get().log(Status.PASS, "Move back till home screen.");
		log.info("- Move back till the home screen is presents.");
		eyes.check("Home Screen", Target.window());
		uploadReport.ToCheckUploadYourReportBanerIsPresentOrNot();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Home Screen presented.");
		uploadReport.clickUploadYourReportBnr();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Clik Upload Your Report banner.");
		log.info("- Click upload your report banner.");
		uploadReport.uploadValidPDF();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Upload PDF.");
		log.info("- Upload valid PDF.");
		uploadReport.ToCheckResult_Screen();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Result screen presented.");
		log.info("- Result screen presented.");
		uploadReport.MoveBackUntilHomeScreen();	
		ExtentReportManager.extentTest.get().log(Status.PASS, "Move back till home screen.");
		log.info("- Move back till the home screen is presents.");
	
	}
}
