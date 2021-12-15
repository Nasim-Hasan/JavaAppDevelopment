/**
 * 
 */
package runnableinterface;

/**
 * @author nhasa
 *
 */
public class RunnableInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new Runnable()  //..Anonymous Interface...//
		{
			public void run()
			{
				System.out.println("Child Thread");
			}
			
		};
		
		Thread objThread = new Thread(r); //..Anonymous Class...//
		objThread.start();
		
		System.out.println("Main Thread");
		

	}

}
