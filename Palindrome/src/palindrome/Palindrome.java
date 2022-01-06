/**
 * 
 */
package palindrome;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="", reverseword="";
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input a Word:");
		word=input.nextLine();
		
		char[] ch = word.toCharArray();
		
		for(int i=word.length()-1;i>=0;i--)
		{
			 reverseword=reverseword+String.valueOf(ch[i]);
		}
		
		if(reverseword.equalsIgnoreCase(word))
		{
			System.out.println("The Word:"+word+" is Palindrome");
		}
		else
		{
			System.out.println("The Word:"+word+" is not Palindrome");
		}
		
		input.close();

	}

}
