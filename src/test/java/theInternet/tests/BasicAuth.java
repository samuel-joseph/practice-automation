package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.TestBase;
import theInternet.pages.BasicAuthPage;

public class BasicAuth extends TestBase{
	
	@Test
	public void basicAuth() {
		String username = "admin";
		String password = "admin";
		String actual = new BasicAuthPage(baseUrl, driver)
				.sendAuth(username, password)
				.getTitle();
		Assert.assertEquals(actual, "The Internet");
	}
}
