package framework.loadingConfig;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class TestLoadManager {
	
	public WebDriver driver;
	public String baseUrl;
	public String driverName;

	public void loadConfigurations(String fileName) {
		HashMap<String, String> configs = null;
		try {
			configs = new ConfigurationProvider().getDataFromTheFile(fileName);
		} catch(IOException e) {
			throw new RuntimeException("Config file does not exist.");
		}
		baseUrl = configs.get(ConfigurationParameters.Url);
		driverName = configs.get(ConfigurationParameters.Driver);
		System.out.println(driverName);
		System.out.println(baseUrl);
		driver = new DriverManager(driverName).getDriver();
	}

}
