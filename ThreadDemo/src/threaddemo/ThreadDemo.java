/**
 * 
 */
package threaddemo;

/**
 * @author nhasa
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread objThread = new Thread()
	    {
			public void run()
			{
				System.out.println("Child Thread");
			}
			
	    };
	    
	    objThread.start();
	    
	    System.out.println("Main Thread");
	    

	}

}
