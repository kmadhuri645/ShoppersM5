package ObjectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendEmail {
	
	public SendEmail(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[contains(text(),'14.1-inch Laptop')])")
	private WebElement productLink;
	
	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement emailFriend;
	
	@FindBy(id ="FriendEmail")
	private WebElement friendEmailTextField;
	
	@FindBy(id ="YourEmailAddress")
	private WebElement yourEmailAddress;
	
	@FindBy(id ="PersonalMessage")
	private WebElement personalMessageTextField;
	
	@FindBy(xpath = "//input[@name='send-email']")
	private WebElement sendMail;
	
	@FindBy(xpath = "//li[text()='Only registered customers can use email a friend feature']")
    private WebElement errorMessage;
	
	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getEmailFriend() {
		return emailFriend;
	}

	public WebElement getFriendEmailTextField() {
		return friendEmailTextField;
	}

	public WebElement getYourEmailAddress() {
		return yourEmailAddress;
	}

	public WebElement getPersonalMessageTextField() {
		return personalMessageTextField;
	}

	public WebElement getSendMail() {
		return sendMail;
	}

	
}
