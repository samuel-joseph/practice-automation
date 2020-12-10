package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import framework.loadingConfig.TestLoadManager;

public class TestBase {
	public WebDriver driver;
	protected String baseUrl;
	
	@BeforeMethod
	public void beforeMethod(ITestContext context) {
		
		TestLoadManager manager = new TestLoadManager();
		manager.loadConfigurations("config.properties");
		driver = manager.driver;
		baseUrl = manager.baseUrl;
		context.setAttribute("driver", driver);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void clickButton(String cssSelector) {
		driver.findElement(By.cssSelector(cssSelector)).click();
	}
	
}
