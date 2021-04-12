package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	public WebDriver driver;
	@FindBy(id="Selenium Training")
	private WebElement seleniumTrainingcourse;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement facebookicon;

	public WebElement getSeleniumTrainingcourse() {
		return seleniumTrainingcourse;
	}

	public WebElement getCartarea() {
		return cartarea;
	}
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contact;

	public WebElement getContact() {
		return contact;
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}
	 public  Testing(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 this.driver=driver;
	 }
	 
	 public FacebookLogin facebookIcon() {
		 facebookicon.click();
		 return new FacebookLogin(driver);
	 }
	 
	 public ContactUsdetails contactUs() {
		 contact.click();
		 return new ContactUsdetails(driver);
	 }
	
	

}
