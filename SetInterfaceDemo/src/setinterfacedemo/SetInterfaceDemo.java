/**
 * 
 */
package setinterfacedemo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nhasa
 *
 */
public class SetInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> objset = new HashSet<String>();
		
		objset.add("Amil");
		objset.add("Hasan");
		objset.add("Rahim");
		objset.add("Amil");
		
		System.out.println(objset);
		
		Object[] objarray=objset.toArray();
		
		System.out.println("Values:");
		
		for (int i=0;i<objarray.length;i++)
		{
			System.out.println(objarray[i]);
			
		}
		
	}

}
