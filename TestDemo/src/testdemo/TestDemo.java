/**
 * 
 */
package testdemo;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String demo; String result=""; Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("Input a String:");
		 * 
		 * demo = input.nextLine();
		 * 
		 * char[] ch=demo.toCharArray();
		 * 
		 * for(int i=demo.length()-1;i>=0;i--) { result+=ch[i];
		 * 
		 * }
		 * 
		 * System.out.println("The Reverse is:"+result); input.close();
		 */
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
        double d= scan.nextDouble();
        String s= scan.nextLine();
        
        if(s.length()==0)
        {
        	s=scan.nextLine();
        }
        
        scan.close();
        
       // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
   
	}

}
