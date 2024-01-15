/**
 * 
 */
package finalStaticDemo;

/**
 * @author nhasa
 *
 */
public class FinalStaticDemo {

	public final static String company = "GFG";
	public final String regNo;
	public int id = 10;
	public FinalStaticDemo()
	{   
		regNo="AX324";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalStaticDemo objFinalStaticDemo = new FinalStaticDemo();
		//...Final Variables Can''t be Assigned Values
		/*objFinalStaticDemo.company = "KFC";
		objFinalStaticDemo.regNo="BD235";*/
		objFinalStaticDemo.id = 20;
		System.out.println("Company Name:"+objFinalStaticDemo.company);
		System.out.println("Registration Number:"+objFinalStaticDemo.regNo);
		System.out.println("Company IF:"+objFinalStaticDemo.id);

	}
}
