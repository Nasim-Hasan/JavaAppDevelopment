/**
 * 
 */
package singleWayLinkList;

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

public class SingleWayLinkList {

	/**
	 * @param args
	 */
	public Node head;
	public Node tail;
	
	
	SingleWayLinkList()
	{
		head=null;
		tail=null;
	}
	
	public void addNode(int data)
	{
		Node newNode= new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			
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
			System.out.print("Single Way Link List is:");
			
			while(head!=null)
			{
				System.out.print(head.data);
				System.out.print(" ");
				head=head.next;
				
			}
			
			
		}
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleWayLinkList objSingleWayLinkList = new SingleWayLinkList();
		
		//...Adding Nodes...//
		objSingleWayLinkList.addNode(1);
		objSingleWayLinkList.addNode(2);
		objSingleWayLinkList.addNode(3);
		objSingleWayLinkList.addNode(4);
		
		//..Displaying Nodes..//
		objSingleWayLinkList.display();
		
    }
}
