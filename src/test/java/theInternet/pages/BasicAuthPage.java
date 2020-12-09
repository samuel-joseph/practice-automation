package theInternet.pages;

import org.openqa.selenium.WebDriver;

public class BasicAuthPage extends BasePage{

	public BasicAuthPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public BasePage sendAuth(String username, String password) {
		String key = "http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";
		driver.get(key);
		return this;
	}
	
	
}
