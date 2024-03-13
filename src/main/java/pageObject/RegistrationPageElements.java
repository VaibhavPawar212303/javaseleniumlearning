package pageObject;

public interface RegistrationPageElements {

	String UsernameField = "#content > div > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]";
	String PasswordField = "#content > div > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]";
	String RetypePasswordField = "#content > div > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=password]";
	String NameField = "#content > div > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]";
	String CreditCardNumberField = "#content > div > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=text]";
	String EmailField = "#content > div > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > input[type=text]";
	String PhoneNumberField = "#content > div > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > input[type=text]";
	String AddressField = "#content > div > form > table > tbody > tr:nth-child(8) > td:nth-child(2) > textarea";
	String SignUpButton = "#content > div > form > table > tbody > tr:nth-child(9) > td > input[type=submit]";
}
