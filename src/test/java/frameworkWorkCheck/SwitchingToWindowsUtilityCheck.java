package frameworkWorkCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import GenericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingToWindowsUtilityCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		String parentId = driver.getWindowHandle();

		driver.findElement(By.xpath("//div[contains(text(),'Bhawna Collection Loard Shiv')]")).click();
		
		WebDriverUtility utility = new WebDriverUtility(driver);
		utility.switchingToWindow(driver.getWindowHandles(), "Buy Bhawna Collection Loard Shiv", parentId);
		
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		Thread.sleep(3000);
		driver.close();
		
		utility.switchingBackToMainWindow(parentId);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Bentag kitchenware Vegetable')]")).click();
		utility.switchingToWindow(driver.getWindowHandles(), "Buy Bentag kitchenware Vegetable & Fruit", parentId);
		
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();

		driver.close();
	}

}
