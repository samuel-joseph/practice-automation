package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.TestBase;
import theInternet.pages.DisappearingElementsPage;

public class DisappearingElements extends TestBase{
	
	@Test
	public void disappearingElement() {
		
		String actual = new DisappearingElementsPage(baseUrl,driver)
				.navigateTo()
				.clickNav()
				.getTitle();
		
		Assert.assertEquals(actual, "The Internet");
	}

}
