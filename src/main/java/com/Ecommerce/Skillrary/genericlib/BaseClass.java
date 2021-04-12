package com.Ecommerce.Skillrary.genericlib;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import javax.imageio.spi.ImageTranscoderSpi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author QSP
 *
 */
public class BaseClass {
	/**
	 * open the browser and enter URL of the application
	 */
	public WebDriver driver;
	public WebDriverUtilies utilies=new WebDriverUtilies();
	public FileUtilies fu=new FileUtilies();
	public ExtentHtmlReporter htmlreport;
	public  static ExtentReports reports;
	public static ExtentTest test;
	public static  Connection con ;
	
	@BeforeSuite
	public void ConfigBS() throws SQLException {
		//Data base conncetion
		  con = FileUtilies.getDataDb();
    htmlreport=new ExtentHtmlReporter(AutoConstant.reportPath);
    htmlreport.config().setDocumentTitle("SkillRrayReport");
    htmlreport.config().setTheme(Theme.DARK);
    reports=new ExtentReports();
    reports.attachReporter(htmlreport);
	
	}
	
@BeforeMethod
	public void openApp() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(AutoConstant.url);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	
	}
	
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {
		int result = r.getStatus();
		if(result==ITestResult.FAILURE) {
			test.log(Status.FAIL,r.getThrowable()+"Test case is failed exception");
			
		}
		else if(result==ITestResult.SUCCESS) {
			test.log(Status.PASS,r.getName()+"Test case passed");
		}
		else if(result==ITestResult.SKIP) {
			test.log(Status.SKIP,r.getName()+"Test case is skipped");
		}
		driver.close();
	}
	
@AfterSuite
public void configAS() throws SQLException {
	htmlreport.flush();
	reports.flush();
	con.close();
}
}
