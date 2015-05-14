
public class Stack1 {

	private int size;
	private int[] s;
	private int top;
	
	public Stack1(int maxsize)
	{
		size=maxsize;
		s= new int[size];
		top=-1;
	}
	
	public void push(int key)
	{
		if(!isfull())
		{
		top=top+1;
		s[top]=key;
		}
		else
			System.out.println("Stack is full..");
		
		
	}
	public int pop()
	{
		if(!isemp())
		{int temp=top;
		top--;
		return s[temp];}
		else
			System.out.println("Stack is empty..");
		return 0;
	}
	public boolean isemp()
	{
		return top==-1;
	}
	public boolean isfull()
	{
		return top==size-1;
	}
	
}
