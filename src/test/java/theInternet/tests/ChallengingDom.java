package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.TestBase;
import theInternet.pages.ChallengingDomPage;

public class ChallengingDom extends TestBase{
	@Test
	public void challengingDom() {
		String xpath = "//div[@id='content']/div[@class='example']/div/div/div[1]/a[3]";
		
		String actual = new ChallengingDomPage(baseUrl, driver)
				.navigateTo()
				.clickButton(xpath)
				.getTitle();
		
		Assert.assertEquals(actual, "The Internet");
	}
}
