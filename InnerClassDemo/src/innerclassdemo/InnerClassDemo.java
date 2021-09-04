/**
 * 
 */
package innerclassdemo;

/**
 * @author nhasa
 *
 */

class Animal
{
	
	class Name
	{
		 public void display()
		 {
			 System.out.println("The Animal's Name is: Cow");
		 }
	    
	}



}


public class InnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal.Name obj = new Animal().new Name();
		
		obj.display();
	}

}
