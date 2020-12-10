package theInternet.pages;

import org.openqa.selenium.WebDriver;

import framework.BasePage;

public class MainPage extends BasePage{
	
	public MainPage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public MainPage navigateTo() {
		super.navigateTo("");
		return this;
	}
	
	public String getTitle() {
		return super.getTitle();
	}
}
