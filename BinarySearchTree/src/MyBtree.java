public class MyBtree {

	Bstnode root;

	public MyBtree() {
		root = null;
	}

	public void insertBtree(int k, int data) {
		Bstnode temp = new Bstnode(k, data);
		if (root == null) {
			root = temp;
			temp.display();
		} else {
			Bstnode current = root;
			Bstnode parent;

			while (true) {
				parent = current;
				if (k < current.key) {
					current = current.left;
					if (current == null) {
						parent.left = temp;
						temp.display();
						return;
					}
				}
				else{
					current = current.right;
					if (current == null) {
						parent.right = temp;
						temp.display();
						return;
					}
				}
			}
		}

	}

	/*
	 * public int findData(int k) { Bstnode temp = root; if (temp.key == k) {
	 * temp.display(); return temp.data; } else { while (true) { if (k <
	 * temp.key) { temp = temp.left; if (temp == null) {
	 * System.out.println("Key not found"); return 0; } else if (k == temp.key)
	 * { temp.display(); return temp.data; } } else if (k > temp.key) { temp =
	 * temp.right; if (temp == null) { System.out.println("Key not found");
	 * return 0; } else if (k == temp.key) { temp.display(); return temp.data; }
	 * }
	 * 
	 * } } }
	 */
	
	public int find(int k) // find node with given key
	{ // (assumes non-empty tree)
		Bstnode current = root; // start at root
		while (current.key != k) // while no match,
		{
			if (k < current.key) // go left?
				current = current.left;
			else
				current = current.right; // or go right?
			if (current == null) // if no child,
				System.out.println("Key not found");
				return 0; // didn't find it
		}
		current.display();
		return current.data; // found it
	}
}
