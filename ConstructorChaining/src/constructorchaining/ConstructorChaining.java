/**
 * 
 */
package constructorchaining;

/**
 * @author nhasa
 *
 */
class Man
{
   Man()
   {
	   System.out.print("Man");
   }
}

class Father extends Man
{
	
   Father (String type)
   {
	   System.out.print(type);
   }

}

class Son extends Father
{
	
   Son()
   {
	   super("Father");
	   new Father("Son");
   }

}


public class ConstructorChaining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Son();

	}

}
