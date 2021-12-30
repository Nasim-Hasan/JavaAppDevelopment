/**
 * 
 */
package chainingconstructor;

/**
 * @author nhasa
 *
 */

class A {
	
	public A()
	{
		System.out.print("A");
	}
}

class B extends A{
	
	public B()
	{
		System.out.print("B");
	}
}

class C extends B
{
	public C()
	{
		System.out.print("C");
	}	

}


public class ChainingConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C objc = new C(); //..Constructor Chaining..//

	}

}
