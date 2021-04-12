package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AboutUs {
	public WebDriver driver;
@FindBy(xpath="//a[contains(text(),'About Us')]")
private WebElement aboutUs;



public AboutUs(WebDriver driver) {
	PageFactory.initElements(driver,this);
	 this.driver=driver;
}


public Youtube aboutusbutton() {
	
	aboutUs.click();
	return new Youtube(driver);
}



public WebElement getAboutUs() {
	return aboutUs;
}



}
