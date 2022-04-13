/**
 * 
 */
package methdoverridingdemo;

/**
 * @author nhasa
 *
 */
class A
{
	
	 void show()
	 {
		 System.out.println("Show Method Inside Class A");
		 
	 }

}

class B extends A
{
	
	 void show()
	 {
		 System.out.println("Show Method Inside Class B");
		 
	 }

}


public class MethodOverridingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new A(); //Instance of Class A
		A objB = new B(); //Instance of Class B
		A objC= new B(); //Instance of Class B
		
		objA.show();
		objB.show();
		objC.show();

	}

}
