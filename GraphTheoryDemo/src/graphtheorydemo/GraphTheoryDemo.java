/**
 * 
 */
package graphtheorydemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class GraphTheoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberofNodes=0,random=0;
		Scanner input = new Scanner (System.in);
		Random objrandom = new Random();
		
		System.out.println("Input the Number of Nodes:");
		numberofNodes=input.nextInt();
		
		int[][] adjacencyMatrix=new int[numberofNodes][numberofNodes];
		
		Map<Integer,String> node = new HashMap<Integer,String>();
		String[] Color = new String[] {"R","G","B"};
		
		System.out.println("Input the Value (0/1) of the Adjacency Matrix:");
		
		for(int i=0;i<numberofNodes;i++)
		{
			for(int j=0;j<numberofNodes;j++)
			{
				adjacencyMatrix[i][j]=input.nextInt();
				
			}
			
		}
		
		System.out.println("The Adjacency Matrix is:");
		
		for(int i=0;i<numberofNodes;i++)
		{
			for(int j=0;j<numberofNodes;j++)
			{
				
				System.out.print(adjacencyMatrix[i][j]+"\t");
				
			}
			
			System.out.println();
			
		}
		
		for(int i=0;i<numberofNodes;i++)
		{
			if(i==0)
			{
				random=objrandom.nextInt(Color.length);
				node.put(i,Color[random]);
				
			}
			
			for(int j=0;j<numberofNodes;j++)
			{
				if(adjacencyMatrix[i][j]==1)
				{
					if(!node.containsKey(j))
					{
						if(!node.containsValue(Color[random]))
						{
							node.put(j,Color[random]);
						}
						else
						{
							random++;
							if(random>=Color.length)
							{
								random=objrandom.nextInt(Color.length);
								
							}
							
							node.put(j,Color[random]);
							
						}
					}
					
				}
				
				
			}
			
			
			
		 }
		
		System.out.println("The Graph Will Be:");
		
		for(int i=1;i<=node.size();i++)
		{
			System.out.println("Node:"+(i-1)+" Color:"+node.get(i));
			
		}
		
		input.close();

	}

}
