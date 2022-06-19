public class SignlyLinkedList
{
	static Node Head;
	
	static class Node
	{
		private  int data;
		private  Node Next;
		
		public Node(int value)
		{
			data = value;
			Next = null;
		}

	}
	
	public void insertatBegining(int d)
	{
		Node newnode = new Node(d) ;
		newnode.Next=Head;
		Head = newnode;
		
	}		

	public void display()
	{
		Node current = Head;
		while(current!=null)
		{
			System.out.print(current.data+"  ");	
			current = current.Next; 
		}
	
	}
	
	public int size()
	{             
		int counter =0;
		Node current= Head;
		while(current!=null)
		{
			counter++;
			current =current.Next; 
		}
		
		return counter;
	}

	public static void main(String args[])
	{
		SignlyLinkedList obj = new SignlyLinkedList();
	    Node First = new Node(10);
	    Node second = new Node(20);
	    Node third = new Node(30);
	    Node fourth = new Node (40);
		
		// Connections
		Head = First;
		Head.Next=second;
		second.Next=third;
		third.Next=fourth;

		obj.display();		
		System.out.println("\nThe size of ListNode is "+ obj.size());	
		
		obj.insertatBegining(500);
		System.out.println("After Addition new Node at Begining");
		obj.display();		
	
	}


}