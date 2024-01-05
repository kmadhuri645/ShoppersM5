package frameworkWorkCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import GenericUtility.TakesScreenShotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotCheck {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenShotUtility ts=new TakesScreenShotUtility(driver);
		//ts.capturingScreenshot();
		ts.capturingScreenshot("madhu");

	}

}
