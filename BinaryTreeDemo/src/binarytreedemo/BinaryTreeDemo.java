/**
 * 
 */
package binarytreedemo;

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


public class BinaryTreeDemo {

	/**
	 * @param args
	 */
	Node root;
	
	BinaryTreeDemo()
	{
		root=null;
	}
	
	public void insert(int data)
	{
		if(root==null)
		{
			root=new Node(data);
		}
		else
		{
			Node cur=root,parent=null;
			
		  while(true)
		  {
			  parent=cur;
			   
			   if(data>root.data)
			   {
				   cur=cur.right;
				   if(cur==null)
				   {
					   parent.right=new Node(data);
					   return;
				   }
				   
			   }
			   else
			   {
				   cur=cur.left;
				   if(cur==null)
				   {
					   parent.left=new Node(data);
					   return;
				   }
				   
				   
			   }
			   
			   
		   }
		}
	}
		

	public void inordertraverse(Node node)
	{
		if(node==null)
		{
			System.out.println("The Tree is Empty");
		}
		else
		{
			if(node.left!=null)
			{
				inordertraverse(node.left);
			}
			
			System.out.print(node.data);
			System.out.print(" ");
			
			if(node.right!=null)
			{
				inordertraverse(node.right);
			}
			
			
		}
		
		
	}
	
	public void preordertraverse(Node node)
	{
		if(node==null)
		{
			System.out.println("The Tree is Empty");
		}
		else
		{
			System.out.print(node.data);
			System.out.print(" ");
			
			if(node.left!=null)
			{
				inordertraverse(node.left);
			}
			
			if(node.right!=null)
			{
				inordertraverse(node.right);
			}
			
			
		}
		
	}

	public void postordertraverse(Node node)
	{
		if(node==null)
		{
			System.out.println("The Tree is Empty");
		}
		else
		{
			if(node.left!=null)
			{
				inordertraverse(node.left);
			}
			
			if(node.right!=null)
			{
				inordertraverse(node.right);
			}
			
			System.out.print(node.data);
			System.out.print(" ");
			
			
		}
		
	}
	
	public Node minnode(Node node)
	{
		if(node.left!=null)
		{
			return minnode(node.left);
		}
		else
		{
			return node;
			
		}
	}
	
	public Node deletenode(Node node, int value)
	{
		if(node==null)
		{
			System.out.println("Tree is Empty");
			
		}
		else
		{
			if(value>node.data)
			{
				node.right=deletenode(node.right,value);
			}
			else if(value<node.data)
			{
				node.left=deletenode(node.left,value);
				
			}
			else
			{
				if(node.left==null && node.right==null) //..Leaf Node (No Child)
				{
					node=null;
				}
				else if(node.left==null) //..Only Right Child
				{
					node=node.right;
				}
				else if(node.right==null) //..Only Left Child
				{
					node=node.left;
				}
				else //...Having both (Left + Right) Children
				{
					Node temp = minnode(node.right);
					node.data=temp.data;
					node.right=deletenode(node.right,temp.data);
					
				}
			}
			
			
		}
		
		return node;
	}
	
	public int height(Node root)
	{
		 int leftcount=0,rightcount=0;
         if(root.right==null && root.left==null)
         {
             System.out.println("The Height of the Binary Tree is 0");
         }
         else
         { 
             Node cur=root;
             while(true)
             {
                 if(cur.left!=null)
                 {
                     leftcount++;
                     cur=cur.left;
                 }
                 else
                 {
                     if(root.right!=null)
                     {
                         rightcount++;
                         root=root.right;
                     }
                     else
                     {
                         break;
                     }
                     
                 }
                 
             }
             
             
         }
         
         if(leftcount>rightcount)
         {
             return leftcount;
         }
         else
         {
             return rightcount;
         }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeDemo obj = new BinaryTreeDemo();
		
		//..Insertion...//
		obj.insert(5);
		obj.insert(3);
		obj.insert(7);
		obj.insert(10);
		obj.insert(25);
		
		//..Height...//
		System.out.println("The Height of the Binary Tree is:"+obj.height(obj.root));
		
		//..Traverse....//
		System.out.println("Inorder Traversing:");
		obj.inordertraverse(obj.root);
		
		System.out.print("\n");
		System.out.println("Preorder Traversing:");
		obj.preordertraverse(obj.root);
		
		System.out.print("\n");
		System.out.println("Postorder Traversing:");
		obj.postordertraverse(obj.root);
		
		//..Delete..//
		System.out.print("\n");
		System.out.println("After deleting 3");
		obj.deletenode(obj.root,3);
		
		//..Traverse....//
		System.out.println("Inorder Traversing:");
		obj.inordertraverse(obj.root);
		
		System.out.print("\n");
		System.out.println("Preorder Traversing:");
		obj.preordertraverse(obj.root);
		
		System.out.print("\n");
		System.out.println("Postorder Traversing:");
		obj.postordertraverse(obj.root);
		
		//..Delete..//
		System.out.print("\n");
		System.out.println("After deleting 7");
		obj.deletenode(obj.root,7);
		
		//..Traverse....//
		System.out.println("Inorder Traversing:");
		obj.inordertraverse(obj.root);
		
		System.out.print("\n");
		System.out.println("Preorder Traversing:");
		obj.preordertraverse(obj.root);
		
		System.out.print("\n");
		System.out.println("Postorder Traversing:");
		obj.postordertraverse(obj.root);
		
		//..Delete..//
		System.out.print("\n");
		System.out.println("After deleting 5");
		obj.deletenode(obj.root,5);
		
		//..Traverse....//
		System.out.println("Inorder Traversing:");
		obj.inordertraverse(obj.root);
		
		System.out.print("\n");
		System.out.println("Preorder Traversing:");
		obj.preordertraverse(obj.root);
		
		System.out.print("\n");
		System.out.println("Postorder Traversing:");
		obj.postordertraverse(obj.root);

	}

}
