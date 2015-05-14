public class Mylinkedlist {

	private Node head;
	private int data;

	public Mylinkedlist() {
		head = null;
	}

	public boolean isEmp() {
		return head == null;
	}

	public void insert(int d, int p) {
		data = d;
		Node temp = new Node(data, null);
		if (p == 1) {
			temp.next = head;
			head = temp;
		} else {
			Node temp2 = head;
			for (int i = 0; i < p - 2; i++) {
				
				temp2 = temp2.next;
			
				
			}
			temp.next = temp2.next;
			temp2.next = temp;
		}

	}
	public void displayLL()
	{
		Node temp=head;
		System.out.println();

		while(temp!=null)
		{
			temp.displayNode();
			temp=temp.next;
		}
	}
	
	public Node delete(int p)
	{
		Node temp2=head;
		if(p==1)
		{
		
			head=temp2.next;
			return temp2;
		
		}
		else{
		for (int i = 0; i < p - 2; i++) 
		{
			//if(temp2.next!=null)
			temp2 = temp2.next;
			//else
				//System.out.println("Cannot delete as no.of elements are lower than the position.");
				//return null;
		}
		Node temp=temp2.next;
		temp2.next=temp.next;
		return temp;
		}
	}

}
