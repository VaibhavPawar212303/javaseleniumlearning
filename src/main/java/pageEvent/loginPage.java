package pageEvent;

import pageObject.LoginPageElements;
import utils.ElementFetch;

public class loginPage {

	ElementFetch ele = new ElementFetch();
	
	public void enterCredentials() {
		ele.getWebElement("XPATH", LoginPageElements.UsernameField)
		.sendKeys("test");
		ele.getWebElement("CSS", LoginPageElements.PasswordField)
		.sendKeys("test");
		
	}
	public void logInbutton() {
	 ele.getWebElement("XPATH", LoginPageElements.loginButton).click();
	}


public void hitSignUp () {
	ele.getWebElement("XPATH", LoginPageElements.SignUpButton).click();
}
}