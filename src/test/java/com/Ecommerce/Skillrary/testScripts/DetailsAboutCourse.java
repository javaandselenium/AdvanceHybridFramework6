package com.Ecommerce.Skillrary.testScripts;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.Skillrary.PomPages.ContactUsdetails;
import com.Ecommerce.Skillrary.PomPages.FacebookLogin;
import com.Ecommerce.Skillrary.PomPages.SkillRrayLogin;
import com.Ecommerce.Skillrary.PomPages.SkillraryDemoLogin;
import com.Ecommerce.Skillrary.PomPages.Testing;
import com.Ecommerce.Skillrary.genericlib.BaseClass;


public class DetailsAboutCourse extends BaseClass {
	        @Test
	public void contactusdetailsinfo() throws IOException {
	   test= reports.createTest("contactusdetailsinfo");
	    
	   SkillRrayLogin s = new SkillRrayLogin(driver);
		SkillraryDemoLogin h = s.skillraryDemoApp();
		utilies.switchToBrowser(driver, fu.getDataPropertyFile("title"));
		utilies.select(h.getCoursedd(), fu.getDataPropertyFile("coursedd"));
		Testing t = new Testing(driver);
		utilies.dragDrop(driver, t.getSeleniumTrainingcourse(), t.getCartarea());
		FacebookLogin fb = t.facebookIcon();
		Testing tes = fb.likebtn();
		utilies.nagvigateBack(driver);
		utilies.nagvigateBack(driver);

		utilies.scrollToparticularElement(driver, tes.getContact());
		ContactUsdetails contact = tes.contactUs();
		contact.contatctDetails(fu.getDataPropertyFile("name"),fu.getDataPropertyFile("email"),fu.getDataPropertyFile("subject"), fu.getDataPropertyFile("message"));
		contact.verifytext(fu.getDataPropertyFile("successMsg"),fu.getDataPropertyFile("successMsg"));
		
		//utilies.verify(driver.getTitle().trim(),fu.getDataPropertyFile("exptitle"),fu.getDataPropertyFile("expPage"));
		
}
}