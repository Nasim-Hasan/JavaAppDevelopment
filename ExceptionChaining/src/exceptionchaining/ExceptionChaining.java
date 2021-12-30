/**
 * 
 */
package exceptionchaining;

/**
 * @author nhasa
 *
 */
class A{
	
	public void doA()
	{
		B b = new B();
		b.doB();
		System.out.println("doA");
		
	}
}

class B{
	
	public void doB()
	{
		C c = new C();
		c.doC();
		System.out.println("doB");
		
	}
}

class C{
	
	public void doC()
	{
		if(true)
			throw new NullPointerException();
		
		System.out.println("doC");
	}
}


public class ExceptionChaining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try
       {
    	   A a = new A();
    	   a.doA();
       }
       catch(Exception ex)
       {
    	   System.out.println("Error");
       }
	}

}
