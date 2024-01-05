package ObjectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;
	
	@FindBy(id = "gender-female")
	private WebElement genderCheckBox;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameLink;
	
	@FindBy(id = "LastName")
	private WebElement lastNameLink;
	
	@FindBy(id = "Email")
	private WebElement emailLink;
	
	@FindBy(id = "Password")
	private WebElement passwordLink;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPassworddLink;
	
	@FindBy(id = "register-button")
	private WebElement registerbuttonLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getGenderCheckBox() {
		return genderCheckBox;
	}

	public WebElement getFirstNameLink() {
		return firstNameLink;
	}

	public WebElement getLastNameLink() {
		return lastNameLink;
	}

	public WebElement getEmailLink() {
		return emailLink;
	}

	public WebElement getPasswordLink() {
		return passwordLink;
	}

	public WebElement getConfirmPassworddLink() {
		return confirmPassworddLink;
	}

	public WebElement getRegisterbuttonLink() {
		return registerbuttonLink;
	}
	
	
	
	
}
