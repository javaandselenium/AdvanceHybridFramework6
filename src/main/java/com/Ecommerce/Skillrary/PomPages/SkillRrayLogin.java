package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRrayLogin {
	public WebDriver driver;
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gerasBtn;

	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoapp;
	
	@FindBy(name="q")
	private WebElement serachTb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;

	public WebElement getGerasBtn() {
		return gerasBtn;
	}

	public WebElement getSkillraryDemoapp() {
		return skillraryDemoapp;
	}
	
	public SkillRrayLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public SkillraryDemoLogin skillraryDemoApp() {
		gerasBtn.click();
		skillraryDemoapp.click();
		return new SkillraryDemoLogin(driver);
	}
	
	public SeleniumCourse serachingcourse(String course) {
		serachTb.sendKeys(course);
		gobtn.click();
		return new SeleniumCourse(driver);
	}
	
	public void clerasercah() {
		serachTb.clear();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSerachTb() {
		return serachTb;
	}

	public WebElement getGobtn() {
		return gobtn;
	}
	
}
