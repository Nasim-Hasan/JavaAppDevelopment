/**
 * 
 */
package linearsearch;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int searchkey;
		int num;
		int count=0;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Number of Elements:");
		
		num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the Search Key:");
		
		searchkey=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			if(arr[i]==searchkey)
				
			{
				count++;
				
			}
			
		
		}
		
		if(count==0)
		{
		
			System.out.println("Search Key:"+searchkey+" is not in the list");
		}
		else
		{
			System.out.println("Search Key:"+searchkey+","+"Frequency:"+count);
			
		}
		
		sc.close();
		

	}

}
