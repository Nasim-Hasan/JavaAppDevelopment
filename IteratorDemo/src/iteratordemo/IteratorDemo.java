/**
 * 
 */
package iteratordemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author nhasa
 *
 */
public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits= new ArrayList<String>();
		
		//..Adding Fruits...//
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		Iterator<String> itr = fruits.iterator(); 
		
		while (itr.hasNext()) //..Iterator Loop...//
		{
			String name=itr.next();
			System.out.println("The Name of the Fruit is:"+name);
		}
		

	}

}
