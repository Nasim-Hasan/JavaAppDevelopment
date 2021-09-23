/**
 * 
 */
package multidimensionalarraydemo;

/**
 * @author nhasa
 *
 */
public class MultiDimensionalArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] TwoDArray= {{1,2,3},{23,45,67}};
		int[][][] ThreeDArray= {{{1,2,3},{5,6,8}},{{42,76,89},{90,87,54}},
				               {{65,55,43},{34,50,44}}};
		
		System.out.println("Two Dimensional Array Demo:");
		
		for(int i=0;i<2;i++) //...Row..//
		{
			System.out.println("Row "+i+":");
			
			for(int j=0;j<3;j++) //...Column...//
			{
				System.out.print("Column "+j+":"+TwoDArray[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		System.out.println("\nThree Dimensional Array Demo:");
		
		for(int i=0;i<3;i++) //...Table..//
		{
			System.out.println("Table "+i+":");
			
			for(int j=0;j<2;j++) //..Row...//
			{
				System.out.println("Row "+j+":");
				
				for(int k=0;k<3;k++) //...Column...//
				{
					System.out.print("Column "+k+":"+ThreeDArray[i][j][k]+"\t");
					
				}
				
				System.out.println();
				
			}
			
			System.out.println();
			
		}
		

	}

}
