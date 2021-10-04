/**
 * 
 */
package abstractclassdemo;

/**
 * @author nhasa
 *
 */

abstract class ABC{

	public abstract void add(); //..Abstract Method..//
	
	public void sub() //..Concrete Method..//
	{
		int a=10,b=5;
		int result=a-b;
		
		System.out.println("The Subtraction is:"+result);
	}

}

class XYZ extends ABC{
	
	public void add() //..Implementation of the Abstract Method..//
	{
		int a=10,b=5;
		int result=a+b;
		
		System.out.println("The Addition is:"+result);
	}
}


public class AbstractClassDemo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC objABC=new XYZ();
		
		objABC.add();
		objABC.sub();

	}

}
