/**
 * 
 */
package anonymousinnerclassdemo;

/**
 * @author nhasa
 *
 */
public class AnonymousInnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread objThread = new Thread (new Runnable()
				{
				     public void run()
				     {
				    	 System.out.println("Child Thread");
				    	 
				     }
				});
		
		objThread.start();
		
		System.out.println("Main Thread");

	}

}
