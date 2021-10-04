/**
 * 
 */
package exceptionhandlingdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author nhasa
 *
 */
public class CheckedExceptions {
	
	public void FileReader() throws IOException
	{
		try
		{
			 FileInputStream fis = null;
		      fis = new FileInputStream("myfile.txt"); 
		      int k; 

		      while(( k = fis.read() ) != -1) 
		      { 
			   System.out.print((char)k); 
		      } 
		      fis.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("The Specific File is not Present in the Specific Location.");
		}
	}

}
