package framework.loadingConfig;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeDriver implements SystemChecker {

	public WebDriver getDriver() {

		if (!isMac()) {
			URL url = ClassLoader.getSystemResource("chromedriver.exe");
			System.out.println(url.getFile());
			System.setProperty("webdriver.chrome.driver", url.getFile());
		}
		WebDriver chrome = new ChromeDriver();
		return chrome;
	}

}
