package org.adacting;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class AdactingLogin extends BaseLogin {
	
public AdactingLogin () {
	PageFactory.initElements(driver,this);
}
	@FindBy(id="username")
	private  WebElement User;
	@FindBy(id="password")
	private WebElement Pass;
	@FindBy(xpath="//input[@class='login_button']")
	private List< WebElement >Login;
	
	public WebElement getUser() {
		return User;
	}
	public WebElement getPass() {
		return Pass;
	}
	public List<WebElement> getLogin() {
		return Login;
	}

}


