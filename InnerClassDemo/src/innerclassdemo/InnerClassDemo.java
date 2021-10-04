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
			 System.out.println("The Inner Class Animal's Name is: Cow");
		 }
	    
	}
    
	public void show()
	{
		System.out.println("The Outer Class Animal's Name is: Buffalo");
		
	}


}


public class InnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal.Name obj = new Animal().new Name();
		Animal obj1 = new Animal();
		
		obj.display(); //..Inner Class Method..//
		obj1.show();  //...Outer Class Method..//
	}

}
