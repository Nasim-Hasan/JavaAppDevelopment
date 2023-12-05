/**
 * 
 */
package factorialdemo;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class FactorialDemo {

	/**
	 * @param args
	 */
	
	static int factorial(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number:");
        num=sc.nextInt();
        
        System.out.println("Factorial:"+factorial(num));
        
        sc.close();
      }
}
