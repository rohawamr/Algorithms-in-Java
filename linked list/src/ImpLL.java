
public class ImpLL {
public static void main(String[] args) {
	Mylinkedlist theList = new Mylinkedlist(); // make new list
	theList.insert(2, 1);// insert four items
	theList.displayLL(); //

	theList.insert(4, 2);
	theList.displayLL(); //

	theList.insert(1, 2);
	theList.displayLL(); //

	theList.insert(0, 3);

	theList.displayLL(); //
	theList.delete(1);
	theList.displayLL(); //
	theList.delete(3);

	theList.displayLL(); //

	theList.insert(7, 3);
	theList.displayLL(); //

}
}
