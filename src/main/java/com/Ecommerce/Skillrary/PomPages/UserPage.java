package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	public WebDriver driver;
@FindBy(xpath="//img[@class='user-image']")
private WebElement userbtn;

@FindBy(xpath="//a[text()='Profile']")
private WebElement profilebtn;

public UserPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
}

public EditPage userButton() {
	userbtn.click();
	profilebtn.click();
	return new EditPage(driver);
}
}
