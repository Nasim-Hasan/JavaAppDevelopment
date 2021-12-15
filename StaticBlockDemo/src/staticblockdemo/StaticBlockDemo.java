/**
 * 
 */
package staticblockdemo;

/**
 * @author nhasa
 *
 */
public class StaticBlockDemo {

	/**
	 * @param args
	 */
    static
    { 
        System.out.printf("%d", 1); 
    } 
    static
    { 
        System.out.printf("%d", 2); 
    } 
    static
    { 
        System.out.printf("%d", 3); 
    } 
    private static int myMethod() 
    { 
        return 4; 
    } 
    private int function() 
    { 
        return 5; 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%d", (new StaticBlockDemo()).function() + myMethod()); 

	}

}
