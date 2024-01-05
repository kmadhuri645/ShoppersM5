package frameworkWorkCheck;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {

	public static void main(String[] args) {
		
		ExtentSparkReporter reporter=new ExtentSparkReporter("./report/demoExtent.html");
		reporter.config().setTheme(Theme.STANDARD);//for foramte
		reporter.config().setDocumentTitle("this is sample report");
		reporter.config().setReportName("selenium is my name");
		reporter.config().setCss("madhu");
		
		ExtentReports report=new ExtentReports();//manage and attached the reports and build the test report.
		report.attachReporter(reporter);//it will generate the report
		
		ExtentTest logger = report.createTest("test1");//create the test with name of test1.
		//ExtentTest logger1 = report.createTest("test2");
		
		//logger1.log(Status.FAIL, "This is Failes");//log is method 
		
		
		logger.log(Status.FAIL, "This is Failes");//log is method 
		
		logger.log(Status.PASS, "This is passed");//status is enum
		
		logger.log(Status.INFO, "This is information");
		
		logger.log(Status.SKIP, "This is skipped");
		
		logger.log(Status.WARNING, "This is warning");
		
		logger.addScreenCaptureFromPath("D:\\OppsConcepts\\AdavanceAutomation\\target\\errorsshots\\madhu.png");
		logger.addScreenCaptureFromPath("D:\\OppsConcepts\\AdavanceAutomation\\target\\errorsshots\\task 2023-10-26T13-26-41.100230500.png");
		logger.addScreenCaptureFromPath("C:\\Users\\kmadh\\Pictures\\Screenshots\\Screenshot (168).png");
		report.flush();//finalizes and generates the report, saving it to the specified file.
		
		System.out.println("done");
		
		
				
		

	}

}
