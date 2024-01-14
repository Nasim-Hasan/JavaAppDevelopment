/**
 * 
 */
package compilationfaildemo;

/**
 * @author nhasa
 *
 */

class A
{
  A(int i)
  {
	  System.out.println(i);
	  
  }

}

class B extends A
{
	B()
	{
		super(6);
		//this();  //this() & super() can not be used in the same function
	}


}

public class CompilationFailDemo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B b = new B();
	}

}
