package ObjectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCamapareList {

	public AddToCamapareList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Computers')]")
	private WebElement computorsLink;

	@FindBy(xpath = "(//a[contains(text(),'Desktops')])[4]")
	private WebElement desktopsLink;

	@FindBy(xpath = "//a[text()='Build your own cheap computer']")
	private WebElement addToCartLink;

	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement addToCompareList;

	public WebElement getComputorsLink() {
		return computorsLink;
	}

	public WebElement getDesktopsLink() {
		return desktopsLink;
	}

	public WebElement getAddToCartLink() {
		return addToCartLink;
	}

	public WebElement getAddToCompareList() {
		return addToCompareList;
	}

	@FindBy(xpath = "//a[contains(text(),'Computers')]")
	private WebElement computorsLink1;

	@FindBy(xpath = "(//a[contains(text(),'Desktops')])[4]")
	private WebElement desktopsLink1;

	@FindBy(xpath = "//a[text()='Build your own computer']")
	private WebElement addToCartLink1;

	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement addToCompareList1;

	public WebElement getComputorsLink1() {
		return computorsLink1;
	}

	public WebElement getDesktopsLink1() {
		return desktopsLink1;
	}

	public WebElement getAddToCartLink1() {
		return addToCartLink1;
	}

	public WebElement getAddToCompareList1() {
		return addToCompareList1;
	}
}
