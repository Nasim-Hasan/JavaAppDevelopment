/**
 * 
 */
package mapinterfacedemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author nhasa
 *
 */
public class MapInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//..HashMap...//
		Map<Integer,String> objmap=new HashMap<Integer,String>();
		
		objmap.put(1,"Shamim");
		objmap.put(2,"Karim");
		objmap.put(3,"Shamim");
		
		for (int i=1;i<=objmap.size();i++)
		{
			System.out.println("Hash Map:"+objmap.get(i));
		}
		
		//..Repetition of Key...//
		objmap.put(1,"Shamim");
		objmap.put(2,"Karim");
		objmap.put(2,"Reza");
		
		for (int i=1;i<=objmap.size();i++)
		{
			System.out.println("Hash Map (Repetition of Key):"+objmap.get(i));
		}
		
		//...TreeMap....//
		Map<Integer,String> obj1map=new TreeMap<Integer,String>();
		
		obj1map.put(1,"Shamim");
		obj1map.put(2,"Karim");
		obj1map.put(3,"Amin");
		
		for (int i=1;i<=obj1map.size();i++)
		{
			System.out.println("Tree Map:"+obj1map.get(i));
		}
		
		//...LinkedHashMap....//
	    Map<Integer,String> obj2map=new LinkedHashMap<Integer, String>();
		
		obj2map.put(1,"Shamim");
		obj2map.put(2,"Karim");
		obj2map.put(3,"Amin");
		
		for (int i=1;i<=obj2map.size();i++)
		{
			System.out.println("Linked Hash Map:"+obj2map.get(i));
		}

	}

}
