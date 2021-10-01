/**
 * 
 */
package arrayofobjectsdemo;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class ArrayofObjectsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] objAccount = new Account[3];
		int number=0;
		String name="";
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		for (int i=0;i<3;i++)
		{
			objAccount[i]=new Account(); //..Instantiating Objects in an Array..//
			
			System.out.println("Input Name:");
			name=input.nextLine();
			objAccount[i].setName(name);  //..Setting Up the Name..//
			
			System.out.println("Input Number:");
			number=input1.nextInt();
			objAccount[i].setNumber(number); //..Setting Up the Number..//
			
		}
		
		for (int i=0;i<3;i++)
		{
			System.out.println("Object:"+i+" Name:"+objAccount[i].getName()+" Number:"
		                       +objAccount[i].getNumber());
			
		}
		
		
		
		input.close();  //..Closing the Object..//
		input1.close(); //..Closing the Object..//

	}

}
