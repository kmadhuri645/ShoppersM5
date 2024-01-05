package ObjectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishList {
	

	public AddToWishList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Jewelry')]")
	private WebElement jewelryLink;
	
	@FindBy(xpath = "//a[text()='Black & White Diamond Heart']")
	private WebElement whiteDiamond;
	
	@FindBy(xpath = "//input[@value='Add to wishlist']")
	private WebElement wishList;
	
	@FindBy(xpath = "//p[text()='The product has been added to your ']")
	private WebElement messages;
	
	public WebElement getMessages() {
		return messages;
	}

	public WebElement getWhiteDiamond() {
		return whiteDiamond;
	}

	public WebElement getWishList() {
		return wishList;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}
//***REMOVE TO WISHlIST*****
	@FindBy(xpath ="//span[text()='Wishlist']")
	private WebElement	wishListAdd;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement	checkBoxclick;
	
	@FindBy(xpath = "//input[@value='Update wishlist']")
	private WebElement	updateWishlist;

	public WebElement getWishListAdd() {
		return wishListAdd;
	}

	public WebElement getCheckBoxclick() {
		return checkBoxclick;
	}

	public WebElement getUpdateWishlist() {
		return updateWishlist;
	}
	
	

}
