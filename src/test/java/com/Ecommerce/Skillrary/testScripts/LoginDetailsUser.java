package com.Ecommerce.Skillrary.testScripts;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.Skillrary.PomPages.SkillRrayLogin;
import com.Ecommerce.Skillrary.PomPages.SkillraryDemoLogincredtailsPage;
import com.Ecommerce.Skillrary.genericlib.BaseClass;
import com.Ecommerce.Skillrary.genericlib.FileUtilies;
@Listeners(com.Ecommerce.Skillrary.genericlib.ListnersDemo.class)
public class LoginDetailsUser extends BaseClass {
	@Test
	public void userdetails() throws IOException, SQLException {
		 test= reports.createTest("userdetails");
		SkillRrayLogin s=new SkillRrayLogin(driver);
		s.skillraryDemoApp();
		
		utilies.switchToBrowser(driver, fu.getDataPropertyFile("title"));
	SkillraryDemoLogincredtailsPage sd=new SkillraryDemoLogincredtailsPage(driver);
	String query="select * from userlogin";
	sd.logindetaisls(FileUtilies.queryExecution(query,1,"user"),FileUtilies.queryExecution(query,2,"user"));
	}

}
