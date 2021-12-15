/**
 * 
 */
package anonymousclassdemo;

/**
 * @author nhasa
 *
 */
interface Age
{
   int x=21;
   void getage();

}

public class AnonymousClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Age objAge= new Age()
		{
			public void getage()
			{
				System.out.println("The Age is:"+x);
			}
		};
        
		objAge.getage();
	}

}
