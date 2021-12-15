/**
 * 
 */
package constructorchainingdemo;

/**
 * @author nhasa
 *
 */
class Demo
{
	
   Demo() //..Default Constructor...//
   {
	   this("Calling");
	   System.out.println("Base Default Constructor is Called");
   }

   Demo(String str) //..Parameterized Constructor...//
   {
	   System.out.println("Base Parameterized Constructor is Called");
	   
   }

}

class Prototype extends Demo
{
	Prototype() //..Default Constructor...//
	{
		this("Calling");
		System.out.println("Derived Default Constructor is Called");
	}

    Prototype(String str)  //..Parameterized Constructor...//
    {
    	super(); 
    	System.out.println("Derived Parameterized Constructor is Called");
    }

}


public class ConstructorChainingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Prototype objPrototype = new Prototype();
	}

}
