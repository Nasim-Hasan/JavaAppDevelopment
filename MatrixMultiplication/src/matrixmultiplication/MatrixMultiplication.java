/**
 * 
 */
package matrixmultiplication;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class MatrixMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int row;
      int col;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Input the Number of Row:");
      row=sc.nextInt();
      
      System.out.println("Input the Number of Column:");
      col=sc.nextInt();
      
      int[][] A=new int[row][col];
      int[][] B = new int[row][col];
      int[][] C=new int[row][col];
      
      System.out.println("Input the Values for Matrix A:");
      
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<col;j++)
    	  {
    		  A[i][j]=sc.nextInt();
    		  
    	  }
    	  
      }
      
     System.out.println("Input the Values for Matrix B:");
      
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<col;j++)
    	  {
    		  B[i][j]=sc.nextInt();
    		  
    	  }
    	  
      }
      
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<col;j++)
    	  {
    		  C[i][j]=0;
    		  
    	  }
    	  
      }
      
      //...2D Matrix Multiplication...//
      
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<col;j++)
    	  {
    		  
    		  for(int k=0;k<row;k++)
    		  {
    			   C[i][j]=C[i][j]+A[i][k]*B[k][j];
    			  
    		  }
    		  
    		  
    	  }
    	  
    	  
      }
      
      System.out.println("Matrix Multiplication Result (C):");
      
      System.out.print("\n");
      
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<col;j++)
    	  {
    		  System.out.print(C[i][j]+" ");
    		  
    	  }
    	  
    	  System.out.print("\n");
    	  
      }
      
      
      sc.close();
      
	}

}
