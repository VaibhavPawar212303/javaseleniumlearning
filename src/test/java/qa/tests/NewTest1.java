package qa.tests;

import org.testng.annotations.Test;

import base.baseTest;
import pageEvent.RegistrationPage;
import pageEvent.loginPage;
import utils.ElementFetch;

public class NewTest1 extends baseTest {
	ElementFetch ele = new ElementFetch();
	loginPage login = new loginPage();
	RegistrationPage regPage = new RegistrationPage();
	
  @Test
  public void sampleMethodForEnteringCredentials() {
	  
	  login.enterCredentials();
	  login.logInbutton();
  }
}
