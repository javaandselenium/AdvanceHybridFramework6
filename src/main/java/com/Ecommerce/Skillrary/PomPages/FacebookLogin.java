package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	public WebDriver driver;
	@FindBy(xpath="//button[text()='Like']")
	private WebElement likeButton;

	public WebElement getLikeButton() {
		return likeButton;
	}
	
	public FacebookLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public Testing likebtn() {
		likeButton.click();
		return new Testing(driver);
	}

}
