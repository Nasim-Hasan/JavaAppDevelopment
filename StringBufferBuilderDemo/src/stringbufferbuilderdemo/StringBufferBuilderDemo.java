/**
 * 
 */
package stringbufferbuilderdemo;

/**
 * @author nhasa
 *
 */
public class StringBufferBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Buffer Demo:");
		 // Creating a new StringBuffer
        StringBuffer str= new StringBuffer("Hello");
        str.append(" World!");
        System.out.println(str);
        System.out.println("String Builder Demo:");
     // Creating a new StringBuilder
        StringBuilder str1= new StringBuilder("Nasim");
        str1.append(" Hasan");
        System.out.print(str1);

	}

}
