package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumCourse {
	public WebDriver driver;
	@FindBy(xpath="//span[@class='category-name']/ancestor::div[@class='categories_block extra_ort']//span[text()='Development']")
private WebElement development;
	
	@FindBy(xpath="(//a[text()='Web Development'])[2]")
	private WebElement webdevopment;
	
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement corejava;
	
	public SeleniumCourse(WebDriver driver) {
		PageFactory.initElements(driver,this);
		 this.driver=driver;
	}

	public WebElement getDevelopment() {
		return development;
	}

	public WebElement getWebdevopment() {
		return webdevopment;
	}

	public WebElement getCorejava() {
		return corejava;
	}
	
	public void serachcourses() {
		webdevopment.click();
	}
	
	public TakeCourse corejavaele() {
		corejava.click();
		return new TakeCourse(driver);
	}
}
