/**
 * 
 */
package transientdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author nhasa
 *
 */
public class TransientDemo {

	public static class  Member implements Serializable{
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		transient int id; // This will not serialized.
        String name;
        // constructor
        public Member(int i, String k) {
            this.id = i;
            this.name = k;
        }
    }
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		 Member temp =new Member( 2, "Clausia");//creating object
	     
		
		try {//Writing temp object into file
			FileOutputStream fwrite;
			fwrite = new FileOutputStream("member.txt");
		    ObjectOutputStream fout=new ObjectOutputStream(fwrite);
		    fout.writeObject(temp);
		    fout.flush();
		    fout.close();
		    fwrite.close();
		    System.out.println("Data successfully saved in a file");
		    
		    //Retrieving the data from file.
	        ObjectInputStream fin=new ObjectInputStream(new FileInputStream("member.txt"));
	        Member membr=(Member)fin.readObject();
	        System.out.println(membr.id+" "+membr.name+" ");
	        fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
      

	}

}
