/**
 * 
 */
package circletest;

/**
 * @author nhasa
 *
 */

class Shape{
	
	String name="No Name";
	
	Shape(){} //..Default Constructor..//
	
	Shape(String nm)
	{
		name=nm;
	}
	
}

class Circle extends Shape{
	String Cid="000";
	
	Circle(String id)
	{
		Cid=id;
	}
	
}

public class CircleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle("Text");
		System.out.println(obj.Cid);

	}

}
