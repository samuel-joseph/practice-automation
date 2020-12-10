package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.TestBase;
import theInternet.pages.CheckBoxPage;

public class CheckBox extends TestBase{
	@Test
	public void checkBox() {
		
		String actual = new CheckBoxPage(baseUrl, driver)
				.navigateTo()
				.check()
				.getTitle();
		
		Assert.assertEquals(actual, "The Internet");
	}
}
