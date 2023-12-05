/**
 * 
 */
package voidreturndemo;

/**
 * @author nhasa
 *
 */
public class VoidReturnDemo {

	/**
	 * @param args
	 */
	
	public static void doCompare(int num)
	{
		if(num>10)
		{
			System.out.print("Number is Greater Than 10");
			return;
		}
		else
		{
			num++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doCompare(89);
		doCompare(8);
	}

}
