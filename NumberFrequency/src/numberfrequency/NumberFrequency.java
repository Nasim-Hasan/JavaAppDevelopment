/**
 * 
 */
package numberfrequency;

import java.util.*;

/**
 * @author nhasa
 *
 */
public class NumberFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        System.out.println("Please Enter the Number of Element:");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        int[] arr = new int[num];
        int[] visited = new int[num];
        int count=1;
       
        for(int i=0;i<num;i++)
        {
        	visited[i]=0;  //...Making Visited False...//
        }
        
        for(int i=0;i<num;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<num;i++)
        {
        	if(visited[i]==0)
        	{
        		for(int k=i+1;k<num;k++)
        		{
        			 if(arr[i]==arr[k])
        			 {
        				 count++;
        				 visited[k]=1;
        				 
        			 }
        			
        		}
        		
        		
        		System.out.println("Value:"+arr[i]+","+"Frequency:"+count);
        		count=1;
        		
        	}
        	
        	
        }
        
        sc.close();
       
	}

}
