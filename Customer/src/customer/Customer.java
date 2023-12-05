/**
 * 
 */
package customer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nhasa
 *
 */
public class Customer {

	String name;
	int age;
	
	Customer(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1= new Customer("John",20); //..Object#1
		Customer c2= new Customer("John",20); //..Object#2
		
		HashSet<Customer> customerSet=new HashSet<>();
		customerSet.add(c1);
		customerSet.add(c2);
		System.out.println(customerSet.size());
		
		Object[] objarray=customerSet.toArray();
		
		for(int i=0;i<objarray.length;i++)
		{
			System.out.println(objarray[i]);
		}

	}

}
