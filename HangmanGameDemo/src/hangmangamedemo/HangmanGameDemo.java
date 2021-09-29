/**
 * 
 */
package hangmangamedemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class HangmanGameDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> WordList=WordContainer();
		int WordNumber=WordList.size();
		Random objrandom = new Random();
		int random=objrandom.nextInt(WordNumber);
		String SelectedWord=WordList.get(random);
		int count=0;
		Scanner input = new Scanner(System.in);
		String GuessWord="";
		int start=0;
		int determiner=0;
		
		while (count!=3)
		{
			System.out.println("Input a Letter (A-Z/a-z):");
			
			for(int i=0;i<SelectedWord.length()-start;i++)
			{
				if(SelectedWord.length()==SelectedWord.length()-start)
				{
					System.out.print("-"+"\t");
					
				}
				else
				{
					
					System.out.print("-"+"\t");
				}
				
				
				
			}
			
			String str=input.nextLine();
			char[] ch=str.toCharArray(); 
			
		     if(SelectedWord.charAt(start)==ch[0])
		     {
		    	 System.out.println("Your Guess is Correct");
		    	 
		    	 GuessWord=GuessWord+String.valueOf(ch[0]);
		    	 start++;
		    	 
		    	 System.out.println(GuessWord);
		    	 
		    	 if(GuessWord.equalsIgnoreCase(SelectedWord))
		    	 {
		    		 determiner=1;
		    		 break;
		    		 
		    	 }
		    	 
		     }
		     
		     else
		     {
		    	 if(count<2)
		    	 {
		    	   System.out.println("Your Guess is Incorrect. Try Again:");
		    	 }
		    	
		    	 count++;
		    	 
		     }
			
			
		}
		
		if(determiner==1)
		{
			System.out.println("The Word is:"+GuessWord);
			
			System.out.println("You Won.");
		}
		else
		{
			System.out.println("Your Guess is Incorrect.");
			System.out.println("You Lost.");
		}
		
		input.close(); //..Closing the Scanner Object..//

	}
	
	public static List<String> WordContainer()
	{
		List<String> TempWordList = new ArrayList<String>();
		
		try 
		{
			 //...Reading from the File...//
		      File myObjReader = new File("WordsList.txt");
		      Scanner myReader = new Scanner(myObjReader);
		      while (myReader.hasNextLine()) 
		      {
		        String data = myReader.nextLine();
		        TempWordList.add(data);
		      }
		      myReader.close(); //..Closing the Scanner Object..//
		      
		}
		catch (Exception e)
		{
			System.out.println("An error occurred:"+e.toString());
		    e.printStackTrace();
			
		}
		
		return TempWordList;
	}

}
