package com.Pages;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.deviceConfig.baseClass;

import io.appium.java_client.android.AndroidDriver;

public class UploadYourReportPage {
	
	WebDriver driver;
	HomescreenPage homePage;
	
	File pdfFile =  new File(System.getProperty("user.dir")+"/Files/StoneAnalysis.pdf");
	
	public UploadYourReportPage() {
		driver = baseClass.driver;
		PageFactory.initElements(driver,this);
		homePage = HomescreenPage.getHomePageAccess();
	}
	
	@FindBy(xpath = "//input[@type='file']") WebElement uploadFile;
	@FindBy(xpath = "//button[text()='Back to Home']") WebElement btnBack;
	@FindBy(xpath = "//div[@class='w-full relative']/ancestor::div[@class='p-2 flex justify-between w-full items-center gap-2']") WebElement Result_Screen;
	
	
	public void ToCheckUploadYourReportBanerIsPresentOrNot() {
		baseClass.wait.until(ExpectedConditions.visibilityOf(homePage.UPLOAD_YOUR_REPORT_BNR));	
	}
	
	public void clickUploadYourReportBnr() {
		baseClass.wait.until(ExpectedConditions.elementToBeClickable(homePage.UPLOAD_YOUR_REPORT_BNR)).click();
	}
	public void uploadValidPDF() throws IOException {
		System.out.println(pdfFile.getAbsolutePath());
		baseClass.wait.until(ExpectedConditions.visibilityOf(uploadFile)).sendKeys(pdfFile.getAbsolutePath());
	}
	
	public void MoveBackUntilHomeScreen() {
		// TODO Auto-generated method stub
		btnBack.click();
		
	}
	public void ToCheckResult_Screen() {
		baseClass.wait.until(ExpectedConditions.visibilityOf(Result_Screen));
	}
	public static UploadYourReportPage getUPloadFilePageAccess()
	{
		return new UploadYourReportPage();
	}



}
