/**
 * 
 */
package streamforeachdemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author nhasa
 *
 */
public class StreamForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List number = Arrays.asList(2,3,4,5);
		number.stream().forEach(y->System.out.println(y));
		
		}

}
