package ObjectRepostiory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JwelleryPrice {
	
	public JwelleryPrice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Jewelry')]")
	private WebElement jewelryLink;
	
	@FindBy(xpath = "//span[text()='500.00']")
	private WebElement priceLink;
	
	@FindBy(xpath = "//span[text()='100.00']")
	private WebElement ownJwellaryLink;
	
	//**********************Mam*****************************
	@FindBy(xpath =" //div[@class='prices']")
	private	List<WebElement> allPrizes;

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public List<WebElement> getAllPrizes() {
		return allPrizes;
	}

	public WebElement getPriceLink() {
		return priceLink;
	}

	public WebElement getOwnJwellaryLink() {
		return ownJwellaryLink;
	}
	

}
