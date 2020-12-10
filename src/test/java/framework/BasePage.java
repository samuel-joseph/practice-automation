package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
	protected WebDriver driver;
	private String baseUrl;

	public BasePage(String url, WebDriver driver) {
		this.driver = driver;
		this.baseUrl = url;
	}

	public BasePage navigateTo(String url) {
		driver.get(this.baseUrl + url);
		driver.manage().window().maximize();
		return this;
	}

	public void disconnect() {
		driver.quit();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public BasePage refresh() {
		driver.navigate().refresh();
		return this;
	}
	
	public void rightClick(String id) {
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(By.id(id));
		actions.contextClick(target).perform();
	}
	
	public void alertAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void clickToNavigate(WebElement element) {
		element.click();
	}
	
	public void backPage() {
		driver.navigate().back();
	}
	
}
