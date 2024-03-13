package pageObject;

public interface LoginPageElements {
	 
	
	String loginButton =
			"//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input";

	String UsernameField 
	= "//*[@id=\"content\"]/div[1]/form/table/tbody/tr[1]/td[2]/input";
  String PasswordField =
		  "#content > div:nth-child(1) > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]";

  String SignUpButton = "//*[@id=\"content\"]/div[2]/h3/a";
}
