package theInternet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.BasePage;

public class ContextMenuPage extends BasePage {
	String url = "/context_menu";

	public ContextMenuPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public ContextMenuPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public ContextMenuPage rightClick() {
		super.rightClick("hot-spot");
		
		super.alertAccept();
		return this;
	}

}
