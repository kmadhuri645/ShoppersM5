package GenericUtility;

import java.util.Random;
/**
 * 
 * @author kmadh
 *
 */
public class JavaUtility {
	/**
	 * 
	 * @param range
	 * @return
	 */
	
	public int generateRandomNumber(int range) {
		
		Random r=new Random();
		return r.nextInt(range);
				
	}

}
