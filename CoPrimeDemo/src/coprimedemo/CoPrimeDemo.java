/**
 * 
 */
package coprimedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nasim Hasan
 *
 */
public class CoPrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int counter=0;
		List<Integer> coprime = new ArrayList<Integer>();
		
		System.out.println("Input the Number:");
		Scanner input = new Scanner (System.in);
		
		number=input.nextInt();
		
		for(int i=1;i<=number-1;i++)
		{
			if(number%i!=0||i==1)
			{
				coprime.add(i);
				counter++;
			}
		}
		
		System.out.println("Co-Primes of "+number+" are:");
		
		for(int j=0;j<coprime.size();j++)
		{
			System.out.print(coprime.get(j)+ " ");
		}
		
		System.out.print("\n");
		
		System.out.println("Total Number of Co-Primes of "+number+" are:"+counter);
		
		input.close();

	}

}
