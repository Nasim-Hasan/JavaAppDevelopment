/**
 * 
 */
package codecoveragedemo;

/**
 * @author nhasa
 *
 */
public class CodeCoverageDemo {

	/**
	 * @param args
	 */
	
	public int Comparator(int a, int b)
	{
		if(a>b)
		{
			return (a-b);
			
		}
		else if(b>a)
		{
			return (b-a);
		}
		else
		{
			return 0;
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodeCoverageDemo obj = new CodeCoverageDemo();
		System.out.println(obj.Comparator(3,4));
          
	}

}
