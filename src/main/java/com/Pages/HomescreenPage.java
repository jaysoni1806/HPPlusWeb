package com.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deviceConfig.baseClass;

public class HomescreenPage {
	WebDriver driver;
	public HomescreenPage() {
		driver = baseClass.driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//h4[text()='What would you like to do?']") WebElement APP_HEADER_LOGO;
	@FindBy(xpath = "//h4[text()='Fill the Form']")	WebElement FILL_THE_FORM_BNR;		
	@FindBy(xpath = "//h4[text()='Upload Your Report']") WebElement UPLOAD_YOUR_REPORT_BNR;	
		
	public static HomescreenPage getHomePageAccess()
	{
		return new HomescreenPage();
	}

}
