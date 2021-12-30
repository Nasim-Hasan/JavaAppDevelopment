/**
 * 
 */
package stringlengthexception;

/**
 * @author nhasa
 *
 */
public class StringLengthException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null; //..Null Pointer Exception Will be Thrown...//
		
		if(str.length()==0)
		{
			System.out.println("1");
		}
		else if(str==null)
		{
			System.out.println("2");
		}
		else 
		{
			System.out.println("3");
			
		}

	}

}
