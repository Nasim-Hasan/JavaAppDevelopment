/**
 * 
 */
package staticclassdemo;

/**
 * @author nhasa
 *
 */
public class StaticClassDemo {
	private static String str= "Edureka";
			//Static class
			static class MyNestedClass{
			//non-static method
			public void disp(){
			System.out.println(str);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClassDemo.MyNestedClass obj = new StaticClassDemo.MyNestedClass();
		obj.disp();
	}

}
