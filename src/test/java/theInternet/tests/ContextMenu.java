package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.TestBase;
import theInternet.pages.ContextMenuPage;

public class ContextMenu extends TestBase{
	@Test
	public void contextMenu() {
		
		String actual = new ContextMenuPage(baseUrl, driver)
				.navigateTo()
				.rightClick()
				.getTitle();
		
		Assert.assertEquals(actual, "The Internet");
	}
}
