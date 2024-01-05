package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import ObjectRepostiory.AddToCamapareList;
import ObjectRepostiory.AddToCart;
import ObjectRepostiory.AddToWishList;
import ObjectRepostiory.JwelleryPrice;
import ObjectRepostiory.LoginPage;
import ObjectRepostiory.RemoveToCompareList;
import ObjectRepostiory.SendEmail;
import ObjectRepostiory.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IAutoConstants {

	public static WebDriver driver;

	public static TakesScreenShotUtility screenshot;
	public static WebDriverUtility webDriverUtility;
	public static ExtentTest logger;
	PropertyUtility property;
	DatabaseUtility dbUtility;
	JavaUtility javaUtility;
//***************************************
	public static LoginPage loginpage;
	public static SignUpPage signUpPage;
	public static AddToCart addToCart;
	public static AddToCamapareList campareList;
	public static RemoveToCompareList removeList;
    public static JwelleryPrice jwelleryPrice;
    public static  AddToWishList addToWishList;
    public static SendEmail sendMail;
	@BeforeClass
	public void launchingBrowserAndNavigateToApp() {
		property = new PropertyUtility();

		if (BROWSER.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));
		webDriverUtility = new WebDriverUtility(driver);
		screenshot = new TakesScreenShotUtility(driver);
		dbUtility = new DatabaseUtility();
		javaUtility = new JavaUtility();
//**********************************************************************************************		
		loginpage = new LoginPage(driver);
		signUpPage = new SignUpPage(driver);
		addToCart = new AddToCart(driver);

		campareList = new AddToCamapareList(driver);
	    removeList = new RemoveToCompareList(driver);
	    jwelleryPrice = new JwelleryPrice(driver);
	    addToWishList = new AddToWishList(driver);
         sendMail = new SendEmail(driver);
	}

	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() {

		System.out.println("logged in to application");

	}

	@AfterMethod(alwaysRun = true)
	public void logOutFromApplication() {
		System.out.println("logged out from apllication");

	}

	@AfterClass(alwaysRun = true)
	public void teardownTheBrowser() {
		driver.quit();
	}

}
