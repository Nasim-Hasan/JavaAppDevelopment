/**
 * 
 */
package completablefuturedemo1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author nhasa
 *
 */
public class CompletableFutureDemo1 {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		        return "Rajeev";
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		   
		}).thenApply(name -> {
		    return "Hello " + name;
		}).thenApply(greeting -> {
		    return greeting + ", Welcome to Nasim Hasan's Blog";
		});
		

       System.out.println(welcomeText.get()); 

	}

}
