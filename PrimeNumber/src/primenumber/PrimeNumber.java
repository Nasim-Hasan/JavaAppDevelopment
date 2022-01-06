/**
 * 
 */
package primenumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lowerbound=0, upperbound=0, num=0,count=0;
		List<Integer> primelst = new ArrayList<Integer>();
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input the Lower Bound:");
		lowerbound=input.nextInt();
		
		System.out.println("Input the Upper Bound:");
		upperbound=input.nextInt();
		
		System.out.println("Input the Number:");
		num=input.nextInt();
		
		for(int i=lowerbound;i<=upperbound;i++)
		{
			if(i==lowerbound || i==num)
			{
				if(num%i==0)
				{
					count++;
					
				}
			}
			else
			{
				if(num%i==0)
				{
					count++;
				}
			}
			
		}
		
		if(count==2)
		{
			System.out.println("The Number:"+num+" is Prime");
			
		}
		else
		{
			System.out.println("The Number:"+num+" is not Prime");
		}
		
		count=0;
		
		for(int i=lowerbound;i<=upperbound;i++)
		{
			
			for(int k=lowerbound;k<=upperbound;k++)
			{
				   if(i%k==0)
				   {
					   count++;
				   }
			}
			
			  if(count==2)
			  {
				  primelst.add(i);
			  }
			  
			  count=0;
		}
		
		
		System.out.println("Other Prime Numbers in That Range Are:");
		
		for(int i=0;i<primelst.size();i++)
		{
			System.out.print(primelst.get(i) + " ");
		}
		
		
		
        input.close();
	}

}
