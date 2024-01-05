package frameworkWorkCheck;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class ListnerCheck extends BaseClass {
	@Test
	public void navigatingToFB() {
		driver.get("https://www.facebook.com");
		assertTrue(false);
	}
	@Test
	public void navigatingToIstra() {
		driver.get("https://www.instagram.com");
		assertTrue(false);
	}
	@Test
	public void navigatingTogoogle() {
		driver.get("https://www.google.com");
		assertTrue(false);
	}

}
