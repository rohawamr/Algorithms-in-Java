
public class Node {

	public int data;
	public Node next;
	
	public Node(int d,Node n)
	{
		data=d;
		next=n;
	}
	public void displayNode()
	{
		System.out.printf("\t%d",data);
	}
}

