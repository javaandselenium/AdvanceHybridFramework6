package com.Ecommerce.Skillrary.testScripts;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.Ecommerce.Skillrary.PomPages.EditPage;
import com.Ecommerce.Skillrary.PomPages.SkillRrayLogin;
import com.Ecommerce.Skillrary.PomPages.SkillraryDemoLogincredtailsPage;
import com.Ecommerce.Skillrary.PomPages.UserDetailsPage;
import com.Ecommerce.Skillrary.PomPages.UserPage;
import com.Ecommerce.Skillrary.genericlib.BaseClass;
import com.Ecommerce.Skillrary.genericlib.ExcelUtilies;
import com.Ecommerce.Skillrary.genericlib.FileUtilies;

public class UserUpdate extends ExcelUtilies{
	@Test(dataProvider = "readData")
	public void update(String fn,String ln,String email,String pwd,String contact) throws IOException, SQLException {
		 test= reports.createTest("update");
		SkillRrayLogin s=new SkillRrayLogin(driver);
		s.skillraryDemoApp();
	
		utilies.switchToBrowser(driver, fu.getDataPropertyFile("title"));
		SkillraryDemoLogincredtailsPage sd=new SkillraryDemoLogincredtailsPage(driver);
		String query="select * from userlogin";
		sd.logindetaisls(FileUtilies.queryExecution(query,1,"user"),FileUtilies.queryExecution(query,2,"user"));
	
		UserPage u=new UserPage(driver);
		EditPage e = u.userButton();
		UserDetailsPage user = e.editButton();
		user.userDetails(fn, ln, email, pwd, contact);
		user.addresstype(fu.getDataPropertyFile("data"),fu.getDataPropertyFile("address"));
		user.getAddressType().click();
		
		Runtime.getRuntime().exec("C:\\Users\\QSP\\Desktop\\AutoITdemo\\sr.exe");
		user.updateElements(fu.getDataPropertyFile("DOB"), fu.getDataPropertyFile("cpwd"));
	
	
	
	}

}
