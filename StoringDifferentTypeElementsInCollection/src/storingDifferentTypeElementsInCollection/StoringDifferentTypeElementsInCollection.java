/**
 * 
 */
package storingDifferentTypeElementsInCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nhasa
 *
 */
public class StoringDifferentTypeElementsInCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> objList = new ArrayList<>();
		objList.add("Nasim");
		objList.add(12);
		System.out.println("Object List Contains Different Type of  Data.\nThose are:");
		for (Object tmpObject :objList) {
			System.out.println(tmpObject);
		}

	}

}
