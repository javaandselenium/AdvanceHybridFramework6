package com.Ecommerce.Skillrary.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelUtilies extends BaseClass{
	
	@DataProvider
	public Object[][] readData() throws EncryptedDocumentException, IOException{
		FileInputStream f=new FileInputStream(AutoConstant.excelpath);
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("UserDetails");
		int rowNum = sh.getLastRowNum();
		System.out.println(rowNum);
		int cellNum = sh.getRow(1).getLastCellNum();
		System.out.println(cellNum);
		
		Object obj[][]=new Object[rowNum][cellNum];
		for(int i=1;i<rowNum;i++) {
			for(int j=0;j<cellNum;j++) {
				obj[i][j]=sh.getRow(1).getCell(j).getStringCellValue();
				System.out.println(obj[i][j]);
			}
			
		}
		return obj;
		
		
		
	}

}
