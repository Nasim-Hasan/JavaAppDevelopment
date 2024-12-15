/**
 * 
 */
package finallyblockdemo;

/**
 * 
 */
public class FinallyBlockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
            System.out.println("inside try block"); 
  
            // Throw an Arithmetic exception 
            System.out.println(34 / 0); 
        } 
  
        // catch an Arithmetic exception 
        catch (ArithmeticException e) { 
  
            System.out.println( 
                "catch : exception handled."); 
        } 
  
        // Always execute 
        finally {   
            
          System.out.println("finally : i will execute always."); 
        }

	}

}
