/**
 * 
 */
package compilationfail;

/**
 * @author nhasa
 *
 */

class Parent{
	
	public Integer get()
	{
		return 1;
	}
}


class Child extends Parent{
	
//	public Double get() //...Compile Will Fail in Here..//
//	{
//		return 2.0;
//	}
	
	public Integer get() 
	{
		return 2;
	}
}


public class CompilationFail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(new Child().get());
	}

}
