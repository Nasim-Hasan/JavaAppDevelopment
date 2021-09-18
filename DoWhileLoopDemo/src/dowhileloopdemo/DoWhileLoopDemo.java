/**
 * 
 */
package dowhileloopdemo;

/**
 * @author nhasa
 *
 */
public class DoWhileLoopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		
		do
		{
			num++;
			
			if(num%2==0)
			{
				System.out.println("Number is Even:"+num);
			}
			else
			{
				System.out.println("Number is Odd:"+num);
			}
			
		 }while(num<10);

	}

}
