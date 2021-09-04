/**
 * 
 */
package methodoverloadingdemo;

/**
 * @author nhasa
 *
 */

class Animal
{
	
	void addition(int a, int b)
	{
		int result=a+b;
		System.out.println("Result (2 Arguments):"+result);
	
	}
	
	void addition(int a, int b, int result)
	{
		
	     result=a+b;
	     System.out.println("Result (3 Arguments):"+result);
	     
	}


}


public class MethodOverloadingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal objAnimal=new Animal();
		
		objAnimal.addition(10,20);
		objAnimal.addition(30,40,0);

	}

}
