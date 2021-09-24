/**
 * 
 */
package foreachdemo;

/**
 * @author nhasa
 *
 */
public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,25,78};
		int sum=0;
		
		for(int element:array)  //..For Each Loop....//
		{
			sum=sum+element;
			
		}
		
		System.out.println("Sum:"+sum);

	}

}
