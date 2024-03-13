package pageEvent;

import pageObject.RegistrationPageElements;
import utils.ElementFetch;

public class RegistrationPage {

	ElementFetch ele = new ElementFetch();

	public void enterData() {
		ele.getWebElement("CSS", RegistrationPageElements.UsernameField).sendKeys("rajat_khatri");
		ele.getWebElement("CSS", RegistrationPageElements.PasswordField).sendKeys("rajat12");
		ele.getWebElement("CSS", RegistrationPageElements.RetypePasswordField).sendKeys("rajat12");
		ele.getWebElement("CSS", RegistrationPageElements.NameField).sendKeys("Rajat");
		ele.getWebElement("CSS", RegistrationPageElements.CreditCardNumberField).sendKeys("0912873465");
		ele.getWebElement("CSS", RegistrationPageElements.EmailField).sendKeys("rajat@orkut.co.in");
		ele.getWebElement("CSS", RegistrationPageElements.PhoneNumberField).sendKeys("1234567890");

		ele.getWebElement("CSS", RegistrationPageElements.SignUpButton).click();
	}

}
