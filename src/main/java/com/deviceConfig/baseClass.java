package com.deviceConfig;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.Listeners.ExtentReportListener;
import com.Listeners.ExtentReportManager;
import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.model.ChromeEmulationInfo;
import com.applitools.eyes.visualgrid.model.DesktopBrowserInfo;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.aventstack.extentreports.Status;

public class baseClass{
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static EyesRunner runner = null;
	public static Eyes eyes = null;
	public static Configuration config;
	public static Logger log = Logger.getLogger(baseClass.class);
	public final static BatchInfo BATCH = new BatchInfo("Health Predictor WEB - AI Eureka");
	
	@BeforeSuite
	public void Set_up() throws MalformedURLException, InterruptedException
	{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		System.setProperty("current.date.time", dateFormat.format(new Date()));
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/Resource/log4j.properties"); 
		
		
		 driver  = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://health-predictor-plus.vercel.app/");
		 log.info("[*]URL launch in Chorme browser automate WEB app.");
		 wait =  new WebDriverWait(driver, Duration.ofSeconds(50));
		 eyes = new Eyes();
		 eyes.setApiKey("NAjlZ4uD49zrf3ywSDkVmsWJXBSCLG7E1ApHtlWoWhM110"); //Jay+5

		 
	     Configuration config = eyes.getConfiguration();
	     config.setBatch(BATCH);

         config.addBrowsers(
             new DesktopBrowserInfo(800, 1024, BrowserType.CHROME),
             new DesktopBrowserInfo(1600, 1200, BrowserType.FIREFOX),
             new DesktopBrowserInfo(1024, 768, BrowserType.SAFARI),
             new ChromeEmulationInfo(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT),
             new ChromeEmulationInfo(DeviceName.Nexus_10, ScreenOrientation.LANDSCAPE)
         );
         eyes.setConfiguration(config);
	     eyes.open(driver, "WEB App", "Health Predicator");	  
	 }
	@BeforeTest
	public void initializeExtentReport() {
		ExtentReportManager.initializeExtentReport();
	}
	@AfterTest
	public void flush() {
		ExtentReportListener.flush();
	}
	@AfterSuite
	public void clossApplitool()
	{
		 eyes.closeAsync();
		 driver.quit();
	}
}
