/**
 * 
 */
package lcm;

/**
 * @author nhasa
 *
 */
public class LeastCommonMultiple {

	  // gcd() method, returns the GCD of a and b
	  static int gcd(int a, int b)
	  {
		    // stores minimum(a, b)
		        int i;
		        if (a < b)
		            i = a;
		        else
		            i = b;
		 
		        // take a loop iterating through smaller number to 1
		        for (int k=i;k>1;k--){
		 
		            // check if the current value of i divides both
		        // numbers with remainder 0 if yes, then i is
		        // the GCD of a and b
		            if (a%k==0&&b%k== 0)
		                return k;
		        }
		 
		        // if there are no common factors for a and b other
		    // than 1, then GCD of a and b is 1
		    return 1;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=30;
		// calling gcd() method over
	    System.out.println("LCM = " + (a*b)/gcd(a,b));
	}

}
