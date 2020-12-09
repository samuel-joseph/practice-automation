package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengingDomPage extends BasePage{
	
	String url = "/challenging_dom";

	public ChallengingDomPage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public ChallengingDomPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public ChallengingDomPage clickButton(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		return this;
	}


}
