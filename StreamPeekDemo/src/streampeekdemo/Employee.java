/**
 * 
 */
package streampeekdemo;

/**
 * @author nhasa
 *
 */
public class Employee {
	
	private int serial;
	private String name;
	private double salary;
	
	Employee(int serial,String name,double salary)
	{
		this.serial=serial;
		this.name=name;
		this.salary=salary;
	}
	
	public void salaryIncrement(double increment)
	{
		this.salary=this.salary+increment;
	}
	
	public void show()
	{
		System.out.println("Serial:"+serial+" "+"Name:"+name+" "+"Salary:"+salary);
	}

}
