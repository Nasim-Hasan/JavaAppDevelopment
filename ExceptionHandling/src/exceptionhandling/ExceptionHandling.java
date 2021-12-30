/**
 * 
 */
package exceptionhandling;

/**
 * @author nhasa
 *
 */
public class ExceptionHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   
    	   System.out.println("Hello"+" "+1/0);
       }
       catch(ArithmeticException ex)
       {
    	   System.out.println("World");
       }
       
	}

}
