package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeCourse {
	public WebDriver driver;
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement play;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
	private WebElement takecourse;
	
	public TakeCourse(WebDriver driver) {
		PageFactory.initElements(driver,this);
		 this.driver=driver;
	}
	
	public void takethisenrolledcourse() throws InterruptedException {
		play.click();
		Thread.sleep(10000);
		pause.click();
		
	}
	
	public AboutUs takecousebtn() {
		takecourse.click();
		return new AboutUs(driver);
	}

}
