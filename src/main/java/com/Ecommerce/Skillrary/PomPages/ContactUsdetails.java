package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ContactUsdetails {
	
public WebDriver driver;
	@FindBy(name="name")
	private WebElement nameTb;
	
	@FindBy(name="sender")
	private WebElement emailtb;
	
	@FindBy(name="subject")
	private WebElement subjectTb;
	
	@FindBy(name="message")
	private WebElement messageTb;
	
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendusEmail;
	
	@FindBy(xpath="//div[text()=' Thank You , Your message has been sent ! ']")
	private WebElement successtext;

	


	public WebElement getNameTb() {
		return nameTb;
	}

	public WebElement getEmailtb() {
		return emailtb;
	}

	public WebElement getSubjectTb() {
		return subjectTb;
	}

	public WebElement getMessageTb() {
		return messageTb;
	}

	public WebElement getSendusEmail() {
		return sendusEmail;
	}
	
	public ContactUsdetails(WebDriver driver) {
		PageFactory.initElements(driver,this);
		 this.driver=driver;
	}
	
	public void contatctDetails(String name,String email,String sub,String msg) {
		nameTb.sendKeys(name);
		emailtb.sendKeys(email);
		subjectTb.sendKeys(sub);
		messageTb.sendKeys(msg);
		sendusEmail.click();
	
		
	}
	
	
	public void verifytext(String exptext,String s) {
		String actualtext = successtext.getText().trim();
		Assert.assertEquals(actualtext,exptext.contains(s));
		Reporter.log(actualtext,true);
	}

	
}
