package ObjectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[contains(text(),'14.1-inch Laptop')])")
	private WebElement productLink;
	
	@FindBy(id="add-to-cart-button-31")
	private WebElement clickAddButton;

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getClickAddButton() {
		return clickAddButton;
	}
	
//*****************************************************************************************	
	@FindBy(xpath = "//a[contains(text(),'Books')]")
	private WebElement booksLink;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCartButton;

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

}
