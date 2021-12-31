/**
 * 
 */
package junittestrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junittestrunnertestcases.*;

/**
 * @author nhasa
 *
 */
public class JUnitTestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(TestJUnitTestCases.class);  
		
		for (Failure fail : result.getFailures()) {  
	         System.out.println(fail.toString());  
	      }  
	          
	      System.out.println(result.wasSuccessful());  
		

	}

}
