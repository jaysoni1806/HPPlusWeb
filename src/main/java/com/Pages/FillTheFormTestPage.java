package com.Pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.deviceConfig.baseClass;


public class FillTheFormTestPage {
	
	WebDriver driver;
	HomescreenPage homePage;
	
	public FillTheFormTestPage() {
		driver = baseClass.driver;
		PageFactory.initElements(driver,this);
		homePage = HomescreenPage.getHomePageAccess();
	}
	
	@FindBy(xpath = "//android.view.View[@content-desc='Fill the Form']") WebElement FORM_FILL_INFO;
	@FindBy(xpath = "//h4[text()='Personal Information']") WebElement Personal_Info_Screen;
	@FindBy(xpath = "//h4[text()='Lifestyle']") WebElement Lifestyle_Info_Screen;
	@FindBy(xpath = "//h4[text()='Health Details']") WebElement HealthDetails_Info_Screen;
	@FindBy(xpath = "//h4[text()='Medical History and Habits']") WebElement MedicalHistory_Info_Screen;
	@FindBy(xpath = "//h4[text()='Additional Information']") WebElement Additional_Info_Screen;
	@FindBy(xpath = "//div[contains(@class,'border') and contains(@class,'rounded-lg')]") WebElement Result_Screen;
	
	//Personal Info Screen
	@FindBy(name = "full_name") WebElement texName;
	@FindBy(name = "email") WebElement texEmail;
	@FindBy(name = "age") WebElement texAge;
	@FindBy(name = "height") WebElement texHeight;
	@FindBy(name = "weight") WebElement texWeight;
	@FindBy(xpath = "//button[@value='male']") WebElement texMaleRadio;
	
	//Lifestyle Info Screen
	@FindBy(name = "sleep") WebElement texSleep;
	@FindBy(name = "dailyWater") WebElement texDailyWater;
	@FindBy(name = "stepCount") WebElement texStepCount;
	@FindBy(name = "exercise") WebElement texExercise;
	@FindBy(name = "workHours") WebElement texWorkHours;
	@FindBy(xpath = "//*[name()='svg' and contains(@class,'lucide-calendar')]") WebElement texCalanderBox;
	@FindBy(xpath = "//div[@class='rdp p-3']") WebElement calanderDays;
	@FindBy(xpath = "//button[@tabindex='0']") WebElement calanderDate;

	//Health Details
	@FindBy(name = "heartRate") WebElement texHeartRate;
	@FindBy(name = "sugarLevel") WebElement texSugarLevel;
	@FindBy(name = "systolic") WebElement texSystolic;
	@FindBy(name = "diastolic") WebElement texDiastolic;
	
	//Medical History and Habits
	@FindBy(xpath = "//android.widget.Button[@content-desc='Balanced (Varied diet with all food groups)']") WebElement selectDietType;
	@FindBy(xpath = "//android.widget.Button[@content-desc='Low']") WebElement selectStressLevel;
	@FindBy(xpath = "//android.widget.Button[@content-desc='Metformin']") WebElement selectCurrentMedications;
	@FindBy(xpath = "//android.widget.Button[@content-desc='Annually']") WebElement selectFrequencyOfCheckups;
	@FindBy(xpath = "//android.widget.Button[@content-desc='Running']") WebElement selectTypeOfPhysicalActivites;
	
	@FindBy(xpath = "//button[text()='Next']") WebElement btnNext;
	@FindBy(xpath = "//button[text()='Previous']") WebElement btnPrevious;
	@FindBy(xpath = "//button[text()='Submit']") WebElement btnSubmit;
		
	public void verifyLandingScreen() {
		baseClass.wait.until(ExpectedConditions.visibilityOf(homePage.APP_HEADER_LOGO));
		
	}
	public void clickFillTheFormBnr() {
		homePage.FILL_THE_FORM_BNR.click();
		
	}
	public void ToCheckFillTheFormScreen() {
		baseClass.wait.until(ExpectedConditions.visibilityOf(FORM_FILL_INFO));
		
	}
	public void Enter_Name() {
		texName.click();
		texName.clear();
		texName.sendKeys("Jay QA");
		
	}
	public void Enter_Email() {
		texEmail.click();
		texEmail.clear();
		texEmail.sendKeys("jay.soni@openxcell.com");	
	}
	public void Enter_Age() {
		texAge.click();
		clearText(texAge);
		texAge.sendKeys("30");
	}
	public void Enter_HeightinCM() {
		texHeight.click();
		texHeight.clear();
		texHeight.sendKeys("180");
	}
	public void Enter_WeightinKG() {
		texWeight.click();
		texWeight.clear();
		texWeight.sendKeys("80");
	}	
	
	public void select_Gender() {
		texMaleRadio.click();
	}
	public void ToCheckLifestyle_Info_Screen() {
		baseClass.wait.until(ExpectedConditions.visibilityOf(Lifestyle_Info_Screen));
		
	}
	public void Enter_AverageSleepHours() {
		texSleep.click();
		texSleep.clear();
		texSleep.sendKeys("8");
		
	}
	public void Enter_DailyWaterIntake() {
		texDailyWater.click();
		texDailyWater.clear();
		texDailyWater.sendKeys("3");
	}
	public void Enter_StepsCount() {
		texStepCount.click();
		texStepCount.clear();
		texStepCount.sendKeys("3500");
	}
	public void Enter_ExercisePerDay() {
		texExercise.click();
		texExercise.clear();
		texExercise.sendKeys("2");
	}
	public void Enter_WorkHours() {
		texWorkHours.click();
		texWorkHours.clear();
		texWorkHours.sendKeys("8");
	}
	public void select_PhysicalExam_date()
	{
		texCalanderBox.click();
		baseClass.wait.until(ExpectedConditions.visibilityOf(calanderDays));
		calanderDate.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
	}
	public void ToCheckHealthDetails_Info_Screen() {
		baseClass.wait.until(ExpectedConditions.visibilityOf(HealthDetails_Info_Screen));
	}
	
	public void Enter_HeartRate() {
		texHeartRate.click();
		texHeartRate.clear();
		texHeartRate.sendKeys("70");
	}
	public void Enter_BloodSugarLevels() {
		texSugarLevel.click();
		texSugarLevel.clear();
		texSugarLevel.sendKeys("100");
	}
	public void Enter_SystolicPressure() {
		texSystolic.click();
		texSystolic.clear();
		texSystolic.sendKeys("80");
	}
	public void Enter_DiastolicPressure() {
		texDiastolic.click();
		texDiastolic.clear();
		texDiastolic.sendKeys("80");
	}
	
	public void ToCheckMedicalHistory_Screen() {
		baseClass.wait.until(ExpectedConditions.visibilityOf(MedicalHistory_Info_Screen));
	}
	public void ToCheckAdditionalInfo_Screen() {
		baseClass.wait.until(ExpectedConditions.visibilityOf(Additional_Info_Screen));
	}
	public void select_ValueFromDropdown(String dropdown) {
		
		driver.findElement(By.xpath("//span[text()='"+dropdown+"']/ancestor::button")).click();
		waitFor(200);
		baseClass.wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@role='presentation']"))));
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']"));
		// Create an instance of Random class
        Random rand = new Random();
        // Generate a random index based on the size of the options  Select Heredity Diseases
        int randomIndex = rand.nextInt(options.size());
        options.get(randomIndex).click();
        waitFor(200);
	}
	
	public void ToCheckResult_Screen() {
		baseClass.wait.until(ExpectedConditions.visibilityOf(Result_Screen));
	}
	
	public void Click_NextButton() {
		baseClass.wait.until(ExpectedConditions.elementToBeClickable(btnNext)).click();
	}
	public void Click_SubmitButton() {
		baseClass.wait.until(ExpectedConditions.elementToBeClickable(btnSubmit)).click();
	}
	public void waitFor(int seconds)
	{
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clearText(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value ='';", element);
	}
	
	public static FillTheFormTestPage getLandingPageAccess()
	{
		return new FillTheFormTestPage();
	}
	
}
