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

@FindBy(xpath="//span[text()='Select']")
private WebElement addressType;

@FindBy(xpath="(//div[@class='chosen-search'])[2]")
private WebElement serchtb;

@FindBy(id="address")
private WebElement addresstb;

@FindBy(id="male")
private WebElement radiobtn;

@FindBy(id="birthday")
private WebElement birthdaybtn;

@FindBy(id="curr_password")
private WebElement currentPassword;

@FindBy(xpath="//button[text()='Update']")
private WebElement updateBtn;

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
public void addresstype(String data,String address) {
	addressType.click();
	serchtb.sendKeys(data);
	addresstb.sendKeys(address);
	radiobtn.click();
	
}

public void updateElements(String DOB,String cpwd) {
	birthdaybtn.sendKeys(DOB);
	currentPassword.sendKeys(cpwd);
	updateBtn.click();
}

public WebElement getFirstnametb() {
	return firstnametb;
}

public WebElement getLastnametb() {
	return lastnametb;
}

public WebElement getEmailtb() {
	return emailtb;
}

public WebElement getPasswordtb() {
	return passwordtb;
}

public WebElement getContacttb() {
	return contacttb;
}

public WebElement getAddressType() {
	return addressType;
}

public WebElement getSerchtb() {
	return serchtb;
}

public WebElement getAddresstb() {
	return addresstb;
}

public WebElement getRadiobtn() {
	return radiobtn;
}

public WebElement getBirthdaybtn() {
	return birthdaybtn;
}

public WebElement getCurrentPassword() {
	return currentPassword;
}

public WebElement getUpdateBtn() {
	return updateBtn;
}

}
