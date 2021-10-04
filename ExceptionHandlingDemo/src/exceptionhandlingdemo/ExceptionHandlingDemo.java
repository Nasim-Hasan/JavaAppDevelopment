/**
 * 
 */
package exceptionhandlingdemo;

import java.io.IOException;

/**
 * @author nhasa
 *
 */
public class ExceptionHandlingDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CheckedExceptions objCheckedExceptions = new CheckedExceptions();
		UncheckedExceptions objUncheckedExceptions = new UncheckedExceptions();
		
		objCheckedExceptions.FileReader();
		objUncheckedExceptions.ArrayConstruction();
		objUncheckedExceptions.ArrayArgument();

	}

}
