/**
 * 
 */
package forloopdemo;

/**
 * @author nhasa
 *
 */
public class ForLoopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//....Square Shape....//
		
		System.out.println("Square Shape:");
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+"\t");
			}
			
			System.out.print("\n");
		}
		
		//...Upper Triangular Shape...//
		
		System.out.println("Upper Triangular Shape:");
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i*j+"\t");
			}
			
			System.out.print("\n");
		}
		
	    //...Lower Triangular Shape...//
		
		System.out.println("Lower Triangular Shape:");
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=11-i;j++)
			{
				System.out.print(i*j+"\t");
			}
			
			System.out.print("\n");
		}
		

	}

}
