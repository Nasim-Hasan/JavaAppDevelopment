/**
 * 
 */
package doubleWayLinkList;

/**
 * @author nhasa
 *
 */
class Node
{
  int data;
  Node next;
  Node prev;
  
  Node(int data)
  {
	  this.data=data;
	  this.next=null;
	  this.prev=null;
  }

}


public class DoubleWayLinkList {

  public Node head;
  public Node tail;
  public Node current;
  
  DoubleWayLinkList()
  {
	  head=null;
	  tail=null;
	  current=null;
  }
  
  public void addNode(int data)
  {
	  Node newNode=new Node(data);
	  
	  if(head==null)
	  {
		  head=newNode;
		  tail=newNode;
		  
	  }
	  else
	  {
		  current=tail;
		  tail.next=newNode;
		  tail=newNode;
		  tail.prev=current;
		  
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
		  System.out.println("Double Way Link List is:");
		  
		  while(head!=null)
		  {
			  System.out.print(head.data);
			  System.out.print(" ");
			  head=head.next;
			  
		  }
		  
		  System.out.print("\n");
		  
		  while(tail!=null)
		  {
			  System.out.print(tail.data);
			  System.out.print(" ");
			  tail=tail.prev;
			  
		  }
		  
		  
	  }
	  
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleWayLinkList objDoubleWayLinkList= new DoubleWayLinkList();
		
		//...Adding Nodes...//
		objDoubleWayLinkList.addNode(1);
		objDoubleWayLinkList.addNode(2);
		objDoubleWayLinkList.addNode(3);
		objDoubleWayLinkList.addNode(4);
		
		//..Displaying Nodes..//
		objDoubleWayLinkList.display();
		

	}

}
