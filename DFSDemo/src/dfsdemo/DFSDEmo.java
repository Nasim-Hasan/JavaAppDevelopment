/**
 * 
 */
package dfsdemo;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class DFSDEmo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes;
		int index;
		
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the Number of Nodes:");
		
		nodes= sc.nextInt();
		
		int[] DFS= new int[nodes];
		int[][] adjacency= new int[nodes][nodes];
		int[] visited = new int[nodes];
		
		for(int i=0;i<nodes;i++)
		{
			DFS[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<nodes;i++)
		{
			visited[i]=0;
		}
		
		System.out.println("Input the Adjacency Matrix:");
		
		
		for(int i=0;i<nodes;i++)
		{
			for(int j=0;j<nodes;j++)
			{
				adjacency[i][j]=sc.nextInt();
				
			}
			
			
		}
		
		System.out.println("Input the Starting Index:");
		index=sc.nextInt();
		
		System.out.println("DFS Traverse:");
		
		for(int i=0;i<nodes;i++)
		{
		    if(visited[index]==0)
		    {
				System.out.print(DFS[index]);
				System.out.print(" ");
				visited[index]=1;
		    }
			
			for(int j=0;j<nodes;j++)
			{
			    if(adjacency[index][j]==1)
				{
		           index=j;
				   break;
				}
		
				
			}
			
		 }
		
		for(int i=0;i<nodes;i++)
		{
			if(visited[i]==0)
			{
				System.out.print(DFS[i]);
			    System.out.print(" ");
			
			}
			
		}
		

		sc.close();

	}

}
