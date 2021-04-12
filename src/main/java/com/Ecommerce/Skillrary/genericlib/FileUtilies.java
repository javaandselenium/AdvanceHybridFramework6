package com.Ecommerce.Skillrary.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import com.mysql.cj.jdbc.Driver;
/**
 * 
 * @author QSP
 *
 */
public class FileUtilies {
	/**
	 * To read the data from property file
	 * @param keys
	 * @return
	 * @throws IOException
	 */
	
	public static Connection con;
	
	public String getDataPropertyFile(String keys) throws IOException {
		Properties p=new Properties();
	p.load(new FileInputStream(AutoConstant.propertyfilePath));
	return p.getProperty(keys);
	}

	/**
	 * To get the connection to db
	 * @return
	 * @throws SQLException
	 */
	
	public static Connection getDataDb() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5db","root","root");
		return con;
	}
	/**
	 * Execute the query and read the data from db
	 * @param query
	 * @param column
	 * @param ExceptedData
	 * @return
	 * @throws SQLException
	 */
	
	public static String queryExecution(String query,int column,String ExceptedData) throws SQLException {
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		while(result.next()) {
			if(result.getString(column).equals(ExceptedData)){
				break;
			}
			else
			{
				Reporter.log("data is not matching",true);
			}
		}
		return ExceptedData;
	}
	
	/**
	 * close the db connection
	 * @throws SQLException
	 */
	public  static void closedb() throws SQLException {
		con.close();
	}
	/**
	 * To read the data from excel sheet
	 * @param SheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataExcel(String SheetName,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(AutoConstant.testDatapath);
		Workbook wb = WorkbookFactory.create(fis);
	return wb.getSheet(SheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	
	
	
}
