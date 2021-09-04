/**
 * 
 */
package leftrotatedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class LeftRotateDemo {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tmp;
		List<Integer> arr = new ArrayList<Integer>();
		int d,num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Input Number of Elements for the List:");
		
		num=sc.nextInt();
		
		int[] arraynum=new int[num];
		int[] dummy= new int[num];
		
		
		System.out.println("Input Numbers in the List:");
		
		for(int i=0;i<num;i++)
		{
			arr.add(sc.nextInt());
			arraynum[i]=arr.get(i);
			
		}
		
		System.out.println("Input the Shift Number:");
		
		d=sc.nextInt();
		
		for(int i=0;i<arr.size();i++)
	    {
	        int shift=i+d;
	        
	        if(shift>=arr.size())
	        {
	        	shift=shift%arr.size();
	        }
            
	        tmp=arraynum[i];
            dummy[shift]=tmp;
       
	     }
		
		System.out.println("After the Rotation:");
		
		for(int i=0;i<arraynum.length;i++)
		{
			System.out.print(dummy[i]);
			System.out.print(" ");
			
		}
		
	    
		sc.close();
	}


}
	
