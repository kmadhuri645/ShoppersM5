package GenericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtility {
	JavascriptExecutor js;
	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		this.driver =driver;
		js=(JavascriptExecutor)driver;
	} 
	/**
	 * This method is used to enter the data using javascript executor
	 * @param element 
	 * @param data which has to enter to the element
	 */
	public void clickingOnElement(WebElement element) {
		
		js.executeScript("arguments[0].click;", element);
	}
	
    public void enteringDataIntoElement(WebElement element,String data) {
		
		js.executeScript("arguments[0].value='"+data+"'", element);
	}
    
    
    //OLD APProach
	/*public void clickingOnElementUsingJs(WebDriver driver,WebElement Element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argoments[0].click;", Element);
		*/
    
 /**This method return the reference of webdriverwait to achive explicitwait
  * @param time to time
  * @return
  */
	
   public WebDriverWait explicitWaitReference(int time) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
	return wait;
}
/**this method return the action class reference
 * @return
 */
   
   public Actions actionsReference() {
	  Actions action=new Actions(driver);
	  return action;
	 
   }
   
   public void handlingDropdown(WebElement element ,String value) {
	  Select select = new Select(element);
	  try {
		  select.selectByVisibleText(value);
		  
	  }catch(Exception e1) {
		  try {
			  select.selectByValue(value); 
		  }catch(Exception e) {
			 int val = Integer.parseInt(value);
			 select.selectByIndex(val);
			  
		  //select.selectByIndex(Integer.parseInt(value));
	  }
	  }
   }
   /*This method is used to perform scrollTo action
    *@param x
    *@param y
    */
   public void scrollToAction(int x,int y) {
	   js.executeScript("window.scrollTo("+x+","+y+")");
   }
   /*This method is used to perform scrollBy action
    *@param x
    *@param y
    */
  public void scrollByAction(int x,int y) {
	  js.executeScript("window.scrollBY("+x+","+y+")");
	   
   }
  /**
   * this method is used to scroll to the element to increase the element visibility
   * if the status is true the window will scroll untill the element reaches the top
   * if the status is false the window will scroll untill the element reaches the buttom
   * @param
   * @param status
   */
  
  public void scrollIntoViewAction(WebElement element ,Boolean status) {
	  js.executeScript("arguments[0].scrollIntoView("+status+")",element);
	   
   }
  /**
   * This method is used to switch the control from window to frame with the help of index
   * @param index
   */
  public void switchingToFrame(int index) {
	  driver.switchTo().frame(index);
  }

/**
 * This method is used to switch the control from window to frame with the help of name
 * @param name
 */

public void switchingToFrame(String name) {
	  driver.switchTo().frame(name);
}
/**
 * This method is used to switch the driver control from window to frame with the help of Webelement
 * @param element
 */

public void switchingToFrame(WebElement element) {
	  driver.switchTo().frame(element);
}	
/**
 * This method is used to switch the control from  frame to window index
 * @param name
 */

public void switchingBackToMainWindow(WebElement element) {
	  driver.switchTo().defaultContent();
}
/**
 * This method is returning the alert reference
 * @return
 */

public  Alert returnAlertReference() {
	//driver.switchTo().alert();
	return driver.switchTo().alert();
}
/**
 * This method is used to switch the driver control from one window to another windows
 * @param allWindowId
 * @param expectedTitle
 * @param parentId
 */

public void switchingToWindow(Set<String> allWindowId ,String expectedTitle ,String parentId) {
	allWindowId.remove(parentId);
	for(String id:allWindowId) {
		driver.switchTo().window(id);
		if(expectedTitle.equalsIgnoreCase(driver.getTitle())){
			break;
		}
	}
}
/**
 * This method is used to switch the control back to parent window
 * @param parentID
 */
public void switchingBackToMainWindow(String parentID) {
	driver.switchTo().window(parentID);
	
}
	
}
	   
