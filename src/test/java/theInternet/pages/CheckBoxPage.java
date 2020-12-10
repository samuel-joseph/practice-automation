package theInternet.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.BasePage;

public class CheckBoxPage extends BasePage{
	String url = "/checkboxes";

	public CheckBoxPage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public CheckBoxPage navigateTo() {
		super.navigateTo(url);
		return this;
	}
	
	public CheckBoxPage check() {
		WebElement form = driver.findElement(By.id("checkboxes"));
		List<WebElement> inputs = form.findElements(By.tagName("input"));
		
		for(WebElement input : inputs) {
			if(!input.isSelected()) {
				System.out.println(input.isSelected());
				input.click();
			}
		}
		
		return this;
	}

}
