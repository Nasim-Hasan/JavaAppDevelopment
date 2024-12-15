/**
 * 
 */
package finaldemo;

/**
 * @author nhasa
 *
 */
public class FinalDemo {
	 //Blank final variable
	  final int id;
	  //parameterized constructor
	  FinalDemo(int idNum) {
	    //Blank final variable must be initialized in constructor
	    id = idNum;
	  }
	  void getDetails() {
	    System.out.println("Constant Value: " + id);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo objfinaldemo = new FinalDemo(10);
		objfinaldemo.getDetails();
		int id = objfinaldemo.id +20;
		System.out.println("Instance Value: " + id);
		
	 }

}
