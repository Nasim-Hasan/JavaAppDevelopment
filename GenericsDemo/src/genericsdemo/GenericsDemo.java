/**
 * 
 */
package genericsdemo;

/**
 * @author nhasa
 *
 */

class Test<T>
{
   T obj; //..Generic Type Object..//
   Test (T obj){this.obj=obj;} //..Generic Constructor..//
   public T getObject() {return this.obj;} //..Generic Method...//


}



public class GenericsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> objInt = new Test<Integer>(15);
		System.out.println("Integer:"+objInt.getObject());
		
		Test<String> objStr = new Test<String>("Nasim");
		System.out.println("String:"+objStr.getObject());

	}

}
