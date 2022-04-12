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
	
	Car(){} //..Default Constructor..//
	
	Car(String CarName) //..Parameterized Constructor...//
	{
		this.CarName=CarName;
		
	}
	
	public void Display()
	{
		System.out.println("Car Name:"+this.CarName);
	}

}
