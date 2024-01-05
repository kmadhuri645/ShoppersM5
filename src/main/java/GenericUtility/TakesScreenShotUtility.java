package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakesScreenShotUtility {
	WebDriver driver;
	TakesScreenshot ss;
	
	public TakesScreenShotUtility(WebDriver driver) {
		
		this.driver=driver;
		ss=(TakesScreenshot) this.driver;
	}
	//public void capturingScreenshot() {
	//	File photo = ss.getScreenshotAs(OutputType.FILE);
		//File destination = new File("./target/errorsshots/demo.png");
	
	public String capturingScreenshot(String screenshotName) {
		File photo = ss.getScreenshotAs(OutputType.FILE);
		String time=LocalDateTime.now().toString().replace(':', '-');
		String directory=System.getProperty("user.dir");
		
		//File destination = new File("./target/errorsshots/demo.png");
		//File destination = new File("./target/errorsshots/"+screenshotName+".png");
		//File destination = new File("./target/errorsshots/"+screenshotName+" "+time+".png");
		String path =""+directory+"./target/errorsshots/"+screenshotName+" "+time+".png";
		File destination=new File(path);
		
		try {
			FileUtils.copyFile(photo, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return path;
	}
	
}
