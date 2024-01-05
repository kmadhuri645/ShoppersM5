package frameworkWorkCheck;

import java.io.File;
import java.io.IOException;

public class FIleHandling {

	public static void main(String[] args) throws IOException {
		File f = new File("./reports1/reportname.html");
		f.mkdir();
		System.out.println("done");
		f.createNewFile();
		System.out.println("done");

	}

}
