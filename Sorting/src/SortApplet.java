public class SortApplet {
	public static void main(String[] args) {
		int maxSize = 10; // array size
		Sort arr; // reference to array
		arr = new Sort(maxSize); // create the array
		arr.insert(99);
		arr.insert(88);
		arr.insert(77); // insert 10 items
		arr.insert(66);
		arr.insert(55);
		arr.insert(44);
		arr.insert(33);
		arr.insert(22);
		arr.insert(11);
		arr.insert(00);
		arr.display(); // display items
		//arr.Bubblesort(); // bubble sort them
		//arr.display(); // display them again
		//arr.SelectionSort();
		//arr.InsertionSort();
		arr.ShellSort();
		arr.display();
	} // end main()
} // end class BubbleSortApp

