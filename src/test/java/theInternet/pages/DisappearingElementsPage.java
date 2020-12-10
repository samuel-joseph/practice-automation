package theInternet.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Lists;

import framework.BasePage;

public class DisappearingElementsPage extends BasePage {
	String url = "/disappearing_elements";

	public DisappearingElementsPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public DisappearingElementsPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public DisappearingElementsPage clickNav() {
		WebElement ul = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul"));
		List<WebElement> lis = ul.findElements(By.tagName("li"));
		System.out.println(lis.size());
		
		for(int i = 1;i<=lis.size();i++) {
			driver.findElement(By.xpath(String.format("//*[@id=\"content\"]/div/ul/li[%s]/a",i))).click();
			super.backPage();
		}
		
//		for (WebElement li : Lists.reverse(lis)) {
//			clickToNavigate(li);
//			super.backPage();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		}
		return this;
	}

}
