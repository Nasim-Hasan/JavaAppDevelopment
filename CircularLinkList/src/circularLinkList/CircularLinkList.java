/**
 * 
 */
package circularLinkList;

/**
 * @author nhasa
 *
 */

class Node
{
   int data;
   Node next;
   
   Node(int data)
   {
	   this.data=data;
	   this.next=null;
	   
   }


}

public class CircularLinkList {

	public Node head;
	public Node tail;
	public Node prihead;
	
	CircularLinkList()
	{
		head=null;
		tail=null;
		prihead=null;
		
	}
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			prihead=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			
		}
		
		
	}
	
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("Link List is Empty");
		}
		else
		{
			System.out.print("Circular Link List is:");
			
			while(head!=null)
			{
				System.out.print(head.data);
				System.out.print(" ");
				head=head.next;
			}
			
			System.out.print(prihead.data);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkList objCircularLinkList = new CircularLinkList();
		
		//..Adding Nodes...//
		objCircularLinkList.addNode(1);
		objCircularLinkList.addNode(2);
		objCircularLinkList.addNode(3);
		objCircularLinkList.addNode(4);
		objCircularLinkList.addNode(5);
		objCircularLinkList.addNode(6);
		
		//..Displaying Nodes...//
		objCircularLinkList.display();

	}

}
