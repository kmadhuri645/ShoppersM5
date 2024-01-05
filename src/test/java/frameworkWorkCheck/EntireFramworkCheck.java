package frameworkWorkCheck;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class EntireFramworkCheck extends BaseClass {
	
	@Test
	public void sampleTestCase() {
		System.out.println("in from testcase01 ");
		
	}
	@Test
	public void sampleTestCase1() {
		driver.findElement(By.linkText("Log in")).click();
		assertFalse(true);
		System.out.println("fail");
	}
	
	

}
