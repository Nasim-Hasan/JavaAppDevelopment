/**
 * 
 */
package castexceptiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author nhasa
 *
 */
public class CastExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst = new ArrayList();
		lst.add(new Integer(12).intValue());
		lst.add(new String("foo"));
		lst.add(new Boolean(true));
		
		Arrays.sort(lst.toArray());
		for(int i=0;i<lst.size();i++)
		{
			System.out.print(lst.get(i).toString());
		}
		
	}

}
