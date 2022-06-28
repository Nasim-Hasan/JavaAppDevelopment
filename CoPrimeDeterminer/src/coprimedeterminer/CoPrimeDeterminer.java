/**
 * 
 */
package coprimedeterminer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nasim Hasan
 *
 */
public class CoPrimeDeterminer {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,number1;
		int determiner=0;
		List<Integer> coprime = new ArrayList<Integer>();
		List<Integer> coprime1 = new ArrayList<Integer>();
		
		System.out.println("Input the Number1:");
		Scanner input = new Scanner (System.in);
		
		number=input.nextInt();
		
		System.out.println("Input the Number2:");
		
		number1=input.nextInt();
		
		for(int i=1;i<=number-1;i++)
		{
			if(number%i==0||i==1)
			{
				coprime.add(i);
				
			}
		}
		
		for(int i=1;i<=number1-1;i++)
		{
			if(number1%i==0||i==1)
			{
				coprime1.add(i);
				
			}
		}
		
		for(int i=0;i<coprime.size();i++)
		{
			for(int j=0;j<coprime1.size();j++)
			{
				 if(coprime.get(i)!=1)
				 {
					 if(coprime.get(i)==coprime1.get(j))
					 {
						 determiner++;
					 }
					 
				 }
			}
			
		}
		
		if(determiner!=0)
		{
			System.out.println("The Numbers:"+number+" And "+number1+" are not Co-Prime");
		}
		else
		{
			System.out.println("The Numbers:"+number+" And "+number1+" are Co-Prime");
			
		}
		
		input.close();

	}

}
