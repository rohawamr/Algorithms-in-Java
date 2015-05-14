
public class stackimp {
	
	public static void main(String[] args)
	{
	Stack1 theStack = new Stack1(5); // make new stack
	theStack.push(20); // push items onto stack
	theStack.push(40);
	theStack.push(60);
	theStack.push(80);
	theStack.push(90);
	theStack.push(100);

	while( !theStack.isemp() ) // until it's empty,
	{ // delete item from
	
	int value = theStack.pop();
	System.out.print(value); // display it
	System.out.print(" ");
	} // end while
	System.out.println("");
	} // end main()
	/*public void whenfull()
	{
		int i=0;
		Stack1 s1=new Stack1(size*2);
		while(!theStack.isemp())
		s1.push(i);
	}
	*/
}
