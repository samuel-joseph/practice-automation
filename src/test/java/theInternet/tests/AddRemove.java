package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.AddRemovePage;

public class AddRemove extends TestBase{
	@Test
	public void addRemove() {
		String url = "/add_remove_elements/";
		String actual = new AddRemovePage(baseUrl, driver)
				.navigateTo(url)
				.addButton(100)
				.removeButton()
				.getTitle();
		
		Assert.assertEquals(actual, "The Internet");
	}
}
