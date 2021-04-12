package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPage {
@FindBy(id="firstname")
private WebElement firstnametb;


@FindBy(id="lastname")
private WebElement lastnametb;


@FindBy(id="email")
private WebElement emailtb;

@FindBy(id="password")
private WebElement passwordtb;

@FindBy(id="contact")
private WebElement contacttb;

public UserDetailsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void userDetails(String fn,String ln,String email,String pwd,String contact) {
	firstnametb.sendKeys(fn);
	lastnametb.sendKeys(ln);
	emailtb.sendKeys(email);
	passwordtb.sendKeys(pwd);
	contacttb.sendKeys(contact);
}

}
