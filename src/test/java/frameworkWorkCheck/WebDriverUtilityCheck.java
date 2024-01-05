package frameworkWorkCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import GenericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtilityCheck {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//WebElement element = driver.findElement(By.linkText("Log in"));
		WebElement element=driver.findElement(By.xpath("//strong[text()='Featured products']"));
		WebDriverUtility utility = new WebDriverUtility(driver);
		
		//utility.clickingOnElement(element);
		
	    //utility.clickingOnElementUsingJs(driver,Element );
		WebElement searchstore = driver.findElement(By.id("small-searchterms"));
		utility.enteringDataIntoElement(searchstore, "javascript");
		
		utility.explicitWaitReference(20).until(ExpectedConditions.alertIsPresent());
		utility.actionsReference().clickAndHold().perform();
		
		utility.scrollToAction(200,300);
		
		//utility.scrollIntoViewAction(element, true);
		utility.returnAlertReference().accept();

	}

}
