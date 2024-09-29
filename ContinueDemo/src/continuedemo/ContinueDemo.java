/**
 * 
 */
package continuedemo;

/**
 * @author nhasa
 *
 */
public class ContinueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Continue Statement Demo for Single Loop");
		 for(int i=1;i<=10;i++){  
		        if(i==5){  
		            //using continue statement  
		            continue;//it will skip the statement  
		        }  
		        System.out.println(i);  
		    } 
		 System.out.println ("Continue Statement Demo for Double Loops");
	      for(int i=1;i<=3;i++){    
              //inner loop  
              for(int j=1;j<=3;j++){    
                  if(i==2&&j==2){    
                      //using continue statement inside inner loop  
                      continue;    
                  }    
                  System.out.println(i+" "+j);    
              }    
      } 

	}

}
