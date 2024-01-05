package frameworkWorkCheck;

import java.util.ArrayList;

import GenericUtility.DatabaseUtility;

public class DataBaseCheck {

	public static void main(String[] args) {
		DatabaseUtility utility = new DatabaseUtility();
		utility.establishingConnections();
		
		ArrayList data = utility.readingDataFromDataBase("select*from qspider", "name");
		for(Object v:data) {
			System.out.println(v);
		}
		utility.closingConnection();
		
	}

}
