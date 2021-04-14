package com.Ecommerce.Skillrary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {
	public WebDriver driver;
	
	@FindBy(xpath="//i[@class='fa fa-edit']")
	private WebElement editBtn;
	
	public EditPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public UserDetailsPage editButton() {
		editBtn.click();
		return new UserDetailsPage(driver);
	}

}
