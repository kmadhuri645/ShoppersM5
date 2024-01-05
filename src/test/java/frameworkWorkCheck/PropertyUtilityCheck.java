package frameworkWorkCheck;

import GenericUtility.PropertyUtility;

public class PropertyUtilityCheck {

	public static void main(String[] args) {
		
		PropertyUtility utility =new PropertyUtility();
		
		System.out.println(utility.getDataFromPropertyFile("url"));

	}

}
