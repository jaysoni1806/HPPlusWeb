package com.TestClass;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Listeners.ExtentReportManager;
import com.Pages.FillTheFormTestPage;
import com.applitools.eyes.selenium.fluent.Target;
import com.aventstack.extentreports.Status;
import com.deviceConfig.baseClass;

public class FillTheFormTest extends baseClass {
	
	public static Logger log = Logger.getLogger(FillTheFormTest.class);
	FillTheFormTestPage fillForm;	
	
	
	@BeforeClass
	public void initClassObject() {
		fillForm = FillTheFormTestPage.getLandingPageAccess();	
	}
	@Test(priority = 0)
	public void To_Verify_LandingScreen() {	
		eyes.check("Home Screen", Target.window());
		fillForm.verifyLandingScreen();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Home Screen presented.");
		log.info("- Waiting for Home screen.");
	}

	@Test(priority = 1)
	public void To_Verify_Fill_PersonalInformation_With_Valid_Details() {
		eyes.check("Fill the Form screen with blanks details - Personal Information", Target.window());

		fillForm.clickFillTheFormBnr();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Cliked on Fill the Form banner.");
		log.info("- Fill form banner presented and clicked.");
		fillForm.Enter_Name();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter first name.");
		log.info("- Entered name into Full Name field.");
		fillForm.Enter_Email();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Entere email.");
		log.info("- Entered email into Email field.");
		fillForm.Enter_Age();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter age.");
		log.info("- Entered age into Age field.");
		fillForm.Enter_HeightinCM();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter height in cm.");
		log.info("- Entered height into Height field.");
		fillForm.Enter_WeightinKG();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter weight in KG.");
		log.info("- Entered weight into Weight field.");
		fillForm.select_Gender();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Select Gender");
		log.info("- Gender selected");
		eyes.check("Fill the Form screen after details - Personal Information", Target.window());
		fillForm.Click_NextButton();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Click next button.");
		log.info("- Click Next button");

	}
	@Test(priority = 2)
	public void To_Verify_Fill_LifeStyleInformation_With_Valid_Details() {
		eyes.check("Fill the Form screen with blanks details - LifeStyle Information", Target.window());
		
		fillForm.ToCheckLifestyle_Info_Screen();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Landing Screen presented- LifeStyle Information.");
		log.info("- Waiting for Life Style screen.");
		fillForm.Enter_AverageSleepHours();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter average sleep hours.");
		log.info("- Entered average sleep hours into Average Sleep Hours field.");
		fillForm.Enter_DailyWaterIntake();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter daily water intake.");
		log.info("- Entered daily water intake into Daily Water Intake field.");
		fillForm.Enter_StepsCount();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter step count.");
		log.info("- Entered steps count into Steps Counts field.");
		fillForm.Enter_ExercisePerDay();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter minutes of exercise per day.");
		log.info("- Entered exercise per day into Exercise Per Day field.");
		fillForm.Enter_WorkHours();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter work hours.");
		log.info("- Entered work hours into Work Hours field.");
		fillForm.select_PhysicalExam_date();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Select exam date.");
		log.info("- Select exam date.");
		
		eyes.check("Fill the Form screen after details - LifeStyle Information", Target.window());
		fillForm.Click_NextButton();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Click next button.");
		log.info("- Click Next button");
	}
	@Test(priority = 3)
	public void To_Verify_Fill_HealthInformation_With_Valid_Details() {

		eyes.check("Fill the Form screen with blanks details - Health Details", Target.window());
		
		fillForm.ToCheckHealthDetails_Info_Screen();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Landing Screen presented- Health Details");
		log.info("- Waiting for Health Details screen.");
		fillForm.Enter_HeartRate();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter heart rate.");
		log.info("- Entered heart rate into Heart Rate field.");
		fillForm.Enter_BloodSugarLevels();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter blood sugar levels");
		log.info("- Entered blood sugar levels into Blood Sugar levels Field.");
		fillForm.Enter_SystolicPressure();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter systolic pressure.");
		log.info("- Entered systolic pressure into Systolic Pressure Field.");
		fillForm.Enter_DiastolicPressure();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Enter diastolic pressure.");
		log.info("- Entered diastolic pressure into Diastolic Pressure Field.");
		eyes.check("Fill the Form screen after details - Health Details", Target.window());
		fillForm.Click_NextButton();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Click next button.");
		log.info("- Click Next button");
		fillForm.waitFor(1000);
	}
	@Test(priority = 4)
	public void To_Verify_Fill_MedicalHistory_With_Valid_Details() {
		eyes.check("Fill the Form screen with blanks details - Medical History and Habits", Target.window());
		fillForm.ToCheckMedicalHistory_Screen();
		log.info("- Waiting for Medical History and Habits screen.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Landing Screen presented- Medical History and Habits");
	
		fillForm.select_ValueFromDropdown("Select Medical History");
		log.info("- Medical History Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Medical History Selected.");
		
		fillForm.select_ValueFromDropdown("Select Heredity Diseases");
		log.info("- Heredity Diseases Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Heredity Diseases Selected.");
		
		fillForm.select_ValueFromDropdown("Smoking Status");
		log.info("- Smoking Status Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Smoking Status Selected.");
		
		fillForm.select_ValueFromDropdown("Alcohol Consumption");
		log.info("- Alcohol Consumption Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Alcohol Consumption Selected.");
		
		fillForm.select_ValueFromDropdown("Physical Activity Level");
		log.info("- Physical Activity Level Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Physical Activity Level Selected.");
		
		fillForm.Click_NextButton();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Click next button.");
		log.info("- Click Next button due to all fileds are already field by default.");
		eyes.check("Result screen", Target.window());
		fillForm.waitFor(1000);
		
	}
	@Test(priority = 6)
	public void To_Verify_Fill_AdditionalInformation_With_Valid_Details() {
		eyes.check("Fill the Form screen with blanks details - Additional Information", Target.window());
		fillForm.ToCheckAdditionalInfo_Screen();
		log.info("- Waiting for Additional Information screen.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Waiting for Additional Information screen.");
		
		fillForm.select_ValueFromDropdown("Diet Type");
		log.info("- Diet Type Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Diet Type Selected.");
		
		fillForm.select_ValueFromDropdown("Stress Level");
		log.info("- Stress Level Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Stress Level Selected.");
		
		fillForm.select_ValueFromDropdown("Current Medications");
		log.info("- Current Medications Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Current Medications Selected.");
		
		fillForm.select_ValueFromDropdown("Frequency of Checkups");
		log.info("- Frequency of Checkups Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Frequency of Checkups Selected.");
		
		fillForm.select_ValueFromDropdown("Type of Physical Activities");
		log.info("- Type of Physical Activities Selected.");
		ExtentReportManager.extentTest.get().log(Status.PASS, "Type of Physical Activities Selected.");
		
		
		fillForm.Click_SubmitButton();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Click next button.");
		log.info("- Click Next button due to all fileds are already field by default.");
		fillForm.ToCheckResult_Screen();
		ExtentReportManager.extentTest.get().log(Status.PASS, "Result screen presented.");
		log.info("- Result screen presented.");
		eyes.check("Result screen", Target.window());	
	}
	
}
