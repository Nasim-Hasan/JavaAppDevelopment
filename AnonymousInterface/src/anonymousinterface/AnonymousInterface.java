/**
 * 
 */
package anonymousinterface;

/**
 * @author nhasa
 *
 */

interface Alnf{
	
	String toString();
}

public class AnonymousInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Alnf() {  //..Anonymous Interface..//
			
			public String toString()
			{
				return "Success";
			}
		});

	}

}
