/**
 * 
 */
package exceptionhandlingdemo;

/**
 * @author nhasa
 *
 */
public class UncheckedExceptions {
	
	public void ArrayConstruction()
	{
		try
		{
			int[] array= {1,2,3};
			System.out.println(array[7]);
		
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array's Index is out of Bound.");
		}
		
	}
	
	public void ArrayArgument()
	{
		try
		{
			int[] array= {1,2,3};
			System.out.println(array[-1]);
			
		}
		catch(Exception ex)
		{
			System.out.println("Array's Index is Illegal.");
		}
	}

}
