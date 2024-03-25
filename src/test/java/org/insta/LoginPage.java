package org.insta;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseMethod{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;

	public WebElement pass() {
		return user;
	}
	
	
	
	
}
