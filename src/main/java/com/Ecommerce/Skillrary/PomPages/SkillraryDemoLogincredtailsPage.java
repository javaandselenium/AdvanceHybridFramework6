package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogincredtailsPage {
@FindBy(xpath="//a[text()='LOGIN']")
private WebElement loginbtn;

@FindBy(id="email")
private WebElement usertb;

@FindBy(id="password")
private WebElement passwordtb;

@FindBy(id="last")
private WebElement sumbitbtn;

public SkillraryDemoLogincredtailsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void logindetaisls(String username,String password) {
	loginbtn.click();
	usertb.sendKeys(username);
	passwordtb.sendKeys(password);
	sumbitbtn.click();
}
}
