/**
 * 
 */
package whileloopdemo;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class WhileLoopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
		System.out.println("Guess a Number from 1 to 10:");
		
		Scanner input = new Scanner (System.in);
		
		num= input.nextInt();
		
		while(num!=5)
		{
			System.out.println("Your Guess is Wrong. Try Again:");
			num= input.nextInt();
			
		}
				
		System.out.println("Your Guess is Right.");
		
		input.close();

	}

}
