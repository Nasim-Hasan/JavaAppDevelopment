/**
 * 
 */
package mapinterfacedemo;

import java.util.HashMap;
import java.util.Map;

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
		Map<Integer,String> objmap=new HashMap<Integer,String>();
		
		objmap.put(1,"Shamim");
		objmap.put(2,"Karim");
		objmap.put(3,"Shamim");
		
		for (int i=1;i<=objmap.size();i++)
		{
			System.out.println(objmap.get(i));
		}
		

	}

}
