package framework.loadingConfig;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	private String driverName;
	
	public DriverManager(String driverName) {
		this.driverName = driverName;
	}
	
	public WebDriver getDriver() {
		if(driverName.equals("Chrome")) {
			return new CromeDriver().getDriver();
		}
		return null;
	}

}
