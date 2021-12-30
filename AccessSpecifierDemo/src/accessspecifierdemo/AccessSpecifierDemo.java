/**
 * 
 */
package accessspecifierdemo;

/**
 * @author nhasa
 *
 */
public class AccessSpecifierDemo {

	private static int a=1;
	protected static int b=1;
	public static int c=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //..Local Variables Can not Have Access Modifiers..//
		/*
		 * private int a=1; protected int b=1; public int c=1;
		 */
		 
		System.out.println(a+b+c);
	}

}
