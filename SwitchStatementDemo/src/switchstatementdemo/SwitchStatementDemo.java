/**
 * 
 */
package switchstatementdemo;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class SwitchStatementDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		int day;
		
		System.out.println("Input an Integer:");
		day=input.nextInt();
		
		day=day%7;
		
		switch(day)
		{
		   case 0:
			   System.out.println("Today's Day is Sunday");
			   break;
		   case 1:
			   System.out.println("Today's Day is Monday");  
			   break;
		   case 2:
			   System.out.println("Today's Day is Tuesday");  
			   break;
		   case 3:
			   System.out.println("Today's Day is Wednesday");
			   break;
		   case 4:
			   System.out.println("Today's Day is Thursday");  
			   break;
		   case 5:
			   System.out.println("Today's Day is Friday");  
			   break;
		   case 6:
			   System.out.println("Today's Day is Saturday");  
			   break;
		
		}
		
		input.close();
		

	}

}
