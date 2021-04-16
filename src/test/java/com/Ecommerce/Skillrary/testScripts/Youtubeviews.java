package com.Ecommerce.Skillrary.testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.Skillrary.PomPages.AboutUs;
import com.Ecommerce.Skillrary.PomPages.SeleniumCourse;
import com.Ecommerce.Skillrary.PomPages.SkillRrayLogin;
import com.Ecommerce.Skillrary.PomPages.TakeCourse;
import com.Ecommerce.Skillrary.PomPages.Youtube;
import com.Ecommerce.Skillrary.genericlib.BaseClass;
@Listeners(com.Ecommerce.Skillrary.genericlib.ListnersDemo.class)
public class Youtubeviews extends BaseClass{
	@Test
	public void views() throws IOException, InterruptedException {
		 test= reports.createTest("views");
		SkillRrayLogin s=new SkillRrayLogin(driver);
	SeleniumCourse sc = s.serachingcourse(fu.getDataPropertyFile("coursename"));
	utilies.mouseToExpectedElement(driver,sc.getDevelopment());
	sc.serachcourses();
	driver.navigate().back();
	s.clerasercah();
	Thread.sleep(3000);
	s.serachingcourse(fu.getDataPropertyFile("coursename"));
 TakeCourse cj = sc.corejavaele();
 utilies.switchToFrame(driver);
 cj.takethisenrolledcourse();
 utilies.switchBackFromFrame(driver);
 AboutUs ab = cj.takecousebtn();
 
 utilies.scrollToparticularElement(driver,ab.getAboutUs());
// Thread.sleep(3000);
 Youtube yt = ab.aboutusbutton();
// Thread.sleep(3000);
// utilies.switchToFrame(driver);
// yt.closecookiesbtn();
// Thread.sleep(3000);
// yt.watchyoutube();
// Thread.sleep(3000);
// 
// 
// 
//
//utilies.switchToBrowser(driver,"youtube");
//yt.verifyCount(fu.getDataPropertyFile("view"));
//Assert.assertEquals(driver.getTitle(),fu.getDataPropertyFile("youtubetitle"));
// 
 
 
}
}