
public class implementQ {
public static void main(String[] args) {
	Queue1 theQueue = new Queue1(5); // queue holds 5 items
	theQueue.insertQ(10); // insert 4 items
	theQueue.insertQ(20);
	theQueue.insertQ(30);
	theQueue.insertQ(40);
	System.out.println(theQueue.delQ()); // remove 3 items
	System.out.println(theQueue.delQ()); // (10, 20, 30)
	System.out.println(theQueue.delQ());
	theQueue.insertQ(50); // insert 4 more items
	theQueue.insertQ(60); // (wraps around)
	theQueue.insertQ(70);
	theQueue.insertQ(80);

	theQueue.insertQ(75);
	while( !theQueue.isemp() ) // remove and display
	{ // all items
	int n = theQueue.delQ(); // (40, 50, 60, 70, 80)
	System.out.print(n);
	System.out.print(" ");
	}
	theQueue.delQ();
	System.out.println("");
	
	
}
}
