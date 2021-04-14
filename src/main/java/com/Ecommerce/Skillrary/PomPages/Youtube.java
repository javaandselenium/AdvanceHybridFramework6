package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Youtube {
	public WebDriver driver;
	
	public WebElement getViews() {
		return views;
	}

	public WebElement getClosecookie() {
		return closecookie;
	}

	public WebElement getWatchonbtn() {
		return watchonbtn;
	}
	@FindBy(xpath="//yt-formatted-string[text()='Meet Jane...']/ancestor::div[@id='container']//span[@class='view-count style-scope ytd-video-view-count-renderer']")
	private WebElement views;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement closecookie;
	
	@FindBy(xpath="//a[@aria-label='Watch on YouTube']")
	private WebElement watchonbtn;
	
	public Youtube(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void verifyCount(String exptext) {
		String atext = views.getText();
		Assert.assertEquals(atext, exptext);
		Reporter.log(atext,true);
		
	}
	public void closecookiesbtn() {
		closecookie.click();
	}
	public void watchyoutube() {
		watchonbtn.click();
	}

}
