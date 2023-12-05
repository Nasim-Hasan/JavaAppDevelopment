/**
 * 
 */
package interfacedemo;

/**
 * @author nhasa
 *
 */
interface Cat
{
	String name="Tom";
	void show();

}


class Animal implements Cat
{

	public void show()
	{
		System.out.println(name);
	}


}

public class InterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal objAnimal= new Animal();
        
        objAnimal.show();
		
	}

}
