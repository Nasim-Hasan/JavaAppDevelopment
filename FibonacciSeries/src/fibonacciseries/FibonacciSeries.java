/**
 * 
 */
package fibonacciseries;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int firstterm=0;
         int secondterm=1;
         int numterm;
         int sumterm;
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Enter the Number of the Term:");
         
         numterm=sc.nextInt();
         
         System.out.println("Fibonacci Series:"+ " ");
         
         for(int i=0;i<numterm;i++)
         {
        	 sumterm=firstterm+secondterm;
        	 firstterm=secondterm;
        	 secondterm=sumterm;
        	 
        	 System.out.print(" "+sumterm);
        	 
         }
         
         sc.close();
	}

}
