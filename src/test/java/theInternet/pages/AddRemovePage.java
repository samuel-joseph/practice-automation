package theInternet.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.BasePage;

public class AddRemovePage extends BasePage{

	public AddRemovePage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public AddRemovePage navigateTo(String url) {
		super.navigateTo(url);
		return this;
	}
	
	public AddRemovePage addButton(Integer num) {
		WebElement button = driver.findElement(By.cssSelector("div.example button"));
		for(Integer x = 1; x<=num; x++) {
			button.click();

		}
		return this;
	}
	
	public AddRemovePage removeButton() {
		List<WebElement> groupDelete = driver.findElements(By.cssSelector("#elements button.added-manually"));
		System.out.println(groupDelete.size());
		if(groupDelete.size()!=0) {
			for(WebElement delete:groupDelete) {
				delete.click();
			}
		}
		
		return this;
	}

}
