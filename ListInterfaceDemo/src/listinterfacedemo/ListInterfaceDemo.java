/**
 * 
 */
package listinterfacedemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * @author nhasa
 *
 */
public class ListInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list1= new ArrayList<String>();  
		List <String> list2 = new LinkedList<String>();  
		Vector <String> list3 = new Vector<String>();  
		Stack <String> list4 = new Stack<String>();  
		
		//..ArrayList Activities.....//
		list1.add("Ravi");
		list1.add("Vijay");  
		list1.add("Ravi");  
		list1.add("Ajay"); 
		
		System.out.println("ArrayList Values:");
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			
		}
		
		//....LinkedList Activities...//
		list2.add("Nasim");
		list2.add("Hasan");  
		list2.add("Ram");  
		list2.add("Yadav"); 
		
		System.out.println("LinkedList Values:");
		
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
			
		}
		
		//...Vector Activities....//
		list3.add("Arif");
		list3.add("Mamun");  
		list3.add("Jamil");  
		list3.add("Rishi"); 
		
		System.out.println("Vector Values:");
		
		for(int i=0;i<list3.size();i++)
		{
			System.out.println(list3.get(i));
			
		}
		
		//...Stack Activities.....//
		list4.push("Helena");
		list4.push("John");  
		list4.push("Abir");  
		list4.push("Rana"); 
		
		list4.pop(); //...Last In First Out (LIFO)...//
		
		System.out.println("Stack Values:");
		
		for(int i=0;i<list4.size();i++)
		{
			System.out.println(list4.get(i));
			
		}

	}

}
