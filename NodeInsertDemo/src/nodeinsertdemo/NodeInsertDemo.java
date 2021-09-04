/**
 * 
 */
package nodeinsertdemo;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
class Node
{
  int data;
  Node right;
  Node left;
  
  Node(int data)
  {
	  this.data=data;
	  this.right=null;
	  this.left=null;
	  
  }



}


public class NodeInsertDemo {

	/**
	 * @param args
	 */

	
	public static Node insert(Node root,int data) {
	    
	    if(root==null)
        {
            root=new Node(data);
            return root;
            
        }
        else
        {   Node Current=root, Parent=null;
            Parent=Current;
            
            if(data>Current.data)
            {
               Current=Current.right;
              
               if(Current==null)
               {
                  Parent.right=new Node(data);
                   
               }
               
               return Parent.right;
                
            }
            else 
            {
               Current=Current.left;
               
               if(Current==null)
               {
                  Parent.left=new Node(data);
               }
                 
                return Parent.left;
            }
         }
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();

	}

}
