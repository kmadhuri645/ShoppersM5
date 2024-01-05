package frameworkWorkCheck;

import org.testng.annotations.Test;

import GenericUtility.ExcelUtility;

public class ExcelCheck {
	
	@Test(dataProvider = "data",dataProviderClass = ExcelUtility.class)//it will search the data by using name and class name
	
	public void read(String a,String b, String c) {
		System.out.println(a+" "+b+" "+c);
	}

}
