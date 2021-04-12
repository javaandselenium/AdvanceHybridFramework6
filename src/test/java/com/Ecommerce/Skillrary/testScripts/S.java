package com.Ecommerce.Skillrary.testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Ecommerce.Skillrary.PomPages.ContactUsdetails;
import com.Ecommerce.Skillrary.PomPages.UserDetailsPage;
import com.Ecommerce.Skillrary.genericlib.AutoConstant;
import com.Ecommerce.Skillrary.genericlib.BaseClass;
import com.Ecommerce.Skillrary.genericlib.ExcelUtilies;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S extends ExcelUtilies{
	
		
@Test(dataProvider = "readData")
public void demo(String fn,String ln,String email,String pwd,String contact) {
	UserDetailsPage ud=new UserDetailsPage(driver);
	ud.userDetails(fn, ln, email, pwd, contact);
}
}
	