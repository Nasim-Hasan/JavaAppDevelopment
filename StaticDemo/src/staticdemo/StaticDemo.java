/**
 * 
 */
package staticdemo;

/**
 * @author nhasa
 *
 */
public class StaticDemo {

	// Static Variable
	static int j = n();
	 
	// Static Block
	static {
	System.out.println("Inside the static block");
	}
	 
	// Static Method
	static int n() {
	System.out.println("from n ");
	return 20;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of j : "+j);
		System.out.println("Inside main method");

	}

}
