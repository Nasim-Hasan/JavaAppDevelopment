/**
 * 
 */
package setinterfacedemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
		
		//...HashSet...//
		Set<String> objset = new HashSet<String>();
		
		objset.add("Amil");
		objset.add("Hasan");
		objset.add("Rahim");
		objset.add("Amil");
		
		System.out.println(objset);
		
		Object[] objarray=objset.toArray();
		
		for (int i=0;i<objarray.length;i++)
		{
			System.out.println("Hash Set:"+objarray[i]);
			
		}
		
		//...TreeSet...//
        Set<String> obj1set = new TreeSet<String>();
		
		obj1set.add("Amil");
		obj1set.add("Hasan");
		obj1set.add("Rahim");
		obj1set.add("Amil");
		
	    System.out.println(obj1set);
		
		Object[] obj1array=obj1set.toArray();
		
		for (int i=0;i<obj1array.length;i++)
		{
			System.out.println("Tree Set:"+obj1array[i]);
			
		}
		
		//..LinkedHashSet....//
	    Set<String> obj2set = new LinkedHashSet<String>();
		
		obj2set.add("Amil");
		obj2set.add("Hasan");
		obj2set.add("Rahim");
		obj2set.add("Amil");
		
	    System.out.println(obj2set);
		
		Object[] obj2array=obj2set.toArray();
		
		for (int i=0;i<obj2array.length;i++)
		{
			System.out.println("Linked Hash Set:"+obj2array[i]);
			
		}
		
	}

}
