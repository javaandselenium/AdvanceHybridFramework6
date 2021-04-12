package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {

	@FindBy(name="addresstype")
	private WebElement coursedd;

	public WebElement getCoursedd() {
		return coursedd;
	}
	
	public SkillraryDemoLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	
}
