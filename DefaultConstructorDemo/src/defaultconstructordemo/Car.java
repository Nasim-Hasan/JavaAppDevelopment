/**
 * 
 */
package defaultconstructordemo;

/**
 * @author nhasa
 *
 */
public class Car {
	
	private String CarName="";
	
	Car(String CarName) //..Constructor...//
	{
		this.CarName=CarName;
		
	}
	
	public void Display()
	{
		System.out.println("Car Name:"+this.CarName);
	}

}
