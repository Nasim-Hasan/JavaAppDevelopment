/**
 * 
 */
package twodicesrollingdemo;

import java.util.Random;

/**
 * @author nhasa
 *
 */
public class TwoDicesRollingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numoftries=0,dice1=0,dice2=0;
		Random objrandom = new Random();
		
		do {
			  dice1=objrandom.nextInt(7)+1;
			  System.out.println("Dice1's Score:"+dice1);
			  
			  dice2=objrandom.nextInt(7)+1;
			  System.out.println("Dice2's Score:"+dice2);
			  
			  numoftries++;
			  
		    }while(dice1!=dice2);
		
		System.out.println("Number of Tries:"+numoftries);

	}

}
