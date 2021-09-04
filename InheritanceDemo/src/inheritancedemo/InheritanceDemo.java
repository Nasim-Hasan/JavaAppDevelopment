/**
 * 
 */
package inheritancedemo;

/**
 * @author nhasa
 *
 */

class A
{
	private int a=10,b=20,result=0;
	
	  private void add()
	  {
		  result=a+b;
		  
	  }
	
	  public void show()
	  {
		  add();
		  System.out.println("Result:"+result);
	  }
	  
	  protected void demo()
	  {
		  result=b-a;
		  System.out.println("Result:"+result);
	  }



}

class B extends A
{
    private void message()	
    {
    	System.out.println("Using Object of Class B");
    	
    	
    }
    
    public void service()
    {
    	message();
    }


}




public class InheritanceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B objB=new B();
		
		objB.service();
		objB.show();
		objB.demo();

	}

}
