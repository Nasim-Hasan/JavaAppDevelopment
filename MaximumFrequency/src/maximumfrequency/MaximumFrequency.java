/**
 * 
 */
package maximumfrequency;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class MaximumFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the Number of Element:");
		Scanner sc = new Scanner (System.in);
		
		num=sc.nextInt();
		int[] arr = new int[num];
		int[] visited = new int[num];
		int count=1;
		int tmp,tmp1;
		int[] val=new int[num];
		int[] freq=new int[num];
		
		for(int i=0;i<num;i++)
		{
			visited[i]=0; //..Making Visited False...//
			
		}
		
		for(int i=0;i<num;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<num;i++)
		{
			if(visited[i]==0)
			{
				 for(int j=i+1;j<num;j++)
				 {
					  if(arr[i]==arr[j])
					  {
						   visited[j]=1;
						   count++;
						  
					  }
					 
				 }
				
				 val[i]=arr[i];
				 freq[i]=count;
				 count=1;
				
			}
			
		}
		
		//...Bubble Sorting for Getting the Highest Frequency..//
		
		for(int i=0;i<freq.length;i++)
		{
			for(int j=0;j<freq.length-i-1;j++)
			{
				if(freq[j]<freq[j+1])
				{
					tmp=freq[j];
					tmp1=val[j];
					freq[j]=freq[j+1];
					val[j]=val[j+1];
					freq[j+1]=tmp;
					val[j+1]=tmp1;
					
				}
				
				
				
			}
			
		}
		
	
		System.out.println("Value:"+val[0]+","+"Maximum Frequency:"+freq[0]);
			
		sc.close();

	}

}
