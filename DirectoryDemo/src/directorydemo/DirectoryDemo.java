/**
 * 
 */
package directorydemo;

import java.io.File;
import java.io.IOException;

/**
 * @author nhasa
 *
 */
public class DirectoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("dir");
		dir.mkdir();
		File f1= new File(dir,"f1.txt");
		
		try {
			f1.createNewFile();
			System.out.println("A Directory with a Text File Has Been Created");
		}
		catch(IOException e)
		{
			System.out.println("Exception:"+e.toString());
		}
		

	}

}
