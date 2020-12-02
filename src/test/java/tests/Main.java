package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MainPage;

public class Main extends TestBase{
	
	@Test
	public void main() {
		
		String actualTitle = new MainPage(baseUrl,driver).navigateTo().getTitle();
		Assert.assertEquals(actualTitle, null);
	}

}
