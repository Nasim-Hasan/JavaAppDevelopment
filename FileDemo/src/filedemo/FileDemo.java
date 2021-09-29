/**
 * 
 */
package filedemo;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  try {
		      File myObj = new File("Sample.txt");
		      
		      if (myObj.createNewFile()) //...Creating a File..//
		      {
		        System.out.println("File Created: " + myObj.getName());
		        FileWriter myWriter = new FileWriter("Sample.txt");
		        myWriter.write("My Name is Nasim Hasan."); //...Writing to that File...//
		        myWriter.close(); //..Closing the Writing Object..//
		        
		      } 
		      else 
		      {
		        System.out.println("File Already Exists.");
		        FileWriter myWriter = new FileWriter("Sample.txt");
		        myWriter.append("I Live in Dhaka."); //...Appending to that File...//
		        myWriter.close(); //..Closing the Appending Object..//
		      }
		      
		     //...Reading from the File...//
		     Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) 
		      {
		        String data = myReader.nextLine();
		        System.out.println(data); 
		      }
		      myReader.close(); //..Closing the Scanner Object..//
		      
		    } 
		    catch (Exception e) 
		    {
		      System.out.println("An error occurred:"+e.toString());
		      e.printStackTrace();
		    }

	}

}
